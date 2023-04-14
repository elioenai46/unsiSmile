/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.DienteDetalle;
import java.util.List;

/**
  
    Document   : DienteDetalleImplservice
    Created on : 13 abr 2023, 16:55
    Author     : Vite

    */
public class DienteDetalleImpl implements IDienteDetalle{
    private com.unsis.odonto.edu.modell.IDienteDetalle model = new com.unsis.odonto.edu.modell.DienteDetalleImpl();
    @Override
    public void crearRegistro(DienteDetalle DienteDetalle) {
        model.crearRegistro(DienteDetalle);
    }

    @Override
    public List<DienteDetalle> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(DienteDetalle DienteDetalle) {
        model.eliminarRegistro(DienteDetalle);
    }

    @Override
    public DienteDetalle obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(DienteDetalle DienteDetalle) {
        model.actualizarRegistro(DienteDetalle);
    }
    
}
