/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceOdontogramaModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Odontograma;
import java.util.List;


public interface IOdontogramaModel {
    public void crearRegistro(Odontograma Odontograma);
    public List<Odontograma> obtenerRegistros();
    public void eliminarRegistro(Odontograma Odontograma);
    public Odontograma obtenerRegistro(int id);
    public void actualizarRegistro(Odontograma Odontograma);
}
