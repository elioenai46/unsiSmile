/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceExamenClinicoModel 
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.ExamenClinico;
import java.util.List;


public interface IExamenClinicoModel {
    public void crearRegistro(ExamenClinico ExamenClinico);
    public List<ExamenClinico> obtenerRegistros();
    public void eliminarRegistro(ExamenClinico ExamenClinico);
    public ExamenClinico obtenerRegistro(int id);
    public void actualizarRegistro(ExamenClinico ExamenClinico);
}
