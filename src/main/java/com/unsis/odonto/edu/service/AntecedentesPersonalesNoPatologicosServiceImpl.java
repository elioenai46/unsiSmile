/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos;
import com.unsis.odonto.edu.modell.AntecedentesPersonalesNoPatologicosModelImpl;
import com.unsis.odonto.edu.modell.IAntecedentesPersonalesNoPatologicosModel;
import java.util.List;


public class AntecedentesPersonalesNoPatologicosServiceImpl implements IAntecedentesPersonalesNoPatologicosService{
    private IAntecedentesPersonalesNoPatologicosModel model = new AntecedentesPersonalesNoPatologicosModelImpl();

    @Override
    public void crearRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        model.crearRegistro(antecedentesPersonalesNoPatologicos);
    }

    @Override
    public List<AntecedentesPersonalesNoPatologicos> obtenerRegistros() {
        return model.obtenerRegistros();
       
    }

    @Override
    public void eliminarRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        model.eliminarRegistro(antecedentesPersonalesNoPatologicos);
    }

    @Override
    public AntecedentesPersonalesNoPatologicos obtenerRegistro(int id_antecedentes_personales_no_patologicos) {
        return model.obtenerRegistro(id_antecedentes_personales_no_patologicos);
    }

    @Override
    public void actualizarRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        model.actualizarRegistro(antecedentesPersonalesNoPatologicos);
    }
    
}
