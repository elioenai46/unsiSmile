/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: clase model para catedraticos, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */

package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Catedraticos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CatedraticosModel implements ICatedraticosModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(catedraticos);
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
    public List<Catedraticos> obtenerRegistros() {
        List<Catedraticos> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(Catedraticos.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(catedraticos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public Catedraticos obtenerRegistro(int idCatedratico) {
        Catedraticos catedraticos = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            catedraticos = s.get(Catedraticos.class, idCatedratico);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return catedraticos;
    }

    @Override
    public void actualizarRegistro(Catedraticos catedraticos) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(catedraticos);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}