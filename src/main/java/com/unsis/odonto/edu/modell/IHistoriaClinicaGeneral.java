/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.HistoriaClinicaGeneral;
import java.util.List;

/**
  
    Document   : IHistoriaClinicaGeneral
    Created on : 13 abr 2023, 16:55
    Author     : Vite

 */
public interface IHistoriaClinicaGeneral {
    public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public List<HistoriaClinicaGeneral> obtenerRegistros();
    public void eliminarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public HistoriaClinicaGeneral obtenerRegistro(int id);
    public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
}
