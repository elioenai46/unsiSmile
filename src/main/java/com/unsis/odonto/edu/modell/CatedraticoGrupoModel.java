/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase model para catedraticoGrupo, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */

package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.CatedraticoGrupo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CatedraticoGrupoModel implements ICatedraticoGrupoModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(CatedraticoGrupo catedraticoGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(catedraticoGrupo);
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
    public List<CatedraticoGrupo> obtenerRegistros() {
        List<CatedraticoGrupo> listaEjemplareses = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaEjemplareses = s.createCriteria(CatedraticoGrupo.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaEjemplareses;
    }

    @Override
    public void eliminarRegistro(CatedraticoGrupo catedraticoGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(catedraticoGrupo);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public CatedraticoGrupo obtenerRegistro(int idCatedraticoGrupo) {
        CatedraticoGrupo catedraticoGrupo = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            catedraticoGrupo = s.get(CatedraticoGrupo.class, idCatedraticoGrupo);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return catedraticoGrupo;
    }

    @Override
    public void actualizarRegistro(CatedraticoGrupo catedraticoGrupo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(catedraticoGrupo);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}