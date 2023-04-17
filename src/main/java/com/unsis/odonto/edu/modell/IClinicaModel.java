/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a Clinica
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Clinica;
import java.util.List;

public interface IClinicaModel {

    public void crearRegistro(Clinica clinica);

    public List<Clinica> obtenerRegistros();

    public void eliminarRegistro(Clinica clinica);

    public Clinica obtenerRegistro(int idClinica);

    public void actualizarRegistro(Clinica clinica);
}
