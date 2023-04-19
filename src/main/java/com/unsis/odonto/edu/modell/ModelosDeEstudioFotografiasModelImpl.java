/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.ModelosDeEstudioFotografias;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ModelosDeEstudioFotografiasModelImpl implements IModelosDeEstudioFotografiasModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {

        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(modelosDeEstudioFotografias);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<ModelosDeEstudioFotografias> obtenerRegistros() {
        List<ModelosDeEstudioFotografias> listaModelosDeEstudioFotografias = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaModelosDeEstudioFotografias = s.createCriteria(ModelosDeEstudioFotografias.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaModelosDeEstudioFotografias;
    }

    @Override
    public void eliminarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(modelosDeEstudioFotografias);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public ModelosDeEstudioFotografias obtenerRegistro(int id) {
        ModelosDeEstudioFotografias modelosDeEstudioFotografias = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            modelosDeEstudioFotografias = s.get(ModelosDeEstudioFotografias.class, id);//corregir
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return modelosDeEstudioFotografias;
    }

    @Override
    public void actualizarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(modelosDeEstudioFotografias);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}
