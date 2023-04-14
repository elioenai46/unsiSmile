 /**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación: 14 abr 2023, 16:49
 * Descripción : ImplementEstadoDienteService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.EstadoDiente;
import java.util.List;


public class EstadoDienteServiceImpl implements IEstadoDienteService{
private com.unsis.odonto.edu.modell.IEstadoDienteModel model = new com.unsis.odonto.edu.modell.EstadoDienteModelImpl();
    @Override
    public void crearRegistro(EstadoDiente EstadoDiente) {
        model.crearRegistro(EstadoDiente);
    }

    @Override
    public List<EstadoDiente> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(EstadoDiente EstadoDiente) {
        model.eliminarRegistro(EstadoDiente);
    }

    @Override
    public EstadoDiente obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(EstadoDiente EstadoDiente) {
        model.actualizarRegistro(EstadoDiente);
    }
    
}
