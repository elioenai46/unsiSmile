/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementOdontogramaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Odontograma;
import com.unsis.odonto.edu.model.IOdontogramaModel;
import com.unsis.odonto.edu.model.OdontogramaModelImpl;
import java.util.List;


public class OdontogramaServiceImpl implements IOdontogramaService{
    private IOdontogramaModel model = new OdontogramaModelImpl();
    @Override
    public void crearRegistro(Odontograma Odontograma) {
        model.crearRegistro(Odontograma);
    }

    @Override
    public List<Odontograma> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Odontograma Odontograma) {
        model.eliminarRegistro(Odontograma);
    }

    @Override
    public Odontograma obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(Odontograma Odontograma) {
        model.actualizarRegistro(Odontograma);
    }
}
