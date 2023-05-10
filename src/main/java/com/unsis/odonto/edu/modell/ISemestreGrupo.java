/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 04 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: interface para la clase semestreGrupo
 */
package com.unsis.odonto.edu.modell;

import java.util.List;

public interface ISemestreGrupo {
    public List<String> obtenerRegistros(String semestre);
}
