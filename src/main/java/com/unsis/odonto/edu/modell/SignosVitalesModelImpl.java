/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción: clase model para SignosVitales, modelamos el crud de dicho objeto 
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;
import com.unsis.odonto.edu.entity.SignosVitales;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SignosVitalesModelImpl implements ISignosVitalesModel {
private SessionFactory sf;
    private Session s;
    @Override
    public void crearRegistro(SignosVitales signosVitales) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(signosVitales);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<SignosVitales> obtenerRegistros() {
        List<SignosVitales> listaSignosVitales = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listaSignosVitales = s.createCriteria(SignosVitales.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listaSignosVitales;
    }

    @Override
    public void eliminarRegistro(SignosVitales signosVitales) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(signosVitales);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public SignosVitales obtenerRegistro(int idSignosVitales) {
         SignosVitales signosVitales = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            signosVitales = s.get(SignosVitales.class, idSignosVitales);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return signosVitales;
    }

    @Override
    public void actualizarRegistro(SignosVitales signosVitales) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(signosVitales);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }
    
}
