/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a administradores
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.Administradores;
import java.util.List;

public interface IAdministradoresModel {
    public void crearRegistro(Administradores administradores);
    public List<Administradores> obtenerRegistros();
    public void eliminarRegistro(Administradores administradores);
    public Administradores obtenerRegistro(int idAdministrador);
    public void actualizarRegistro(Administradores administradores);
}
