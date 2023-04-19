/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AnalisisFuncional;
import com.unsis.odonto.edu.modell.AnalisisFuncionalModelImpl;
import com.unsis.odonto.edu.modell.IAnalisisFuncionalModel;
import java.util.List;


public class AnalisisFuncionalServiceImpl implements IAnalisisFuncionalService{
    private IAnalisisFuncionalModel model = new AnalisisFuncionalModelImpl();

    @Override
    public void crearRegistro(AnalisisFuncional analisisFuncional) { 
    model.crearRegistro(analisisFuncional);
    }

    @Override
    public List<AnalisisFuncional> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(AnalisisFuncional analisisFuncional) {
        model.eliminarRegistro(analisisFuncional);
    }

    @Override
    public AnalisisFuncional obtenerRegistro(int id_analisis_funcional) {
        return model.obtenerRegistro(id_analisis_funcional);
        
    }

    @Override
    public void actualizarRegistro(AnalisisFuncional analisisFuncional) {
        model.actualizarRegistro(analisisFuncional);
    }
    
}
