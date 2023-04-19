/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ModelosDeEstudioFotografias;
import java.util.List;

public class ModelosDeEstudioFotografiasServiceImpl implements IModelosDeEstudioFotografiasService{
        private IModelosDeEstudioFotografiasService model = new ModelosDeEstudioFotografiasServiceImpl();


    @Override
    public void crearRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
        model.crearRegistro(modelosDeEstudioFotografias);
    }

    @Override
    public List<ModelosDeEstudioFotografias> obtenerRegistros() {
        return model.obtenerRegistros();
                
    }

    @Override
    public void eliminarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
        model.eliminarRegistro(modelosDeEstudioFotografias);
    }

    @Override
    public ModelosDeEstudioFotografias obtenerRegistro(int id) {
        return model.obtenerRegistro(id); //corregir
    }

    @Override
    public void actualizarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
        model.actualizarRegistro(modelosDeEstudioFotografias);
    }
    
    
}
