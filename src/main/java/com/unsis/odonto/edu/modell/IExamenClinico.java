/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.ExamenClinico;
import java.util.List;

/**
  
    Document   : IExamenClinico
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IExamenClinico {
    public void crearRegistro(ExamenClinico ExamenClinico);
    public List<ExamenClinico> obtenerRegistros();
    public void eliminarRegistro(ExamenClinico ExamenClinico);
    public ExamenClinico obtenerRegistro(int id);
    public void actualizarRegistro(ExamenClinico ExamenClinico);
}
