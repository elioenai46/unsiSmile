/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para semestreGrupo, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.SemestreGrupo;
import com.unsis.odonto.edu.model.SemestreGrupoModelImpl;
import com.unsis.odonto.edu.model.ISemestreGrupoModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class SemestreGrupoServiceImpl implements ISemestreGrupoService {

    private ISemestreGrupoModel model = new SemestreGrupoModelImpl();

    @Override
    public void crearRegistro(SemestreGrupo semestreGrupo) {
        model.crearRegistro(semestreGrupo);
    }

    @Override
    public List<SemestreGrupo> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(SemestreGrupo semestreGrupo) {
        model.eliminarRegistro(semestreGrupo);
    }

    @Override
    public SemestreGrupo obtenerRegistro(int idsemestreGrupo) {
        return model.obtenerRegistro(idsemestreGrupo);
    }

    @Override
    public void actualizarRegistro(SemestreGrupo semestreGrupo) {
        model.actualizarRegistro(semestreGrupo);
    }

}
