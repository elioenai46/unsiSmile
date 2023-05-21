/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a grupo
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Grupo;
import java.util.List;

public interface IGrupoModel {
    public void crearRegistro(Grupo grupo);
    public List<Grupo> obtenerRegistros();
    public void eliminarRegistro(Grupo grupo);
    public Grupo obtenerRegistro(int idGrupo);
    public void actualizarRegistro(Grupo grupo);
}
