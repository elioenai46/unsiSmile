/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : ImplementDienteDetalleService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.List;

public class DienteDetalleServiceImpl implements IDienteDetalleService{
    private com.unsis.odonto.edu.modell.IDienteDetalleModel model = new com.unsis.odonto.edu.modell.DienteDetalleModelImpl();
    @Override
    public void crearRegistro(DienteDetalle DienteDetalle) {
        model.crearRegistro(DienteDetalle);
    }

    @Override
    public List<DienteDetalle> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(DienteDetalle DienteDetalle) {
        model.eliminarRegistro(DienteDetalle);
    }

    @Override
    public DienteDetalle obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(DienteDetalle DienteDetalle) {
        model.actualizarRegistro(DienteDetalle);
    }
    
}
