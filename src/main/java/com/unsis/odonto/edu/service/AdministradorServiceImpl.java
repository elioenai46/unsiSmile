/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para administradores, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.model.AdministradoresModelImpl;
import com.unsis.odonto.edu.model.IAdministradoresModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class AdministradorServiceImpl implements IAdministradorService {

    private IAdministradoresModel model = new AdministradoresModelImpl();

    @Override
    public void crearRegistro(Administradores administrador) {
        model.crearRegistro(administrador);
    }

    @Override
    public List<Administradores> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Administradores administrador) {
        model.eliminarRegistro(administrador);
    }

    @Override
    public Administradores obtenerRegistro(int idadministrador) {
        return model.obtenerRegistro(idadministrador);
    }

    @Override
    public void actualizarRegistro(Administradores administrador) {
        model.actualizarRegistro(administrador);
    }

}
