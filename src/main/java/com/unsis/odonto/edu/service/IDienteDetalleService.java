/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : InterfaceDienteDetalleService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.List;


public interface IDienteDetalleService {
    public void crearRegistro(DienteDetalle DienteDetalle);
    public List<DienteDetalle> obtenerRegistros();
    public void eliminarRegistro(DienteDetalle DienteDetalle);
    public DienteDetalle obtenerRegistro(int id);
    public void actualizarRegistro(DienteDetalle DienteDetalle);
}
