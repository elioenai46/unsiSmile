/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: clase service para modelar el objeto que obtiene los grupos de
 *              un respectivo semestre
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.model.ISemestreGrupo;
import com.unsis.odonto.edu.model.SemestreGrupoImpl;
import java.util.ArrayList;
import java.util.List;

public class ObtenerGrupoServiceImpl implements IObtenerGrupoService {

    private ISemestreGrupo model = new SemestreGrupoImpl();

    @Override
    public List<String> obtenerRegistros(String semestre) {
        return model.obtenerRegistros(semestre);
    }

    @Override
    public ArrayList<String> obtenerSemGrup(int id) {
        return model.obtenerSemGrup(id);
    }

    @Override
    public int obtenerIdSG(String semestre, String grupo) {
        return model.obtenerIdSG(semestre, grupo);
    }
    

}
