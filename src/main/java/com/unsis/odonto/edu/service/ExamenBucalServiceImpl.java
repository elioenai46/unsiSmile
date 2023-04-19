/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ExamenBucal;
import com.unsis.odonto.edu.modell.ExamenBucalModelImpl;
import com.unsis.odonto.edu.modell.IExamenBucalModel;
import java.util.List;

public class ExamenBucalServiceImpl implements IExamenBucalService{
    private IExamenBucalModel model = new ExamenBucalModelImpl();

    @Override
    public void crearRegistro(ExamenBucal examenBucal) {
        model.crearRegistro(examenBucal);
    }

    @Override
    public List<ExamenBucal> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(ExamenBucal examenBucal) {
        model.eliminarRegistro(examenBucal);
    }

    @Override
    public ExamenBucal obtenerRegistro(int id_examen_bucal) {
        return model.obtenerRegistro(id_examen_bucal);
    }

    @Override
    public void actualizarRegistro(ExamenBucal examenBucal) {
        model.actualizarRegistro(examenBucal);
    }
    
}
