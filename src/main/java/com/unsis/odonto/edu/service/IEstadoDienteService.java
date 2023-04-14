/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación: 14 abr 2023, 16:34
 * Descripción : InterfaceEstadoDienteService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.EstadoDiente;
import java.util.List;


public interface IEstadoDienteService {
    public void crearRegistro(EstadoDiente EstadoDiente);
    public List<EstadoDiente> obtenerRegistros();
    public void eliminarRegistro(EstadoDiente EstadoDiente);
    public EstadoDiente obtenerRegistro(int id);
    public void actualizarRegistro(EstadoDiente EstadoDiente);
}
