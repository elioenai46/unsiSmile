/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.ModelosDeEstudioFotografias;
import java.util.List;


public interface IModelosDeEstudioFotografiasModel {
    public void crearRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias);
    public List<ModelosDeEstudioFotografias> obtenerRegistros();
    public void eliminarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias);
    public ModelosDeEstudioFotografias obtenerRegistro(int id);//Corregir
    public void actualizarRegistro(ModelosDeEstudioFotografias modelosDeEstudioFotografias);
    
}
