/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: clase model para semestres, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Semestres;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SemestresModelImpl implements ISemestresModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Semestres semestres) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(semestres);
            //s.createNamedQuery("guardar()");
            //s.
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Semestres> obtenerRegistros() {
        List<Semestres> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(Semestres.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(Semestres semestres) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(semestres);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Semestres obtenerRegistro(int idSemestre) {
        Semestres semestres = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            semestres = s.get(Semestres.class, idSemestre);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener un registro: " + e.getMessage());
        }
        return semestres;
    }

    @Override
    public void actualizarRegistro(Semestres semestres) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(semestres);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
