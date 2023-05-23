/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para catedraticos, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Catedraticos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CatedraticosModelImpl implements ICatedraticosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("insertarCatedratico");
            sp.registerStoredProcedureParameter("nombre", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("curp", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("sexo", Character.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("fecha_nacimiento", LocalDate.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("numero_trabajador", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("mail", String.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("nombre", catedraticos.getNombre());
            sp.setParameter("nombre2", catedraticos.getNombre2());
            sp.setParameter("apellido", catedraticos.getApellido());
            sp.setParameter("apellido2", catedraticos.getApellido2());
            sp.setParameter("curp", catedraticos.getCurp());
            sp.setParameter("telefono", catedraticos.getTelefono());
            sp.setParameter("sexo", catedraticos.getSexo());
            sp.setParameter("fecha_nacimiento", catedraticos.getFechaNacimiento());
            sp.setParameter("numero_trabajador", catedraticos.getNumeroTrabajador());
            sp.setParameter("mail", catedraticos.getEmailCatedratico());

            // Ejecutar procedimiento almacenado
            sp.execute();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Catedraticos> obtenerRegistros() {
        List<Catedraticos> listaCatedraticos = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerTodosCatedraticos", Catedraticos.class);
            sp.execute();

            listaCatedraticos = sp.getResultList();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaCatedraticos;
    }

    @Override
    public void eliminarRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("eliminarCatedratico");
            sp.registerStoredProcedureParameter("idCatedraticos", Integer.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("idCatedraticos", catedraticos.getIdCatedratico());

            // Ejecutar procedimiento almacenado
            sp.execute();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Catedraticos obtenerRegistro(int idCatedratico) {
        Catedraticos catedraticos = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerCatedratico");
            sp.registerStoredProcedureParameter("id_cat", int.class, ParameterMode.IN);
            //cargar los datos de entrada al procedure
            sp.setParameter("id_cat", idCatedratico);
            //Ejecuta el procedimiento
            sp.execute();
            //catedraticos = s.get(Catedraticos.class, idCatedratico);
            List<Object[]> registros = sp.getResultList();
            catedraticos = new Catedraticos();
            //Verificar si las lista de registros no está vacia
            if (!registros.isEmpty()) {
                Object[] row = registros.get(0);
                //catedraticos.setIdCatedratico((row[0] == null) ? 0 : Integer.parseInt((row[0]).toString()));
                catedraticos.setNombre((row[0] == null) ? "" : (row[0]).toString());
                catedraticos.setNombre2((row[1] == null) ? "" : (row[1]).toString());
                catedraticos.setApellido((row[2] == null) ? "" : (row[2]).toString());
                catedraticos.setApellido2((row[3] == null) ? "" : (row[3]).toString());
                catedraticos.setCurp((row[4] == null) ? "" : (row[4]).toString());
                catedraticos.setTelefono((row[5] == null) ? "" : (row[5]).toString());
                catedraticos.setSexo((row[6] == null) ? '\0' : (row[6].toString().charAt(0)));
                String fecha = (row[7]).toString();
                LocalDate fechanac = LocalDate.parse(fecha);
                catedraticos.setFechaNacimiento((row[7] == null) ? LocalDate.of(0,0,0) : fechanac);
                catedraticos.setNumeroTrabajador((row[8] == null) ? "" : (row[8]).toString());
                catedraticos.setEmailCatedratico((row[9] == null) ? "" : (row[9]).toString());
                
            }

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener un registro: " + e.getMessage());
        }
        return catedraticos;
    }

    @Override
    public void actualizarRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(catedraticos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
