/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.AnalisisRadiografico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AnalisisRadiograficoModelImpl implements IAnalisisRadiograficoModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(AnalisisRadiografico analisisRadiografico) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(analisisRadiografico);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
    @Override
    public List<AnalisisRadiografico> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /*
    public List<AnalisisRadiografico> obtenerRegistros(int id_AnalisisRadiografico) {
         AnalisisRadiografico analisisRadiografico = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            analisisRadiografico = s.get(AnalisisRadiografico.class, id_AnalisisRadiografico);//corregir
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return analisisRadiografico;
    }
     */
    @Override
    public void eliminarRegistro(AnalisisRadiografico analisisRadiografico) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(analisisRadiografico);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public AnalisisRadiografico obtenerRegistro(int id_AnalisisRadiografico) {
        AnalisisRadiografico analisisRadiografico = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            analisisRadiografico = s.get(AnalisisRadiografico.class, id_AnalisisRadiografico);//corregir
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return analisisRadiografico;
    }

    @Override
    public void actualizarRegistro(AnalisisRadiografico analisisRadiografico) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(analisisRadiografico);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}
