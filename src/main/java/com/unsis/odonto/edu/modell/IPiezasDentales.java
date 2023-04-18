/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.PiezasDentales;
import java.util.List;

/**
  
    Document   : IPiezasDentales
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IPiezasDentales {
    public void crearRegistro(PiezasDentales PiezasDentales);
    public List<PiezasDentales> obtenerRegistros();
    public void eliminarRegistro(PiezasDentales PiezasDentales);
    public PiezasDentales obtenerRegistro(int id);
    public void actualizarRegistro(PiezasDentales PiezasDentales);
}
