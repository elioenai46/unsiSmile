/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para semestreGrupo, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.SemestreGrupo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SemestreGrupoModelImpl implements ISemestreGrupoModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(SemestreGrupo semestreGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(semestreGrupo);
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
    public List<SemestreGrupo> obtenerRegistros() {
        List<SemestreGrupo> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(SemestreGrupo.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener las lista de registros: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(SemestreGrupo semestreGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(semestreGrupo);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public SemestreGrupo obtenerRegistro(int idSemestreGrupo) {
        SemestreGrupo semestreGrupo = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            semestreGrupo = s.get(SemestreGrupo.class, idSemestreGrupo);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al obtener un registro: " + e.getMessage());
        }
        return semestreGrupo;
    }

    @Override
    public void actualizarRegistro(SemestreGrupo semestreGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(semestreGrupo);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

}
