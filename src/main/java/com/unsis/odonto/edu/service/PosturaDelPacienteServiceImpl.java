
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.PosturaDelPaciente;
import com.unsis.odonto.edu.model.AnalisisFuncionalModelImpl;
import com.unsis.odonto.edu.model.IPosturaDelPacienteModel;
import com.unsis.odonto.edu.model.PosturaDelPacienteModelImpl;
import java.util.List;

public class PosturaDelPacienteServiceImpl implements IPosturaDelPacienteService{
    private IPosturaDelPacienteModel model = new PosturaDelPacienteModelImpl();
   
    
    @Override
    public void crearRegistro(PosturaDelPaciente posturaDelPaciente) {
        model.crearRegistro(posturaDelPaciente);
    }

    @Override
    public List<PosturaDelPaciente> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(PosturaDelPaciente posturaDelPaciente) {
        model.eliminarRegistro(posturaDelPaciente);
    }

    @Override
    public PosturaDelPaciente obtenerRegistro(int id_postura_del_paciente) {
        return model.obtenerRegistro(id_postura_del_paciente);
    }

    @Override
    public void actualizarRegistro(PosturaDelPaciente posturaDelPaciente) {
        model.actualizarRegistro(posturaDelPaciente);
    }
    
}


