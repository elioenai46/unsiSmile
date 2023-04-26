/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para catedraticos, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.modell;

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
            listaCatedraticos = s.createCriteria(Catedraticos.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
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
            catedraticos = s.get(Catedraticos.class, idCatedratico);
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
