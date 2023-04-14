/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : InterfaceHistoriaClinicaGeneralService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.HistoriaClinicaGeneral;
import java.util.List;


public interface IHistoriaClinicaGeneralService {
    public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public List<HistoriaClinicaGeneral> obtenerRegistros();
    public void eliminarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
    public HistoriaClinicaGeneral obtenerRegistro(int id);
    public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral);
}
