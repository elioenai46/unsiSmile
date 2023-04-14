package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Administradores;
import com.unsis.odonto.edu.modell.AdministradoresModelImpl;
import com.unsis.odonto.edu.modell.IAdministradoresModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class AdministradorServiceImpl implements IAdministradorService {

    private IAdministradoresModel model = new AdministradoresModelImpl();

    @Override
    public void crearRegistro(Administradores Administrador) {
        model.crearRegistro(Administrador);
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
