/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para ExamenFacial, los servicios del 
 * crud de dicho objeto implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ExamenFacial;
import com.unsis.odonto.edu.modell.ExamenFacialModelImpl;
import com.unsis.odonto.edu.modell.IExamenFacialModel;
import java.util.List;


public class ExamenFacialService implements IExamenFacialService{
IExamenFacialModel model= new ExamenFacialModelImpl();
    @Override
    public void crearRegistro(ExamenFacial examenFacial) {
        model.crearRegistro(examenFacial);
    }

    @Override
    public List<ExamenFacial> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(ExamenFacial examenFacial) {
        model.eliminarRegistro(examenFacial);
    }

    @Override
    public ExamenFacial obtenerRegistro(int idExamenFacial) {
        return model.obtenerRegistro(idExamenFacial);
    }

    @Override
    public void actualizarRegistro(ExamenFacial examenFacial) {
        model.actualizarRegistro(examenFacial);
    }
    
}
