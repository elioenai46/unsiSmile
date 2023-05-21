/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a semestres
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Semestres;
import java.util.List;

public interface ISemestresModel {
    public void crearRegistro(Semestres semestres);
    public List<Semestres> obtenerRegistros();
    public void eliminarRegistro(Semestres semestres);
    public Semestres obtenerRegistro(int idSemestre);
    public void actualizarRegistro(Semestres semestres);
}
