/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para RolAlumno, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RolAlumno;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TECNOCITY
 */
public class RolAlumnosModelImpl implements IRolAlumnosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(RolAlumno rolAlumno) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(rolAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<RolAlumno> obtenerRegistros() {
        List<RolAlumno> listaRolAlumno = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaRolAlumno = s.createCriteria(RolAlumno.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaRolAlumno;
    }

    @Override
    public void eliminarRegistro(RolAlumno rolAlumno) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(rolAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public RolAlumno obtenerRegistro(int idRolAlumnos) {
        RolAlumno rolAlumno = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            rolAlumno = s.get(RolAlumno.class, idRolAlumnos);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return rolAlumno;
    }

    @Override
    public void actualizarRegistro(RolAlumno rolAlumno) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(rolAlumno);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}
