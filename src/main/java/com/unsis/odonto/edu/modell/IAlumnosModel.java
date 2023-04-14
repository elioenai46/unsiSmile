
/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Alumnos;
import java.util.List;

/**
 *
 */
public interface IAlumnosModel {
    public void crearRegistro(Alumnos alumnos);
    public List<Alumnos> obtenerRegistros();
    public void eliminarRegistro(Alumnos alumnos);
    public Alumnos obtenerRegistro(int id);
    public void actualizarRegistro(Alumnos alumnos);
}
