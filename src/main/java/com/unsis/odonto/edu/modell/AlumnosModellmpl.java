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
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AlumnosModellmpl implements IAlumnosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Alumnos alumnos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(alumnos);
            s.getTransaction().commit();
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
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaAlumnos;
    }

    @Override
    public void eliminarRegistro(Alumnos alumnos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(alumnos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
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
            System.out.println("Error al crear el registro: " + e.getMessage());
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
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}
