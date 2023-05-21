/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 13 de abril de 2023
 * Fecha modificación: 13 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a usuarios
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.Usuarios;
import java.util.List;

public interface IUsuariosModel {
    public void crearRegistro(Usuarios usuarios);
    public List<Usuarios> obtenerRegistros();
    public void eliminarRegistro(Usuarios usuarios);
    public Usuarios obtenerRegistro(int idUsuario);
    public void actualizarRegistro(Usuarios usuarios);
}
