/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase service para RolAlumno, los servicios de crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.RolAlumno;
import com.unsis.odonto.edu.modell.IRolAlumnosModel;
import com.unsis.odonto.edu.modell.RolAlumnosModelImpl;
import java.util.List;

public class RolAlumnoServiceImpl implements IRolAlumnoService {

    private IRolAlumnosModel model = new RolAlumnosModelImpl();

    @Override
    public void crearRegistro(RolAlumno rolAlumno) {
        model.crearRegistro(rolAlumno);

    }

    @Override
    public List<RolAlumno> obtenerRegistros() {
        return model.obtenerRegistros();

    }

    @Override
    public void eliminarRegistro(RolAlumno rolAlumno) {
        model.eliminarRegistro(rolAlumno);
    }

    @Override
    public RolAlumno obtenerRegistro(int idRolAlumno) {
        return model.obtenerRegistro(idRolAlumno);
    }

    @Override
    public void actualizarRegistro(RolAlumno rolAlumno) {
        model.actualizarRegistro(rolAlumno);
    }

}
