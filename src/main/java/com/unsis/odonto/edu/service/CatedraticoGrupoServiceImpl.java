/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para catedraticoGrupo, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.CatedraticoGrupo;
import com.unsis.odonto.edu.modell.CatedraticoGrupoModelImpl;
import com.unsis.odonto.edu.modell.ICatedraticoGrupoModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class CatedraticoGrupoServiceImpl implements ICatedraticoGrupoService {

    private ICatedraticoGrupoModel model = new CatedraticoGrupoModelImpl();

    @Override
    public void crearRegistro(CatedraticoGrupo catedraticoGrupo) {
        model.crearRegistro(catedraticoGrupo);
    }

    @Override
    public List<CatedraticoGrupo> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(CatedraticoGrupo catedraticoGrupo) {
        model.eliminarRegistro(catedraticoGrupo);
    }

    @Override
    public CatedraticoGrupo obtenerRegistro(int idcatedraticoGrupo) {
        return model.obtenerRegistro(idcatedraticoGrupo);
    }

    @Override
    public void actualizarRegistro(CatedraticoGrupo catedraticoGrupo) {
        model.actualizarRegistro(catedraticoGrupo);
    }

}
