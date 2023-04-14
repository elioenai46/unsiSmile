/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: clase model para rolesTiposUsuario, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */

package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RolesTiposUsuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RolesTiposUsuarioModel implements IRolesTiposUsuarioModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(RolesTiposUsuario rolesTiposUsuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(rolesTiposUsuario);
            //s.createNamedQuery("guardar()");
            //s.
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<RolesTiposUsuario> obtenerRegistros() {
        List<RolesTiposUsuario> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(RolesTiposUsuario.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(RolesTiposUsuario rolesTiposUsuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(rolesTiposUsuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public RolesTiposUsuario obtenerRegistro(int idRol) {
        RolesTiposUsuario rolesTiposUsuario = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            rolesTiposUsuario = s.get(RolesTiposUsuario.class, idRol);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return rolesTiposUsuario;
    }

    @Override
    public void actualizarRegistro(RolesTiposUsuario rolesTiposUsuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(rolesTiposUsuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}