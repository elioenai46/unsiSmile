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

 
}
