/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.EstadoDiente;
import java.util.List;

/**
  
    Document   : IEstadoDiente
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IEstadoDiente {
    public void crearRegistro(EstadoDiente EstadoDiente);
    public List<EstadoDiente> obtenerRegistros();
    public void eliminarRegistro(EstadoDiente EstadoDiente);
    public EstadoDiente obtenerRegistro(int id);
    public void actualizarRegistro(EstadoDiente EstadoDiente);
}
