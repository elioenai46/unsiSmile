/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.AntecedentesHeredofamiliares;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AntecedentesHeredofamiliaresModelImpl implements IAntecedentesHeredofamiliaresModel{
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(antecedentesHeredofamiliares);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<AntecedentesHeredofamiliares> obtenerRegistros() {
        List<AntecedentesHeredofamiliares> listaAntecedentesHeredofamiliarese = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaAntecedentesHeredofamiliarese = s.createCriteria(AntecedentesHeredofamiliares.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaAntecedentesHeredofamiliarese;
    }

    @Override
    public void eliminarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
         try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(antecedentesHeredofamiliares);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public AntecedentesHeredofamiliares obtenerRegistro(int id_antecedentes_heredofamiliares) {
        AntecedentesHeredofamiliares antecedentesHeredofamiliares = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            antecedentesHeredofamiliares = s.get(AntecedentesHeredofamiliares.class, id_antecedentes_heredofamiliares);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return antecedentesHeredofamiliares;
    }

    @Override
    public void actualizarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(antecedentesHeredofamiliares);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
    
}
