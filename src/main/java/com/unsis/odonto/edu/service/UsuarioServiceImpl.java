/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para usuarios, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Usuarios;
import com.unsis.odonto.edu.model.UsuariosModelImpl;
import com.unsis.odonto.edu.model.IUsuariosModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class UsuarioServiceImpl implements IUsuarioService {

    private IUsuariosModel model = new UsuariosModelImpl();

    @Override
    public void crearRegistro(Usuarios usuario) {
        model.crearRegistro(usuario);
    }

    @Override
    public List<Usuarios> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Usuarios usuario) {
        model.eliminarRegistro(usuario);
    }

    @Override
    public Usuarios obtenerRegistro(int idusuario) {
        return model.obtenerRegistro(idusuario);
    }

    @Override
    public void actualizarRegistro(Usuarios usuario) {
        model.actualizarRegistro(usuario);
    }

}
