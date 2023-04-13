/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Odontograma;
import java.util.List;

/**
  
    Document   : IOdontograma
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IOdontograma {
    public void crearRegistro(Odontograma Odontograma);
    public List<Odontograma> obtenerRegistros();
    public void eliminarRegistro(Odontograma Odontograma);
    public Odontograma obtenerRegistro(int id);
    public void actualizarRegistro(Odontograma Odontograma);
}
