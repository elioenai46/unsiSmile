/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: Clase para gestionar la conexión con la BD para manipular
 *              datos referentes a los semestres y grupos
 */
package com.unsis.odonto.edu.modell;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SemestreGrupoImpl implements ISemestreGrupo {

    private SessionFactory sf;
    private Session s;

    /**
     * Método para obtener todos los grupos que le pertenecen a un semestre dado
     */
    @Override
    public List<String> obtenerRegistros(String semestre) {
        List<String> resultados = new ArrayList<String>();
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("filtrarGrupos");
            sp.registerStoredProcedureParameter("semestre", String.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("semestre", semestre);

            // Ejecutar procedimiento almacenado
            sp.execute();

            // Obtener los resultados de la consulta
            List<Object> registros = sp.getResultList();

            // Recorrer los registros y agregarlos a la lista de resultados
            for (Object registro : registros) {
                resultados.add(String.valueOf(registro));
            }

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
        }

        return resultados;
    }
    /**
     * Método para obtener el id de la relación semestre grupo 
     */
    @Override
    public int obtenerIdSG(String semestre, String grupo) {
        int id = 0;
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("filtrarIdSemestreGrupo");
            sp.registerStoredProcedureParameter("semestreAux", String.class, ParameterMode.IN);
            sp.registerStoredProcedureParameter("grupoAux", String.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("semestreAux", semestre);
            sp.setParameter("grupoAux", grupo);

            // Ejecutar procedimiento almacenado
            sp.execute();

            // Obtener los resultados de la consulta
            List<Object[]> registros = sp.getResultList();
            // Recorrer los registros y agregarlos a la lista de resultados
            for (Object registro : registros) {
                Object[] row = registros.get(0);
                //aux=((row[0] == null) ? "" : ((row[0]).toString()));
                id=Integer.parseInt((row[0]).toString());
            }

            // Recorrer los registros y agregarlos a la lista de resultados
            

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
        }

        return id;
    }

    @Override
    public ArrayList<String> obtenerSemGrup(int id) {
        System.out.println("hola");
        ArrayList<String> resultados = new ArrayList<String>();
        try {
            sf = new Configuration().configure().buildSessionFactory();

            s = sf.openSession();

            StoredProcedureQuery sp = s.createStoredProcedureQuery("spFiltrarSemGrup");
            sp.registerStoredProcedureParameter("id", int.class, ParameterMode.IN);

            // Establecer parámetros del procedimiento almacenado
            sp.setParameter("id", id);

            // Ejecutar procedimiento almacenado
            sp.execute();

            // Obtener los resultados de la consulta
            List<Object[]> registros = sp.getResultList();
            //String aux= "";
            // Recorrer los registros y agregarlos a la lista de resultados
            for (Object registro : registros) {
                Object[] row = registros.get(0);
                //aux=((row[0] == null) ? "" : ((row[0]).toString()));
                resultados.add((row[0]).toString());
                resultados.add((row[1]).toString());
            }

            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
        }
        return resultados;
    }

}
