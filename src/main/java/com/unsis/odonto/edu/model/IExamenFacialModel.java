/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a ExamenFacial
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.ExamenFacial;
import java.util.List;

public interface IExamenFacialModel {

    public void crearRegistro(ExamenFacial examenFacial);

    public List<ExamenFacial> obtenerRegistros();

    public void eliminarRegistro(ExamenFacial examenFacial);

    public ExamenFacial obtenerRegistro(int idExamenFacial);

    public void actualizarRegistro(ExamenFacial examenFacial);
}
