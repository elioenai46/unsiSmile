/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AnalisisRadiografico;
import com.unsis.odonto.edu.model.AnalisisRadiograficoModelImpl;
import com.unsis.odonto.edu.model.IAnalisisRadiograficoModel;
import java.util.List;

public class AnalisisRadiograficoServiceImpl implements IAnalisisRadiograficoService{
        private IAnalisisRadiograficoModel model = new AnalisisRadiograficoModelImpl();

    @Override
    public void crearRegistro(AnalisisRadiografico analisisRadiografico) {
        model.crearRegistro(analisisRadiografico);
    }

    @Override
    public List<AnalisisRadiografico> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(AnalisisRadiografico analisisRadiografico) {
        model.eliminarRegistro(analisisRadiografico);
    }

    @Override
    public AnalisisRadiografico obtenerRegistro(int id_AnalisisRadiografico) {
        return model.obtenerRegistro(id_AnalisisRadiografico);
    }

    @Override
    public void actualizarRegistro(AnalisisRadiografico analisisRadiografico) {
        model.actualizarRegistro(analisisRadiografico);
    }
    
}
