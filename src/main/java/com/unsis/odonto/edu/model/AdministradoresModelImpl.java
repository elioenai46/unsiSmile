/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 16 de mayo de 2023
 * Descripción: clase model para administradores, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.service.AdministradorServiceImpl;
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
    
    
    /**
     * método que retorna una lista de administradores, usuando HQL y un
     * procedimiento almacenado llamado 'obtenerTodosAdministradores'
     * @return 
     */
    @Override
    public List<Administradores> obtenerRegistros() {
        
        List<Administradores> listaAdministradores = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerTodosAdministradores", Administradores.class);
            sp.execute();

            listaAdministradores = sp.getResultList();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaAdministradores;

    }
    

    @Override
    public void eliminarRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("eliminarAdministrador");
            sp
                    .registerStoredProcedureParameter("id_administrador", Integer.class,
                             ParameterMode.IN);
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
            sp
                    .registerStoredProcedureParameter("id_admin", int.class,
                             ParameterMode.IN);

            // Cargar los datos de entrada al procedure
            sp.setParameter("id_admin", idAdministrador);

            // Ejecutar el procedimiento
            sp.execute();

            List<Object[]> registros = sp.getResultList();
            administradores = new Administradores();

            // Verificar si la lista de registros no está vacía
            if (!registros.isEmpty()) {
                Object[] row = registros.get(0);

                administradores.setIdAdministrador(idAdministrador);
                administradores.setNombre1((row[0] == null) ? "" : (row[0]).toString());
                administradores.setNombre2((row[1] == null) ? "" : (row[1]).toString());
                administradores.setApellido1((row[2] == null) ? "" : (row[2]).toString());
                administradores.setApellido2((row[3] == null) ? "" : (row[3]).toString());
                administradores.setCurp((row[4] == null) ? "" : (row[4]).toString());
                administradores.setTelefono((row[5] == null) ? "" : (row[5]).toString());
                administradores.setNumeroTrabajador((row[6] == null) ? "" : (row[6]).toString());
                String fecha = (row[7]).toString();
                LocalDate fechanac = LocalDate.parse(fecha);
                administradores.setFechaNacimiento((row[7] == null) ? LocalDate.of(0,0,0) : fechanac);
                administradores.setSexo((row[8] == null) ? '\0' : (row[8].toString().charAt(0)));
                administradores.setEmailAdmin((row[9] == null) ? "" : (row[9]).toString());
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
            StoredProcedureQuery sp = s.createStoredProcedureQuery("actualizarAdministrador");
            
            sp.registerStoredProcedureParameter("id_adminAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre1Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre2Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido1Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido2Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("curpAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefonoAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("numero_trabajadorAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("fecha_nacimientoAux", LocalDate.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("sexoAux", Character.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("email_adminAux", String.class, ParameterMode.IN);

            System.out.println("insertar ");
            // Establecer parámetros del procedimiento almacenado

            sp.setParameter("id_adminAux", administradores.getIdAdministrador());
            sp.setParameter("nombre1Aux", administradores.getNombre1());
            sp.setParameter("nombre2Aux", administradores.getNombre2());
            sp.setParameter("apellido1Aux", administradores.getApellido1());
            sp.setParameter("apellido2Aux", administradores.getApellido2());
            sp.setParameter("curpAux", administradores.getCurp());
            sp.setParameter("telefonoAux", administradores.getTelefono());
            sp.setParameter("numero_trabajadorAux", administradores.getNumeroTrabajador());
            sp.setParameter("fecha_nacimientoAux", administradores.getFechaNacimiento());
            sp.setParameter("sexoAux", administradores.getSexo());
            sp.setParameter("email_adminAux", administradores.getEmailAdmin());
            
            //ejecutar el proceso
            sp.execute();
//            s.beginTransaction();
//            s.update(administradores);
//            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
