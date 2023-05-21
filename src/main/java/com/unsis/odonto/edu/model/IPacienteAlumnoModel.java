/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a PacienteAlumno
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.PacienteAlumno;
import java.util.List;

public interface IPacienteAlumnoModel {

    public void crearRegistro(PacienteAlumno pacienteAlumno);

    public List<PacienteAlumno> obtenerRegistros();

    public void eliminarRegistro(PacienteAlumno pacienteAlumno);

    public PacienteAlumno obtenerRegistro(int idPacienteAlumno);

    public void actualizarRegistro(PacienteAlumno pacienteAlumno);
}
