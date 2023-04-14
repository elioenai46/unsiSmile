/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : InterfaceInterconsultaMedicaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.InterconsultaMedica;
import java.util.List;


public interface IInterconsultaMedicaService {
    public void crearRegistro(InterconsultaMedica InterconsultaMedica);
    public List<InterconsultaMedica> obtenerRegistros();
    public void eliminarRegistro(InterconsultaMedica InterconsultaMedica);
    public InterconsultaMedica obtenerRegistro(int id);
    public void actualizarRegistro(InterconsultaMedica InterconsultaMedica);
}
