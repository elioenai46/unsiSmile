/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementHistoriaClinicaGeneralModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.HistoriaClinicaGeneral;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HistoriaClinicaGeneralModelImpl implements IHistoriaClinicaGeneralModel{
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(HistoriaClinicaGeneral HCG) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(HCG);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    
    }

    @Override
    public List<HistoriaClinicaGeneral> obtenerRegistros() {
        List<HistoriaClinicaGeneral> listaHCG = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaHCG= s.createCriteria(HistoriaClinicaGeneral.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaHCG;
    }

    @Override
    public void eliminarRegistro(HistoriaClinicaGeneral HCG) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(HCG);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public HistoriaClinicaGeneral obtenerRegistro(int id) {
        HistoriaClinicaGeneral hcg = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            hcg = s.get(HistoriaClinicaGeneral.class, id);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return hcg;
    }

    @Override
    public void actualizarRegistro(HistoriaClinicaGeneral HCG) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(HCG);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
