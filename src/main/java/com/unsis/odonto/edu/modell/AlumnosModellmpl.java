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
            sp.registerStoredProcedureParameter("fk_id_semestre_grupo", int.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("matricula", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("telefono", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("email_alumno", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("f_id_catedratico_responsable", int.class, ParameterMode.IN);
            System.out.println("procedure 22222222222222");

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("nombre", alumnos.getNombre());
            sp.setParameter("nombre2", alumnos.getNombre2());
            sp.setParameter("apellido", alumnos.getApellido());
            sp.setParameter("apellido2", alumnos.getApellido2());
            sp.setParameter("sexo", alumnos.getSexo());
            sp.setParameter("curp", alumnos.getCurp());
            sp.setParameter("fk_id_semestre_grupo", alumnos.getFkIdSemestreGrupo());
            sp.setParameter("matricula", alumnos.getMatricula());
            sp.setParameter("telefono", alumnos.getTelefono());
            sp.setParameter("email_alumno", alumnos.getEmailAlumno());
            sp.setParameter("f_id_catedratico_responsable", alumnos.getFIdCatedraticoResponsable());
            
            
            
            
            
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
            s.beginTransaction();
            System.out.println("ajjajjajajjajaja");

            s.delete(alumnos);
            s.getTransaction().commit();
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

    public static void main(String[] args) {
        AlumnosModellmpl a = new AlumnosModellmpl();
        a.obtenerRegistros();
    }

}
