/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación: 14 abr 2023, 16:34
 * Descripción : InterfaceRegionDienteService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.RegionDiente;
import java.util.List;


public interface IRegionDienteService {
    public void crearRegistro(RegionDiente RegionDiente);
    public List<RegionDiente> obtenerRegistros();
    public void eliminarRegistro(RegionDiente RegionDiente);
    public RegionDiente obtenerRegistro(int id);
    public void actualizarRegistro(RegionDiente RegionDiente);
}
