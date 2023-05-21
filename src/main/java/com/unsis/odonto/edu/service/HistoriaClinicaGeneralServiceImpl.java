/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementHistoriaClinicaGeneralService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.HistoriaClinicaGeneral;
import com.unsis.odonto.edu.model.HistoriaClinicaGeneralModelImpl;
import com.unsis.odonto.edu.model.IHistoriaClinicaGeneralModel;
import java.util.List;


public class HistoriaClinicaGeneralServiceImpl implements IHistoriaClinicaGeneralService{
    private IHistoriaClinicaGeneralModel model = new HistoriaClinicaGeneralModelImpl();
    @Override
    public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
        model.crearRegistro(HistoriaClinicaGeneral);
    }

    @Override
    public List<HistoriaClinicaGeneral> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
        model.eliminarRegistro(HistoriaClinicaGeneral);
    }

    @Override
    public HistoriaClinicaGeneral obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
        model.actualizarRegistro(HistoriaClinicaGeneral);
    }
}
