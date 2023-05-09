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
    public List<Paciente> obtenerRegistros() {
        List<Paciente> listapPacientes = new ArrayList<>();
        Paciente p1 = new Paciente();
        String date, date2;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            
            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerPacientePorAlumno");
            sp.registerStoredProcedureParameter("id_alum", Integer.class, ParameterMode.IN);
            
            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("id_alum", 1);
            
            // Ejecutar procedimiento almacenado
            sp.execute();
            
            // Obtener los resultados de la consulta
            List<Object[]> registroP =  sp.getResultList();
            
            // Recorrer los registros y agregarlos a la lista listapPacientes
            for(Object[] rP : registroP){
                
                //System.out.println("Datos: " + rP[1].toString());
                //Object[] row = registroP.get(0);
                p1.setIdPaciente((rP[0] == null) ? Integer.valueOf("1") : Integer.parseInt((rP[0]).toString()));
                p1.setNombre1((rP[1] == null) ? "" : (rP[1]).toString());
                p1.setNombre2((rP[2] == null) ? "" : (rP[2]).toString());
                p1.setApellido1((rP[3] == null) ? "" : (rP[3]).toString());
                p1.setApellido2((rP[4] == null) ? "" : (rP[4]).toString());
                p1.setSexo((rP[5] == null) ? '\0' : (rP[5]).toString().charAt(0));
                p1.setGrupoEtnico((rP[6] == null) ? "" : (rP[6]).toString());
                p1.setOcupacion((rP[7] == null) ? "" : (rP[7]).toString());
                System.out.println("fecha"+rP[8].toString());
                date = rP[8].toString();
                LocalDate ld = LocalDate.parse(date);
                p1.setFechaNacimiento((rP[8] == null) ? LocalDate.of(2000,05,15) : ld);
                p1.setEstadoCivil((rP[10] == null) ? "" : (rP[10]).toString());
                date2 = rP[12].toString();
                LocalDate ld2 = LocalDate.parse(date2);
                p1.setFechaIngreso((rP[12] == null) ? LocalDate.of(0, Month.MARCH, 0) : ld2);
                p1.setNacionalidad((rP[13] == null) ? "" : (rP[13]).toString());
                p1.setLocalidad((rP[14] == null) ? "" : (rP[14]).toString());
                boolean x = Boolean.parseBoolean((rP[15]).toString());
                p1.setEstatus((rP[15] == null) ? true : x);
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

}
