/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AntecedentesPersonalesNoPatologicosModelImpl implements IAntecedentesPersonalesNoPatologicosModel{
    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(antecedentesPersonalesNoPatologicos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<AntecedentesPersonalesNoPatologicos> obtenerRegistros() {
         List<AntecedentesPersonalesNoPatologicos> listaAntecedentesPersonalesNoPatologicos = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaAntecedentesPersonalesNoPatologicos = s.createCriteria(AntecedentesPersonalesNoPatologicos.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaAntecedentesPersonalesNoPatologicos;
    }

    @Override
    public void eliminarRegistro(com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
         try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(antecedentesPersonalesNoPatologicos);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public AntecedentesPersonalesNoPatologicos obtenerRegistro(int id_antecedentes_personales_no_patologicos) {
        AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            antecedentesPersonalesNoPatologicos = s.get(AntecedentesPersonalesNoPatologicos.class, id_antecedentes_personales_no_patologicos);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return antecedentesPersonalesNoPatologicos;
    }

    @Override
    public void actualizarRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(antecedentesPersonalesNoPatologicos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        
    }
    
}
