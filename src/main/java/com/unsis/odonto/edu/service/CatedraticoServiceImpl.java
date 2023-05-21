/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para catedraticos, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Catedraticos;
import com.unsis.odonto.edu.model.CatedraticosModelImpl;
import com.unsis.odonto.edu.model.ICatedraticosModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class CatedraticoServiceImpl implements ICatedraticoService {

    private ICatedraticosModel model = new CatedraticosModelImpl();

    @Override
    public void crearRegistro(Catedraticos catedratico) {
        model.crearRegistro(catedratico);
    }

    @Override
    public List<Catedraticos> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Catedraticos catedratico) {
        model.eliminarRegistro(catedratico);
    }

    @Override
    public Catedraticos obtenerRegistro(int idcatedratico) {
        return model.obtenerRegistro(idcatedratico);
    }

    @Override
    public void actualizarRegistro(Catedraticos catedratico) {
        model.actualizarRegistro(catedratico);
    }

}
