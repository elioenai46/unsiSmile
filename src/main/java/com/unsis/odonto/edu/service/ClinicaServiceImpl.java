/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para Clinica, para los servicios el crud de dicho 
 *             objeto implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Clinica;
import com.unsis.odonto.edu.model.ClinicaModelImpl;
import com.unsis.odonto.edu.model.IClinicaModel;
import java.util.List;

public class ClinicaServiceImpl implements IClinicaService{
  private IClinicaModel model= new ClinicaModelImpl();
    @Override
    public void crearRegistro(Clinica clinica) {
        model.crearRegistro(clinica);
    }

    @Override
    public List<Clinica> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Clinica clinica) {
        model.eliminarRegistro(clinica);
    }

    @Override
    public Clinica obtenerRegistro(int idClinica) {
        return model.obtenerRegistro(idClinica);
    }

    @Override
    public void actualizarRegistro(Clinica clinica) {
        model.actualizarRegistro(clinica);
    }
    
}
