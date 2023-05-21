/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.ExamenBucal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExamenBucalModelImpl implements IExamenBucalModel{
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(ExamenBucal examenBucal) {
        
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(examenBucal);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<ExamenBucal> obtenerRegistros() {
           List<ExamenBucal> listaExamenBucal = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaExamenBucal = s.createCriteria(ExamenBucal.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaExamenBucal;
    }

    @Override
    public void eliminarRegistro(ExamenBucal examenBucal) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(examenBucal);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public ExamenBucal obtenerRegistro(int id_examen_bucal) {
           ExamenBucal examenBucal = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            examenBucal = s.get(ExamenBucal.class, id_examen_bucal);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return examenBucal;
    }

    @Override
    public void actualizarRegistro(ExamenBucal examenBucal) {
         try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(examenBucal);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
