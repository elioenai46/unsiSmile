/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para los servicios los métodos abstractos de la clase model
 *             refrente a Paciente
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Paciente;
import java.util.List;

public interface IPacienteService {

    public void crearRegistro(Paciente paciente);

    public List<Paciente> obtenerRegistros();

    public void eliminarRegistro(Paciente paciente);

    public Paciente obtenerRegistro(int idPaciente);

    public void actualizarRegistro(Paciente paciente);

}
