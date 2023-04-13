/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia;
import java.util.List;

/**
  
    Document   : IEstudioDeLaboratorioBiopsia
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IEstudioDeLaboratorioBiopsia {
    public void crearRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public List<EstudioDeLaboratorioBiopsia> obtenerRegistros();
    public void eliminarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public EstudioDeLaboratorioBiopsia obtenerRegistro(int id);
    public void actualizarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
}
