/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase service para semestres, modelamos el crud de dicho objeto
 *              implementando una clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.Semestres;
import com.unsis.odonto.edu.modell.SemestresModelImpl;
import com.unsis.odonto.edu.modell.ISemestresModel;
import java.util.List;

/**
 *
 * @author labingsw02
 */
public class SemestreServiceImpl implements ISemestreService {

    private ISemestresModel model = new SemestresModelImpl();

    @Override
    public void crearRegistro(Semestres semestre) {
        model.crearRegistro(semestre);
    }

    @Override
    public List<Semestres> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(Semestres semestre) {
        model.eliminarRegistro(semestre);
    }

    @Override
    public Semestres obtenerRegistro(int idsemestre) {
        return model.obtenerRegistro(idsemestre);
    }

    @Override
    public void actualizarRegistro(Semestres semestre) {
        model.actualizarRegistro(semestre);
    }

}
