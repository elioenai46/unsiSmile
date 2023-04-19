/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.AnalisisFuncional;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AnalisisFuncionalModelImpl implements IAnalisisFuncionalModel {
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(AnalisisFuncional analisisFuncional) {
        
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(analisisFuncional);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }

    }

    @Override
    public List<AnalisisFuncional> obtenerRegistros() {
        List<AnalisisFuncional> listaAnalisisFuncional = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaAnalisisFuncional = s.createCriteria(AnalisisFuncional.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return listaAnalisisFuncional;
    }

    @Override
    public void eliminarRegistro(AnalisisFuncional analisisFuncional) {
         try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(analisisFuncional);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public AnalisisFuncional obtenerRegistro(int id_analisis_funcional) {
          AnalisisFuncional analisisFuncional = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            analisisFuncional = s.get(AnalisisFuncional.class, id_analisis_funcional);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return analisisFuncional;
    }

    @Override
    public void actualizarRegistro(AnalisisFuncional analisisFuncional) {
         try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(analisisFuncional);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }
    
}
