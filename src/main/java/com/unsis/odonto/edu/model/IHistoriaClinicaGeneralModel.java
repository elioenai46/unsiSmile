/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceHistoriaClinicaGeneralModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.HistoriaClinicaGeneral;
import java.util.List;


public interface IHistoriaClinicaGeneralModel {
    public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public List<HistoriaClinicaGeneral> obtenerRegistros();
    public void eliminarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public HistoriaClinicaGeneral obtenerRegistro(int id);
    public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
}
