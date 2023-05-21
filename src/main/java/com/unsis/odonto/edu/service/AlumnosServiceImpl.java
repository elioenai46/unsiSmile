/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para Alumno, ocupar el servicio del crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Alumnos;
import com.unsis.odonto.edu.model.AlumnosModellmpl;
import com.unsis.odonto.edu.model.IAlumnosModel;
import java.util.List;

public class AlumnosServiceImpl implements IAlumnoService {

    private IAlumnosModel model = new AlumnosModellmpl();

    @Override
    public void crearRegistro(Alumnos alumnos) {
        model.crearRegistro(alumnos);
    }
    
    @Override
    public List<Alumnos> obtenerRegistros() {
        return model.obtenerRegistros();      
    }
    
    @Override
    public void eliminarRegistro(Alumnos alumnos) {
        model.eliminarRegistro(alumnos);
    }
    
    @Override
    public Alumnos obtenerRegistro(int idAlumnos) {
        return model.obtenerRegistro(idAlumnos);
    }
    
    @Override
    public void actualizarRegistro(Alumnos alumnos) {
         model.actualizarRegistro(alumnos);
    }
    
}
