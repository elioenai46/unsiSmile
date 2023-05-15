/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación: 9 de mayo 2023 (Vite)
 *Descripción:clase model para Paciente, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Paciente;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PacienteModelImpl implements IPacienteModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Paciente> obtenerRegistros(Integer id) {
        List<Paciente> listapPacientes = new ArrayList<>();
        Paciente p1 = new Paciente();
        String date, date2;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            
            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerPacientePorAlumno");
            sp.registerStoredProcedureParameter("id_alum", Integer.class, ParameterMode.IN);
            
            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("id_alum", id);
            
            // Ejecutar procedimiento almacenado
            sp.execute();
            
            // Obtener los resultados de la consulta
            List<Object[]> listaRegistros =  sp.getResultList();
            
            // Recorrer los registros y agregarlos a la lista listapPacientes
            for(Object[] registroPaciente : listaRegistros){
                
                p1.setIdPaciente((registroPaciente[0] == null) ? Integer.valueOf("1") : Integer.parseInt((registroPaciente[0]).toString()));
                p1.setNombre1((registroPaciente[1] == null) ? "" : (registroPaciente[1]).toString());
                p1.setNombre2((registroPaciente[2] == null) ? "" : (registroPaciente[2]).toString());
                p1.setApellido1((registroPaciente[3] == null) ? "" : (registroPaciente[3]).toString());
                p1.setApellido2((registroPaciente[4] == null) ? "" : (registroPaciente[4]).toString());
                p1.setSexo((registroPaciente[5] == null) ? '\0' : (registroPaciente[5]).toString().charAt(0));
                p1.setGrupoEtnico((registroPaciente[6] == null) ? "" : (registroPaciente[6]).toString());
                p1.setOcupacion((registroPaciente[7] == null) ? "" : (registroPaciente[7]).toString());
                date = registroPaciente[8].toString();
                LocalDate ld = LocalDate.parse(date);
                p1.setFechaNacimiento((registroPaciente[8] == null) ? LocalDate.of(0,0,0) : ld);
                p1.setEstadoCivil((registroPaciente[10] == null) ? "" : (registroPaciente[10]).toString());
                date2 = registroPaciente[12].toString();
                LocalDate ld2 = LocalDate.parse(date2);
                p1.setFechaIngreso((registroPaciente[12] == null) ? LocalDate.of(0, Month.MARCH, 0) : ld2);
                p1.setNacionalidad((registroPaciente[13] == null) ? "" : (registroPaciente[13]).toString());
                p1.setLocalidad((registroPaciente[14] == null) ? "" : (registroPaciente[14]).toString());
                boolean x = Boolean.parseBoolean((registroPaciente[15]).toString());
                p1.setEstatus((registroPaciente[15] == null) ? true : x);
                listapPacientes.add(p1);
            }
            
            System.out.println(sp.getResultList());
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return listapPacientes;
    }
   

    @Override
    public void eliminarRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }

    }

    @Override
    public Paciente obtenerRegistro(int idPaciente) {
        Paciente paciente = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            paciente = s.get(Paciente.class, idPaciente);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return paciente;
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Paciente> obtenerRegistros() {
        List<Paciente> listapPacientes = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listapPacientes = s.createCriteria(Paciente.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
        }        return listapPacientes;
    }

}
