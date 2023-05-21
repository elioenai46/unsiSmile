/**
 * Autor     : Vite 
 * Fecha de creación : 13 abr 2023, 16:55
 * Fecha de modificación:
 * Descripción : ImplementEstudioDeLaboratorioBiopsiaService 
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia;
import com.unsis.odonto.edu.model.EstudioDeLaboratorioBiopsiaModelImpl;
import com.unsis.odonto.edu.model.IEstudioDeLaboratorioBiopsiaModel;
import java.util.List;


public class EstudioDeLaboratorioBiopsiaServiceImpl implements IEstudioDeLaboratorioBiopsiaService{
private IEstudioDeLaboratorioBiopsiaModel model = new EstudioDeLaboratorioBiopsiaModelImpl();
    @Override
    public void crearRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia) {
        model.crearRegistro(EstudioDeLaboratorioBiopsia);
    }

    @Override
    public List<EstudioDeLaboratorioBiopsia> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia) {
        model.eliminarRegistro(EstudioDeLaboratorioBiopsia);
    }

    @Override
    public EstudioDeLaboratorioBiopsia obtenerRegistro(int id) {
        return model.obtenerRegistro(id);
    }

    @Override
    public void actualizarRegistro(EstudioDeLaboratorioBiopsia EstudioDeLaboratorioBiopsia) {
        model.actualizarRegistro(EstudioDeLaboratorioBiopsia);
    }
    
}
