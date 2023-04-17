/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a Tutor
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Tutor;
import java.util.List;

public interface ITutorModel {

    public void crearRegistro(Tutor tutor);

    public List<Tutor> obtenerRegistros();

    public void eliminarRegistro(Tutor tutor);

    public Tutor obtenerRegistro(int idTutor);

    public void actualizarRegistro(Tutor tutor);
}
