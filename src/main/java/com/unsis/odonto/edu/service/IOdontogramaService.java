/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : InterfaceOdontogramaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Odontograma;
import java.util.List;


public interface IOdontogramaService {
    public void crearRegistro(Odontograma Odontograma);
    public List<Odontograma> obtenerRegistros();
    public void eliminarRegistro(Odontograma Odontograma);
    public Odontograma obtenerRegistro(int id);
    public void actualizarRegistro(Odontograma Odontograma);
}
