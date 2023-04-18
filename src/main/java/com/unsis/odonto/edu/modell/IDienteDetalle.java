/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.List;

/**
  
    Document   : IDienteDetalle
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IDienteDetalle {
    public void crearRegistro(DienteDetalle DienteDetalle);
    public List<DienteDetalle> obtenerRegistros();
    public void eliminarRegistro(DienteDetalle DienteDetalle);
    public DienteDetalle obtenerRegistro(int id);
    public void actualizarRegistro(DienteDetalle DienteDetalle);
}
