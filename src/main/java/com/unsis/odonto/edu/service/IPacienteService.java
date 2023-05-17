/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción:Interfaz para los servicios los métodos abstractos de la clase model
 *             refrente a Paciente
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Paciente;
import com.unsis.odonto.edu.service.base.IServiceBase;
import java.util.List;

public interface IPacienteService extends IServiceBase<Paciente> {
    public List<Paciente> obtenerRegistros(Integer id);
}
