/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:14 de abril 2023
 *Fecha de Modificación:
 *Descripción: Interfaz para los servicios de los métodos abstractos de la clase
 * service refrente a SignosVitales
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.SignosVitales;
import java.util.List;

public interface ISignosVitales {

    public void crearRegistro(SignosVitales signosVitales);

    public List<SignosVitales> obtenerRegistros();

    public void eliminarRegistro(SignosVitales signosVitales);

    public SignosVitales obtenerRegistro(int idSignosVitales);

    public void actualizarRegistro(SignosVitales signosVitales);

}
