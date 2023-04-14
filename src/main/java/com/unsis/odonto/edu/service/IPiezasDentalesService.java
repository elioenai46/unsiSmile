/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación: 14 abr 2023, 16:34
 * Descripción : InterfacePiezasDentalesService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.PiezasDentales;
import java.util.List;


public interface IPiezasDentalesService {
    public void crearRegistro(PiezasDentales PiezasDentales);
    public List<PiezasDentales> obtenerRegistros();
    public void eliminarRegistro(PiezasDentales PiezasDentales);
    public PiezasDentales obtenerRegistro(int id);
    public void actualizarRegistro(PiezasDentales PiezasDentales);
}
