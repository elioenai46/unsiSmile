/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clse model
 *             refrente a RolAlumno
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RolAlumno;
import java.util.List;

public interface IRolAlumnosModel {

    public void crearRegistro(RolAlumno rolAlumno);

    public List<RolAlumno> obtenerRegistros();

    public void eliminarRegistro(RolAlumno rolAlumno);

    public RolAlumno obtenerRegistro(int idRolAlumno);

    public void actualizarRegistro(RolAlumno rolAlumno);
}
