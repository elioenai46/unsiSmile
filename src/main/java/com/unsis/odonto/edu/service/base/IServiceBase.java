/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase interfaz genérica para la capa service, contiene métodos
 *              que ocupará cada clase implementadora
 */
package com.unsis.odonto.edu.service.base;

import java.util.List;

public interface IServiceBase<T> {

    /**
     * Declaración de los métodos absatractos
     */
    public void crearRegistro(T registro);

    public List<T> obtenerRegistros();

    public void eliminarRegistro(T registro);

    public T obtenerRegistro(int idRegistro);

    public void actualizarRegistro(T registro);
}