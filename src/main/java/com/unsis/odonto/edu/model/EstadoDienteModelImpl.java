/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementEstadoDienteModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.EstadoDiente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EstadoDienteModelImpl implements IEstadoDienteModel{
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(EstadoDiente EstadoDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(EstadoDiente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<EstadoDiente> obtenerRegistros() {
        List<EstadoDiente> listaEstadoDiente = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEstadoDiente= s.createCriteria(EstadoDiente.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaEstadoDiente;
    }

    @Override
    public void eliminarRegistro(EstadoDiente EstadoDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(EstadoDiente);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public EstadoDiente obtenerRegistro(int id) {
        EstadoDiente ED = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            ED = s.get(EstadoDiente.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return ED;
    }

    @Override
    public void actualizarRegistro(EstadoDiente EstadoDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(EstadoDiente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
