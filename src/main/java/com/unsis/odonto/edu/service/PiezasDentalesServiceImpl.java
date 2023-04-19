/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementsPiezasDentalesService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.PiezasDentales;
import com.unsis.odonto.edu.modell.IPiezasDentalesModel;
import com.unsis.odonto.edu.modell.PiezasDentalesModelImpl;
import java.util.List;


public class PiezasDentalesServiceImpl implements IPiezasDentalesService{
    private IPiezasDentalesModel model = new PiezasDentalesModelImpl();
    @Override
    public void crearRegistro(PiezasDentales PiezasDentales) {
        model.crearRegistro(PiezasDentales);
    }

    @Override
    public List<PiezasDentales> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(PiezasDentales PiezasDentales) {
        model.eliminarRegistro(PiezasDentales);
    }

    @Override
    public PiezasDentales obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(PiezasDentales PiezasDentales) {
        model.actualizarRegistro(PiezasDentales);
    }
}
