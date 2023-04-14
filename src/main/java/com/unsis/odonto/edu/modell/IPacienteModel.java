
/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.entity.Paciente;
import java.util.List;

public interface IPacienteModel {
    public void crearRegistro(Paciente paciente);
    public List<Paciente> obtenerRegistros();
    public void eliminarRegistro(Paciente paciente);
    public Paciente obtenerRegistro(int id);
    public void actualizarRegistro(Paciente paciente);
}

