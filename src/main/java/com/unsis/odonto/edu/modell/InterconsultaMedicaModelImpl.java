/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementInterconsultaMedicaModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.InterconsultaMedica;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class InterconsultaMedicaModelImpl implements IInterconsultaMedicaModel{
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(InterconsultaMedica InterconsultaMedica) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(InterconsultaMedica);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<InterconsultaMedica> obtenerRegistros() {
        List<InterconsultaMedica> listaInterconsultaMedica = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaInterconsultaMedica= s.createCriteria(InterconsultaMedica.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaInterconsultaMedica;
    }

    @Override
    public void eliminarRegistro(InterconsultaMedica InterconsultaMedica) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(InterconsultaMedica);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public InterconsultaMedica obtenerRegistro(int id) {
        InterconsultaMedica inter = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            inter = s.get(InterconsultaMedica.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return inter;
    }

    @Override
    public void actualizarRegistro(InterconsultaMedica InterconsultaMedica) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(InterconsultaMedica);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
