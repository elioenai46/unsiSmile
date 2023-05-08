/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para administradores, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Administradores;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdministradoresModelImpl implements IAdministradoresModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("insertarAdministrador");

            sp.registerStoredProcedureParameter("nombre1", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido1", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("curp", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("numero_trabajador", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("fecha_nacimiento", LocalDate.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("sexo", Character.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("email_admin", String.class, ParameterMode.IN);

            System.out.println("insertar ");
            // Establecer parámetros del procedimiento almacenado

            sp.setParameter("nombre1", administradores.getNombre1());
            sp.setParameter("nombre2", administradores.getNombre2());
            sp.setParameter("apellido1", administradores.getApellido1());
            sp.setParameter("apellido2", administradores.getApellido2());
            sp.setParameter("curp", administradores.getCurp());
            sp.setParameter("telefono", administradores.getTelefono());
            sp.setParameter("numero_trabajador", administradores.getNumeroTrabajador());
            sp.setParameter("fecha_nacimiento", administradores.getFechaNacimiento());
            sp.setParameter("sexo", administradores.getSexo());
            sp.setParameter("email_admin", administradores.getEmailAdmin());

            // Ejecutar procedimiento almacenado
            sp.execute();

//            s.beginTransaction();
//            s.save(administradores);
//            //s.createNamedQuery("guardar()");
//            //s.
//            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Administradores> obtenerRegistros() {
        List<Administradores> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(Administradores.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("eliminarAdministrador");
            sp.registerStoredProcedureParameter("id_administrador", Integer.class, ParameterMode.IN);
            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("id_administrador", administradores.getIdAdministrador());
            // Ejecutar procedimiento almacenado
            sp.execute();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Administradores obtenerRegistro(int idAdministrador) {
        Administradores administradores = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerAdministradores");
            sp.registerStoredProcedureParameter("id_admin", int.class, ParameterMode.IN);

            // Cargar los datos de entrada al procedure
            sp.setParameter("id_admin", idAdministrador);

            // Ejecutar el procedimiento
            sp.execute();

            List<Object[]> registros = sp.getResultList();
            administradores = new Administradores();

            // Verificar si la lista de registros no está vacía
            if (!registros.isEmpty()) {
                Object[] row = registros.get(0);

                administradores.setNombre1((row[0] == null) ? "" : (row[0]).toString());
                administradores.setNombre2((row[1] == null) ? "" : (row[1]).toString());
                administradores.setApellido1((row[2] == null) ? "" : (row[2]).toString());
                administradores.setApellido2((row[3] == null) ? "" : (row[3]).toString());
                administradores.setNumeroTrabajador((row[4] == null) ? "" : (row[4]).toString());
                administradores.setSexo((row[5] == null) ? '\0' : (row[5].toString().charAt(0)));
                administradores.setEmailAdmin((row[6] == null) ? "" : (row[6]).toString());    
            }
            s.close();
            sf.close();
            return administradores;

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void actualizarRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(administradores);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
