/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para Paciente, los servicios del crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Paciente;
import com.unsis.odonto.edu.modell.IPacienteModel;
import com.unsis.odonto.edu.modell.PacienteModelImpl;
import java.util.List;


public class PacienteServiceImpl implements IPacienteService{
IPacienteModel model =new PacienteModelImpl();
    @Override
    public void crearRegistro(Paciente paciente) {
        model.crearRegistro(paciente);
    }

    @Override
    public List<Paciente> obtenerRegistros(Integer id) {
        return model.obtenerRegistros(id);
    }

    @Override
    public void eliminarRegistro(Paciente paciente) {
        model.eliminarRegistro(paciente);
    }

    @Override
    public Paciente obtenerRegistro(int idPaciente) {
        return model.obtenerRegistro(idPaciente);
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        model.actualizarRegistro(paciente);
    }

    @Override
    public List<Paciente> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
}
