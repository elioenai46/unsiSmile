/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a catedraticos
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Catedraticos;
import java.util.List;

public interface ICatedraticosModel {
    public void crearRegistro(Catedraticos catedraticos);
    public List<Catedraticos> obtenerRegistros();
    public void eliminarRegistro(Catedraticos catedraticos);
    public Catedraticos obtenerRegistro(int idUsuario);
    public void actualizarRegistro(Catedraticos catedraticos);
}
