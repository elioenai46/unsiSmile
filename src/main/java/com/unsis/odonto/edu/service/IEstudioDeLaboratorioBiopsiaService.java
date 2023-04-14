/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación: 14 abr 2023, 16:34
 * Descripción : InterfaceEstudioDeLaboratorioBiopsiaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia;
import java.util.List;

public interface IEstudioDeLaboratorioBiopsiaService {
    public void crearRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public List<EstudioDeLaboratorioBiopsia> obtenerRegistros();
    public void eliminarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public EstudioDeLaboratorioBiopsia obtenerRegistro(int id);
    public void actualizarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
}
