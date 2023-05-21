/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción: clase service para SignosVitales, los servicios del crud de dicho
 * objeto implementando la clase interfaz
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.SignosVitales;
import com.unsis.odonto.edu.model.ISignosVitalesModel;
import com.unsis.odonto.edu.model.SignosVitalesModelImpl;
import java.util.List;


public class SignosVitalesServiceImpl implements ISignosVitales{
 ISignosVitalesModel model =new SignosVitalesModelImpl();
    @Override
    public void crearRegistro(SignosVitales signosVitales) {
        model.eliminarRegistro(signosVitales);
    }

    @Override
    public List<SignosVitales> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void eliminarRegistro(SignosVitales signosVitales) {
        model.eliminarRegistro(signosVitales);
    }

    @Override
    public SignosVitales obtenerRegistro(int idSignosVitales) {
        return model.obtenerRegistro(idSignosVitales);
    }

    @Override
    public void actualizarRegistro(SignosVitales signosVitales) {
        model.actualizarRegistro(signosVitales);
    }
    
}
