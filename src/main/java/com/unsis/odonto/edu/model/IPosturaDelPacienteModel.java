/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.PosturaDelPaciente;
import java.util.List;


public interface IPosturaDelPacienteModel {
    public void crearRegistro(PosturaDelPaciente posturaDelPaciente);
    public List<PosturaDelPaciente> obtenerRegistros();
    public void eliminarRegistro(PosturaDelPaciente posturaDelPaciente);
    public PosturaDelPaciente obtenerRegistro(int id_postura_del_paciente);
    public void actualizarRegistro(PosturaDelPaciente posturaDelPaciente);
    
}
