/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementPiezasDentalesModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.PiezasDentales;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PiezasDentalesModelImpl implements IPiezasDentalesModel{
    private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(PiezasDentales PiezasDentales) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(PiezasDentales);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<PiezasDentales> obtenerRegistros() {
        List<PiezasDentales> listaPiezas = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaPiezas= s.createCriteria(PiezasDentales.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaPiezas;
    }

    @Override
    public void eliminarRegistro(PiezasDentales PiezasDentales) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(PiezasDentales);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public PiezasDentales obtenerRegistro(int id) {
        PiezasDentales pieza = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            pieza = s.get(PiezasDentales.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return pieza;
    }

    @Override
    public void actualizarRegistro(PiezasDentales PiezasDentales) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(PiezasDentales);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
