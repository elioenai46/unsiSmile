/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.InterconsultaMedica;
import java.util.List;

/**
  
    Document   : IInterconsultaMedica
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IInterconsultaMedica {
    public void crearRegistro(InterconsultaMedica InterconsultaMedica);
    public List<InterconsultaMedica> obtenerRegistros();
    public void eliminarRegistro(InterconsultaMedica InterconsultaMedica);
    public InterconsultaMedica obtenerRegistro(int id);
    public void actualizarRegistro(InterconsultaMedica InterconsultaMedica);
}
