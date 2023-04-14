/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase service
 *             refrente a Alumnos
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Alumnos;
import java.util.List;

public interface IAlumnoService {

    public void crearRegistro(Alumnos alumnos);

    public List<Alumnos> obtenerRegistros();

    public void eliminarRegistro(Alumnos alumnos);

    public Alumnos obtenerRegistro(int idAlumnos);

    public void actualizarRegistro(Alumnos alumnos);
}
