/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a rolesTiposUsuario
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.RolesTiposUsuario;
import java.util.List;

public interface IRolesTiposUsuarioModel {
    public void crearRegistro(RolesTiposUsuario rolesTiposUsuario);
    public List<RolesTiposUsuario> obtenerRegistros();
    public void eliminarRegistro(RolesTiposUsuario rolesTiposUsuario);
    public RolesTiposUsuario obtenerRegistro(int idRol);
    public void actualizarRegistro(RolesTiposUsuario rolesTiposUsuario);
}
