/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementDienteDetalleModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DienteDetalleModelImpl implements IDienteDetalleModel{
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(DienteDetalle DienteDetalle) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(DienteDetalle);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<DienteDetalle> obtenerRegistros() {
        List<DienteDetalle> listaDienteDetalle = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaDienteDetalle= s.createCriteria(DienteDetalle.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaDienteDetalle;
    }

    @Override
    public void eliminarRegistro(DienteDetalle DienteDetalle) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(DienteDetalle);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public DienteDetalle obtenerRegistro(int id) {
        DienteDetalle DD = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            DD = s.get(DienteDetalle.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return DD;
    }

    @Override
    public void actualizarRegistro(DienteDetalle DienteDetalle) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(DienteDetalle);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
