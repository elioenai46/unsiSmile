/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para grupo, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Grupo;
import com.unsis.odonto.edu.modell.GrupoModelImpl;
import com.unsis.odonto.edu.modell.IGrupoModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class GrupoServiceImpl implements IGrupoService {

    private IGrupoModel model = new GrupoModelImpl();

    @Override
    public void crearRegistro(Grupo grupo) {
        model.crearRegistro(grupo);
    }

    @Override
    public List<Grupo> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Grupo grupo) {
        model.eliminarRegistro(grupo);
    }

    @Override
    public Grupo obtenerRegistro(int idgrupo) {
        return model.obtenerRegistro(idgrupo);
    }

    @Override
    public void actualizarRegistro(Grupo grupo) {
        model.actualizarRegistro(grupo);
    }

}
