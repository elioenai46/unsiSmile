/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementInterconsultaMedicaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.InterconsultaMedica;
import com.unsis.odonto.edu.modell.IInterconsultaMedicaModel;
import com.unsis.odonto.edu.modell.InterconsultaMedicaModelImpl;
import java.util.List;


public class InterconsultaMedicaServiceImpl implements IInterconsultaMedicaService{
    private IInterconsultaMedicaModel model = new InterconsultaMedicaModelImpl();
    @Override
    public void crearRegistro(InterconsultaMedica InterconsultaMedica) {
        model.crearRegistro(InterconsultaMedica);
    }

    @Override
    public List<InterconsultaMedica> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(InterconsultaMedica InterconsultaMedica) {
        model.eliminarRegistro(InterconsultaMedica);
    }

    @Override
    public InterconsultaMedica obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(InterconsultaMedica InterconsultaMedica) {
        model.actualizarRegistro(InterconsultaMedica);
    }
}
