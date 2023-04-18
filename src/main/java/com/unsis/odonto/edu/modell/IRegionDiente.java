/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RegionDiente;
import java.util.List;

/**
  
    Document   : IRegionDiente
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IRegionDiente {
    public void crearRegistro(RegionDiente RegionDiente);
    public List<RegionDiente> obtenerRegistros();
    public void eliminarRegistro(RegionDiente RegionDiente);
    public RegionDiente obtenerRegistro(int id);
    public void actualizarRegistro(RegionDiente RegionDiente);
}
