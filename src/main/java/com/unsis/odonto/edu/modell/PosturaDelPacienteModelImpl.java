/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.PosturaDelPaciente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PosturaDelPacienteModelImpl implements IPosturaDelPacienteModel{
     private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(PosturaDelPaciente posturaDelPaciente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(posturaDelPaciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<PosturaDelPaciente> obtenerRegistros() {
         List<PosturaDelPaciente> listaPosturaDelPaciente = new ArrayList<>();
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaPosturaDelPaciente = s.createCriteria(PosturaDelPaciente.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaPosturaDelPaciente;
    }

    @Override
    public void eliminarRegistro(PosturaDelPaciente posturaDelPaciente) {
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(posturaDelPaciente);     
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public PosturaDelPaciente obtenerRegistro(int id_postura_del_paciente) {
         PosturaDelPaciente posturaDelPaciente = null;
        try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            posturaDelPaciente = s.get(PosturaDelPaciente.class, id_postura_del_paciente);//corregir
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return posturaDelPaciente;
    }

    @Override
    public void actualizarRegistro(PosturaDelPaciente posturaDelPaciente) {
         try {
             sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(posturaDelPaciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
