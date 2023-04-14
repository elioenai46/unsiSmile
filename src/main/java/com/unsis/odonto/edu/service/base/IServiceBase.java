
package com.unsis.odonto.edu.service.base;

import java.util.List;

public interface IServiceBase<T> {

    /**
     * Declaración de los métodos absatractos
     */
    public void crearRegistro(T registro);

    public List<T> obtenerRegistros();

    public void eliminarRegistro(int id);

    public T obtenerRegistro(int id);

    public void actualizarRegistro(T registro);
}