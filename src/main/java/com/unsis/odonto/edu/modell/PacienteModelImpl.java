/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para Paciente, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Paciente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PacienteModelImpl implements IPacienteModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public List<Paciente> obtenerRegistros() {
        List<Paciente> listapPacientes = new ArrayList<>();
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            listapPacientes = s.createCriteria(Paciente.class).list();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return listapPacientes;
    }

    @Override
    public void eliminarRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }

    }

    @Override
    public Paciente obtenerRegistro(int idPaciente) {
        Paciente paciente = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            paciente = s.get(Paciente.class, idPaciente);
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
        return paciente;
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(paciente);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

}
