/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para Clinica, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Clinica;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClinicaModelImpl implements IClinicaModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Clinica clinica) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(clinica);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Clinica> obtenerRegistros() {
        List<Clinica> listaClinicas = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaClinicas = s.createCriteria(Clinica.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return listaClinicas;
    }

    @Override
    public void eliminarRegistro(Clinica clinica) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(clinica);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }

    }

    @Override
    public Clinica obtenerRegistro(int idClinica) {
        Clinica clinica = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            clinica = s.get(Clinica.class, idClinica);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
        }
        return clinica;
    }

    @Override
    public void actualizarRegistro(Clinica clinica) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(clinica);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
