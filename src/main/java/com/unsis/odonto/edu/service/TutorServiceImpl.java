/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:clase model para Tutor, los servicios del  crud de dicho objeto
 *             implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Tutor;
import com.unsis.odonto.edu.modell.ITutorModel;
import com.unsis.odonto.edu.modell.TutorModelImpl;
import java.util.List;

public class TutorServiceImpl implements ITutorService{
ITutorModel model =new TutorModelImpl();
    @Override
    public void crearRegistro(Tutor tutor) {
        model.crearRegistro(tutor);
    }

    @Override
    public List<Tutor> obtenerRegistros() {
       return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Tutor tutor) {
        model.eliminarRegistro(tutor);
    }

    @Override
    public Tutor obtenerRegistro(int idTutor) {
        return model.obtenerRegistro(idTutor);
    }

    @Override
    public void actualizarRegistro(Tutor tutor) {
        model.actualizarRegistro(tutor);
    }
    
}
