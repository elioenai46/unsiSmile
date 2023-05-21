/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a semestreGrupo
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.SemestreGrupo;
import java.util.List;

public interface ISemestreGrupoModel {
    public void crearRegistro(SemestreGrupo semestreGrupo);
    public List<SemestreGrupo> obtenerRegistros();
    public void eliminarRegistro(SemestreGrupo semestreGrupo);
    public SemestreGrupo obtenerRegistro(int idSemestreGrupo);
    public void actualizarRegistro(SemestreGrupo semestreGrupo);
}
