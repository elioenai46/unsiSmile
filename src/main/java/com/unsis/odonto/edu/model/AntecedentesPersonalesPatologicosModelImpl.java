/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesPatologicos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AntecedentesPersonalesPatologicosModelImpl implements IAntecedentesPersonalesPatologicosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {

        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(antecedentesPersonalesPatologicos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<AntecedentesPersonalesPatologicos> obtenerRegistros() {
        List<AntecedentesPersonalesPatologicos> listaAntecedentesPersonalesPatologicos = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaAntecedentesPersonalesPatologicos = s.createCriteria(AntecedentesPersonalesPatologicos.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaAntecedentesPersonalesPatologicos;
    }

    @Override
    public void eliminarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(antecedentesPersonalesPatologicos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public AntecedentesPersonalesPatologicos obtenerRegistro(int id_antecedentes_personales_patologicos) {
        AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            antecedentesPersonalesPatologicos = s.get(AntecedentesPersonalesPatologicos.class, id_antecedentes_personales_patologicos);//corregir
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return antecedentesPersonalesPatologicos;
    }

    @Override
    public void actualizarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(antecedentesPersonalesPatologicos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
}
   
