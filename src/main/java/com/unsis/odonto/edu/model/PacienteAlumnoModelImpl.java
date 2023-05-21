/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para PacienteAlumno, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */

package com.unsis.odonto.edu.model;


import com.unsis.odonto.edu.entity.PacienteAlumno;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labingsw03
 */
public class PacienteAlumnoModelImpl implements IPacienteAlumnoModel{
 private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(PacienteAlumno pacienteAlumno) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(pacienteAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<PacienteAlumno> obtenerRegistros() {
        List<PacienteAlumno> listaPacienteAlumnos = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaPacienteAlumnos = s.createCriteria(PacienteAlumno.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return listaPacienteAlumnos;
    }

    @Override
    public void eliminarRegistro(PacienteAlumno pacienteAlumno) {
       try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(pacienteAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        } 
    
    }

    @Override
    public PacienteAlumno obtenerRegistro(int idPacienteAlumno) {
        PacienteAlumno pacienteAlumno = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            pacienteAlumno = s.get(PacienteAlumno.class, idPacienteAlumno);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return pacienteAlumno;
    }

    @Override
    public void actualizarRegistro(PacienteAlumno pacienteAlumno) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(pacienteAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }
    
}
