/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceDienteDetalleModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.List;


public interface IDienteDetalleModel {
    public void crearRegistro(DienteDetalle DienteDetalle);
    public List<DienteDetalle> obtenerRegistros();
    public void eliminarRegistro(DienteDetalle DienteDetalle);
    public DienteDetalle obtenerRegistro(int id);
    public void actualizarRegistro(DienteDetalle DienteDetalle);
}
