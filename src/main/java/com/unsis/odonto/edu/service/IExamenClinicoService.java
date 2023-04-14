/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:14 abr 2023, 16:18
 * Descripción : InterfaceExamenClinicoService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.ExamenClinico;
import java.util.List;


public interface IExamenClinicoService {
    public void crearRegistro(ExamenClinico ExamenClinico);
    public List<ExamenClinico> obtenerRegistros();
    public void eliminarRegistro(ExamenClinico ExamenClinico);
    public ExamenClinico obtenerRegistro(int id);
    public void actualizarRegistro(ExamenClinico ExamenClinico);
}
