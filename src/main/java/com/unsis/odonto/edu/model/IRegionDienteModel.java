/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceRegionDienteModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.RegionDiente;
import java.util.List;


public interface IRegionDienteModel {
    public void crearRegistro(RegionDiente RegionDiente);
    public List<RegionDiente> obtenerRegistros();
    public void eliminarRegistro(RegionDiente RegionDiente);
    public RegionDiente obtenerRegistro(int id);
    public void actualizarRegistro(RegionDiente RegionDiente);
}
