/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para servicios los métodos abstractos de la clase service
 *             refrente a Clinica
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Clinica;
import java.util.List;

public interface IClinicaService {

    public void crearRegistro(Clinica clinica);

    public List<Clinica> obtenerRegistros();

    public void eliminarRegistro(Clinica clinica);

    public Clinica obtenerRegistro(int idClinica);

    public void actualizarRegistro(Clinica clinica);
}
