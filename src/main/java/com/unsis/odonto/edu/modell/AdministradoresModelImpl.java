/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para administradores, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Administradores;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdministradoresModelImpl implements IAdministradoresModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(administradores);
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
    public List<Administradores> obtenerRegistros() {
        List<Administradores> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(Administradores.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(administradores);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Administradores obtenerRegistro(int idAdministrador) {
        Administradores administradores = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            administradores = s.get(Administradores.class, idAdministrador);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener un registro: " + e.getMessage());
        }
        return administradores;
    }

    @Override
    public void actualizarRegistro(Administradores administradores) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(administradores);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
