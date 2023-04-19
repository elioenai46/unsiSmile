/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementOdontogramaModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Odontograma;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OdontogramaModelImpl implements IOdontogramaModel{
    private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(Odontograma Odontograma) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(Odontograma);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<Odontograma> obtenerRegistros() {
        List<Odontograma> listaOdontograma = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaOdontograma= s.createCriteria(Odontograma.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaOdontograma;
    }

    @Override
    public void eliminarRegistro(Odontograma Odontograma) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(Odontograma);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public Odontograma obtenerRegistro(int id) {
        Odontograma odonto = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            odonto = s.get(Odontograma.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return odonto;
    }

    @Override
    public void actualizarRegistro(Odontograma Odontograma) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(Odontograma);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
