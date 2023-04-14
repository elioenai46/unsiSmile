/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para los servicios los métodos abstractos de la clase 
 *              service refrente a RolAlumno
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.RolAlumno;
import java.util.List;


public interface IRolAlumnoService {
    
    public void crearRegistro(RolAlumno rolAlumno);

    public List<RolAlumno> obtenerRegistros();

    public void eliminarRegistro(RolAlumno rolAlumno);

    public RolAlumno obtenerRegistro(int idRolAlumno);

    public void actualizarRegistro(RolAlumno rolAlumno);
}
