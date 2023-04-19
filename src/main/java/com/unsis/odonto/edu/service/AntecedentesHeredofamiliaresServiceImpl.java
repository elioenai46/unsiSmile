/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AntecedentesHeredofamiliares;
import com.unsis.odonto.edu.modell.AntecedentesHeredofamiliaresModelImpl;
import com.unsis.odonto.edu.modell.IAntecedentesHeredofamiliaresModel;
import java.util.List;

public class AntecedentesHeredofamiliaresServiceImpl implements IAntecedentesHeredofamiliaresService{
    private IAntecedentesHeredofamiliaresModel model = new AntecedentesHeredofamiliaresModelImpl();

    @Override
    public void crearRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        model.crearRegistro(antecedentesHeredofamiliares);
    }

    @Override
    public List<AntecedentesHeredofamiliares> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        model.eliminarRegistro(antecedentesHeredofamiliares);
    }

    @Override
    public AntecedentesHeredofamiliares obtenerRegistro(int id_antecedentes_heredofamiliares) {
        return model.obtenerRegistro(id_antecedentes_heredofamiliares);
    }

    @Override
    public void actualizarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        model.actualizarRegistro(antecedentesHeredofamiliares);
    }
    
}
