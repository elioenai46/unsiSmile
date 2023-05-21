/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para rolesTiposUsuarioes, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.RolesTiposUsuario;
import com.unsis.odonto.edu.model.RolesTiposUsuarioModelImpl;
import com.unsis.odonto.edu.model.IRolesTiposUsuarioModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class RolesTiposUsuarioServiceImpl implements IRolesTiposUsuarioService {

    private IRolesTiposUsuarioModel model = new RolesTiposUsuarioModelImpl();

    @Override
    public void crearRegistro(RolesTiposUsuario rolesTiposUsuario) {
        model.crearRegistro(rolesTiposUsuario);
    }

    @Override
    public List<RolesTiposUsuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(RolesTiposUsuario rolesTiposUsuario) {
        model.eliminarRegistro(rolesTiposUsuario);
    }

    @Override
    public RolesTiposUsuario obtenerRegistro(int idrolesTiposUsuario) {
        return model.obtenerRegistro(idrolesTiposUsuario);
    }

    @Override
    public void actualizarRegistro(RolesTiposUsuario rolesTiposUsuario) {
        model.actualizarRegistro(rolesTiposUsuario);
    }

}
