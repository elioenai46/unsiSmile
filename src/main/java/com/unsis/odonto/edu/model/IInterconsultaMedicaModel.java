/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceInterconsultaMedicaModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.InterconsultaMedica;
import java.util.List;


public interface IInterconsultaMedicaModel {
    public void crearRegistro(InterconsultaMedica InterconsultaMedica);
    public List<InterconsultaMedica> obtenerRegistros();
    public void eliminarRegistro(InterconsultaMedica InterconsultaMedica);
    public InterconsultaMedica obtenerRegistro(int id);
    public void actualizarRegistro(InterconsultaMedica InterconsultaMedica);
}
