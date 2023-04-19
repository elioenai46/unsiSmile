/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : InterfaceEstudioDeLaboratorioBiopsiaModel 
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia;
import java.util.List;


public interface IEstudioDeLaboratorioBiopsiaModel {
    public void crearRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public List<EstudioDeLaboratorioBiopsia> obtenerRegistros();
    public void eliminarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
    public EstudioDeLaboratorioBiopsia obtenerRegistro(int id);
    public void actualizarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia);
}
