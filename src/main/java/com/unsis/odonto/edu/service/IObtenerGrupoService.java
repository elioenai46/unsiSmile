/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de mayo de 2023
 * Fecha de actualización: 05 de mayo de 2023
 * Descripción: interface para la clase semestreGrupo en la capa de servicio
 */
package com.unsis.odonto.edu.service;

import java.util.ArrayList;
import java.util.List;

public interface IObtenerGrupoService {
    public List<String> obtenerRegistros(String semestre);
    public int obtenerIdSG(String semestre, String grupo);
    public ArrayList<String> obtenerSemGrup(int id); 
}
