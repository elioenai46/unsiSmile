/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para PacienteAlumno, los servicios del 
 *             crud de dicho objeto implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.PacienteAlumno;
import com.unsis.odonto.edu.model.IPacienteAlumnoModel;
import com.unsis.odonto.edu.model.PacienteAlumnoModelImpl;
import java.util.List;


public class PacienteAlumnoServiceImpl implements IPacienteAlumnoService{
IPacienteAlumnoModel model=new PacienteAlumnoModelImpl();
    @Override
    public void crearRegistro(PacienteAlumno pacienteAlumno) {
        model.crearRegistro(pacienteAlumno);
    }

    @Override
    public List<PacienteAlumno> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(PacienteAlumno pacienteAlumno) {
        model.eliminarRegistro(pacienteAlumno);
    }

    @Override
    public PacienteAlumno obtenerRegistro(int idPacienteAlumno) {
        return model.obtenerRegistro(idPacienteAlumno);
    }

    @Override
    public void actualizarRegistro(PacienteAlumno pacienteAlumno) {
        model.actualizarRegistro(pacienteAlumno);
    }
    
}
