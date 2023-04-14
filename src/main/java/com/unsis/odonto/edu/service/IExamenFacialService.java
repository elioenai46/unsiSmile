/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción: Interfaz para los servicios de los métodos abstractos de la clase
 * service refrente a ExamenFacial
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ExamenFacial;
import java.util.List;

public interface IExamenFacialService {

    public void crearRegistro(ExamenFacial examenFacial);

    public List<ExamenFacial> obtenerRegistros();

    public void eliminarRegistro(ExamenFacial examenFacial);

    public ExamenFacial obtenerRegistro(int idExamenFacial);

    public void actualizarRegistro(ExamenFacial examenFacial);

}
