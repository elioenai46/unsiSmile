/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementRegionDienteModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RegionDiente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class RegionDienteModelImpl implements IRegionDienteModel{
    private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(RegionDiente RegionDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(RegionDiente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<RegionDiente> obtenerRegistros() {
        List<RegionDiente> listaRegionDiente = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaRegionDiente= s.createCriteria(RegionDiente.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaRegionDiente;
    }

    @Override
    public void eliminarRegistro(RegionDiente RegionDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(RegionDiente);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public RegionDiente obtenerRegistro(int id) {
        RegionDiente region = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            region = s.get(RegionDiente.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return region;
    }

    @Override
    public void actualizarRegistro(RegionDiente RegionDiente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(RegionDiente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
