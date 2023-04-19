/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para ExamenFacial, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.ExamenFacial;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExamenFacialModelImpl implements IExamenFacialModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(ExamenFacial examenFacial) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(examenFacial);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<ExamenFacial> obtenerRegistros() {
        List<ExamenFacial> listaExamenFacial = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaExamenFacial = s.createCriteria(ExamenFacial.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return listaExamenFacial;
    }

    @Override
    public void eliminarRegistro(ExamenFacial examenFacial) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(examenFacial);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public ExamenFacial obtenerRegistro(int idExamenFacial) {
        ExamenFacial examenFacial = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            examenFacial = s.get(ExamenFacial.class, idExamenFacial);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return examenFacial;
    }

    @Override
    public void actualizarRegistro(ExamenFacial examenFacial) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(examenFacial);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizarr el registro: " + e.getMessage());
        }
    }

}
