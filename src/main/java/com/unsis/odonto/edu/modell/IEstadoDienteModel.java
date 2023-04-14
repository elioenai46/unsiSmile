/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceEstadoDienteModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.EstadoDiente;
import java.util.List;


public interface IEstadoDienteModel {
    public void crearRegistro(EstadoDiente EstadoDiente);
    public List<EstadoDiente> obtenerRegistros();
    public void eliminarRegistro(EstadoDiente EstadoDiente);
    public EstadoDiente obtenerRegistro(int id);
    public void actualizarRegistro(EstadoDiente EstadoDiente);
}
