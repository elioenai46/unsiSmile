/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para Alumno, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Alumnos;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AlumnosModellmpl implements IAlumnosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Alumnos alumnos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("InsertarAlumno");

            sp.registerStoredProcedureParameter("nombre", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("nombre2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("apellido2", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("sexo", char.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("curp", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("fk_id_semestre_grupo", Integer.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("matricula", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("email_alumno", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("f_id_catedratico_responsable", Integer.class, ParameterMode.IN);
            System.out.println("procedure 22222222222222");

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("nombre", alumnos.getNombre());
            sp.setParameter("nombre2", alumnos.getNombre2());
            sp.setParameter("apellido", alumnos.getApellido());
            sp.setParameter("apellido2", alumnos.getApellido2());
            sp.setParameter("sexo", alumnos.getSexo());
            sp.setParameter("curp", alumnos.getCurp());
            sp.setParameter("fk_id_semestre_grupo", alumnos.getFkIdSemestreGrupo().getIdSemestreGrupo());
            sp.setParameter("matricula", alumnos.getMatricula());
            sp.setParameter("telefono", alumnos.getTelefono());
            sp.setParameter("email_alumno", alumnos.getEmailAlumno());
            sp.setParameter("f_id_catedratico_responsable", alumnos.getFIdCatedraticoResponsable().getIdCatedratico());

            sp.execute();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Alumnos> obtenerRegistros() {
        List<Alumnos> listaAlumnos = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaAlumnos = s.createCriteria(Alumnos.class).list();
            System.out.println("Tamaño: " + listaAlumnos.size());
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro---: " + e.getMessage());
        }
        return listaAlumnos;
    }

    @Override
    public void eliminarRegistro(Alumnos alumnos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("eliminarAlumno");
            sp.registerStoredProcedureParameter("id_alumno", Integer.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("id_alumno", alumnos.getIdAlumno());

            // Ejecutar procedimiento almacenado
            sp.execute();

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Alumnos obtenerRegistro(int idAlumnos) {
        Alumnos alumnos = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            StoredProcedureQuery sp = s.createStoredProcedureQuery("obtenerAlumno");
            sp.registerStoredProcedureParameter("id_alumno", int.class, ParameterMode.IN);
            //cargar los datos de entrada al procedure
            sp.setParameter("id_alumno", idAlumnos);
            //Ejecuta el procedimiento
            sp.execute();

            List<Object[]> registros = sp.getResultList();
            alumnos = new Alumnos();

            //Verificar si las lista de registros no está vacia
            if (!registros.isEmpty()) {
                Object[] row = registros.get(0);
                alumnos.setNombre((row[0] == null) ? "" : (row[0]).toString());
                alumnos.setNombre2((row[1] == null) ? "" : (row[1]).toString());
                alumnos.setApellido((row[2] == null) ? "" : (row[2]).toString());
                alumnos.setApellido2((row[3] == null) ? "" : (row[3]).toString());
                alumnos.setEmailAlumno((row[4] == null) ? "" : (row[4]).toString()); 
                alumnos.setSexo((row[5] == null) ? '\0' : (row[5].toString().charAt(0)));
                //alumnos.set((row[6] == null) ? "" : (row[6]).toString());    
            }

            alumnos = s.get(Alumnos.class, idAlumnos);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return alumnos;
    }

    @Override
    public void actualizarRegistro(Alumnos alumnos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(alumnos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
