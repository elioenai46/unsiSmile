/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementExamenClinicoModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.ExamenClinico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ExamenClinicoModelImpl implements IExamenClinicoModel{
    private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(ExamenClinico ExamenClinico) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(ExamenClinico);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<ExamenClinico> obtenerRegistros() {
        List<ExamenClinico> listaEC = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEC= s.createCriteria(ExamenClinico.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaEC;
    }

    @Override
    public void eliminarRegistro(ExamenClinico ExamenClinico) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(ExamenClinico);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public ExamenClinico obtenerRegistro(int id) {
        ExamenClinico ec = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            ec = s.get(ExamenClinico.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return ec;
    }

    @Override
    public void actualizarRegistro(ExamenClinico ExamenClinico) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(ExamenClinico);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
