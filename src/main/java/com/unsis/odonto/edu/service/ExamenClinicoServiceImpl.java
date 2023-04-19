/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementExamenClinicoService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ExamenClinico;
import com.unsis.odonto.edu.modell.ExamenClinicoModelImpl;
import com.unsis.odonto.edu.modell.IExamenClinicoModel;
import java.util.List;


public class ExamenClinicoServiceImpl implements IExamenClinicoService{
    private IExamenClinicoModel model = new ExamenClinicoModelImpl();
    @Override
    public void crearRegistro(ExamenClinico ExamenClinico) {
        model.crearRegistro(ExamenClinico);
    }

    @Override
    public List<ExamenClinico> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(ExamenClinico ExamenClinico) {
        model.eliminarRegistro(ExamenClinico);
    }

    @Override
    public ExamenClinico obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(ExamenClinico ExamenClinico) {
        model.actualizarRegistro(ExamenClinico);
    }
}
