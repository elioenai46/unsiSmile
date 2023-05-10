/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: clase service para modelar el objeto que obtiene los grupos de
 *              un respectivo semestre
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.modell.ISemestreGrupo;
import com.unsis.odonto.edu.modell.SemestreGrupoImpl;
import java.util.List;

public class ObtenerGrupoServiceImpl implements IObtenerGrupoService {

    private ISemestreGrupo model = new SemestreGrupoImpl();

    @Override
    public List<String> obtenerRegistros(String semestre) {
        return model.obtenerRegistros(semestre);
    }

}
