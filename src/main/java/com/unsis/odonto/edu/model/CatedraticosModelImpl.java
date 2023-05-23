/**
 * Autor: Oscar Funtes Alvarado
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 23 mayo de 2023
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

            System.out.println("insertar datos catedraticos ");
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
            sp.registerStoredProcedureParameter("id_catedratico", int.class, ParameterMode.IN);
            //Cargar los datos de entreda al procedure
            sp.setParameter("id_catedratico", idCatedratico);
            //Ejecuta el procedimiento
            sp.execute();

            List<Object[]> registros = sp.getResultList();
            catedraticos = new Catedraticos();

            //Verificar si las lista de registros no está vacia
            if (!registros.isEmpty()) {
                Object[] row = registros.get(0);
                catedraticos.setIdCatedratico((row[0] == null) ? 0 : Integer.parseInt((row[0]).toString()));
                catedraticos.setNombre((row[1] == null) ? "" : (row[1]).toString());
                catedraticos.setNombre2((row[2] == null) ? "" : (row[2]).toString());
                catedraticos.setApellido((row[3] == null) ? "" : (row[3]).toString());
                catedraticos.setApellido2((row[4] == null) ? "" : (row[4]).toString());
                catedraticos.setCurp((row[5] == null) ? "" : (row[5]).toString());
                catedraticos.setTelefono((row[6] == null) ? "" : (row[6]).toString());
                catedraticos.setSexo((row[7] == null) ? '\0' : (row[7].toString().charAt(0)));
                String fecha = (row[8]).toString();
                LocalDate fechanac = LocalDate.parse(fecha);
                catedraticos.setFechaNacimiento((row[8] == null) ? LocalDate.of(0, 0, 0) : fechanac);
                catedraticos.setNumeroTrabajador((row[9] == null) ? "" : (row[8]).toString());
                catedraticos.setEmailCatedratico((row[10] == null) ? "" : (row[9]).toString());
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
            StoredProcedureQuery sp = s.createStoredProcedureQuery("actualizarCatedraticos");

            sp.registerStoredProcedureParameter("id_catedraticoAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombreAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre2Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellidoAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido2Aux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("curpAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefonoAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("sexoAux", Character.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("fecha_nacimientoAux", LocalDate.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("numero_trabajadorAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("mailAux", String.class, ParameterMode.IN);

            System.out.println("insertar catedratico");
            // Establecer parámetros del procedimiento almacenado            
            sp.setParameter("id_catedraticoAux", catedraticos.getIdCatedratico());
            sp.setParameter("nombreAux", catedraticos.getNombre());
            sp.setParameter("nombre2Aux", catedraticos.getNombre2());
            sp.setParameter("apellidoAux", catedraticos.getApellido());
            sp.setParameter("apellido2Aux", catedraticos.getApellido2());
            sp.setParameter("curpAux", catedraticos.getCurp());
            sp.setParameter("telefonoAux", catedraticos.getTelefono());
            sp.setParameter("sexoAux", catedraticos.getSexo());
            sp.setParameter("fecha_nacimientoAux", catedraticos.getFechaNacimiento());
            sp.setParameter("numero_trabajadorAux", catedraticos.getNumeroTrabajador());
            sp.setParameter("mailAux", catedraticos.getEmailCatedratico());
            //ejecutar el proceso
            sp.execute();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro del catedratico: " + e.getMessage());
        }
    }

}
