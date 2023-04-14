/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfacePiezasDentalesModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.PiezasDentales;
import java.util.List;


public interface IPiezasDentalesModel {
    public void crearRegistro(PiezasDentales PiezasDentales);
    public List<PiezasDentales> obtenerRegistros();
    public void eliminarRegistro(PiezasDentales PiezasDentales);
    public PiezasDentales obtenerRegistro(int id);
    public void actualizarRegistro(PiezasDentales PiezasDentales);
}
