/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:13 de abril 2023
 *Fecha de Modificación:
 *Descripción: Interfaz para modelar los métodos abstractos de la clase model
 *             refrente a SignosVitales
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.SignosVitales;
import java.util.List;


public interface ISignosVitalesModel {
    public void crearRegistro(SignosVitales signosVitales);
    public List<SignosVitales> obtenerRegistros();
    public void eliminarRegistro(SignosVitales signosVitales);
    public SignosVitales obtenerRegistro(int idSignosVitales);
    public void actualizarRegistro(SignosVitales signosVitales);
}
