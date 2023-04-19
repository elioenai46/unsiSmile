/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesPatologicos;
import com.unsis.odonto.edu.modell.AntecedentesPersonalesPatologicosModelImpl;
import com.unsis.odonto.edu.modell.IAntecedentesPersonalesPatologicosModel;
import java.util.List;


public class AntecedentesPersonalesPatologicosServiceImpl implements IAntecedentesPersonalesPatologicosService{
    private IAntecedentesPersonalesPatologicosModel model = new AntecedentesPersonalesPatologicosModelImpl();

    @Override
    public void crearRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        model.crearRegistro(antecedentesPersonalesPatologicos);
    }

    @Override
    public List<AntecedentesPersonalesPatologicos> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        model.eliminarRegistro(antecedentesPersonalesPatologicos);
    }

    @Override
    public AntecedentesPersonalesPatologicos obtenerRegistro(int id_antecedentes_personales_patologicos) {
        return model.obtenerRegistro(id_antecedentes_personales_patologicos);
    }

    @Override
    public void actualizarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        model.actualizarRegistro(antecedentesPersonalesPatologicos);
    }
    
}
