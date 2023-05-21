/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementEstudioDeLaboratorioBiopsiaModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EstudioDeLaboratorioBiopsiaModelImpl implements IEstudioDeLaboratorioBiopsiaModel{
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(EstudioDeLaboratorioBiopsia ELB) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(ELB);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<EstudioDeLaboratorioBiopsia> obtenerRegistros() {
        List<EstudioDeLaboratorioBiopsia> listaELB = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaELB= s.createCriteria(EstudioDeLaboratorioBiopsia.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaELB;
    }

    @Override
    public void eliminarRegistro(EstudioDeLaboratorioBiopsia ELB) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(ELB);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public EstudioDeLaboratorioBiopsia obtenerRegistro(int id) {
        EstudioDeLaboratorioBiopsia elb = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            elb = s.get(EstudioDeLaboratorioBiopsia.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return elb;
    }

    @Override
    public void actualizarRegistro(EstudioDeLaboratorioBiopsia ELB) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(ELB);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
