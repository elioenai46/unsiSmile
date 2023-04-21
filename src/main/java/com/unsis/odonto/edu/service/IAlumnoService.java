/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase service
 *             refrente a Alumnos
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.service.base.IServiceBase;
import java.util.List;

public interface IAlumnoService {

    public List<Alumnos> obtenerRegistros();

    public Alumnos obtenerRegistro(int id);

    public void crearRegistro(Alumnos alumnos);

    public void eliminarRegistro(Alumnos alumnos);

    public void actualizarRegistro(Alumnos alumnos);

}
/*
    public List<Alumnos> obtenerRegistros();
    public Alumnos obtenerRegistro(int id);
    
    public void crearRegistro(Alumnos alumnos);
    public void eliminarRegistro(Alumnos alumnos);
    public void actualizarRegistro(Alumnos alumnos);
*/
