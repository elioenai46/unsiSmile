/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementRegionDienteService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.RegionDiente;
import com.unsis.odonto.edu.modell.IRegionDienteModel;
import com.unsis.odonto.edu.modell.RegionDienteModelImpl;
import java.util.List;


public class RegionDienteServiceImpl implements IRegionDienteService{
    private IRegionDienteModel model = new RegionDienteModelImpl();
    @Override
    public void crearRegistro(RegionDiente RegionDiente) {
        model.crearRegistro(RegionDiente);
    }

    @Override
    public List<RegionDiente> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(RegionDiente RegionDiente) {
        model.eliminarRegistro(RegionDiente);
    }

    @Override
    public RegionDiente obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(RegionDiente RegionDiente) {
        model.actualizarRegistro(RegionDiente);
    }
}
