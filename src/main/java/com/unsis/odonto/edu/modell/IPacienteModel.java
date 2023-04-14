/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a Paciente
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Paciente;
import java.util.List;

public interface IPacienteModel {

    public void crearRegistro(Paciente paciente);

    public List<Paciente> obtenerRegistros();

    public void eliminarRegistro(Paciente paciente);

    public Paciente obtenerRegistro(int idPaciente);

    public void actualizarRegistro(Paciente paciente);
}
