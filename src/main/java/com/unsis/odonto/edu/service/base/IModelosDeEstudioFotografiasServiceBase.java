/**
 * Autor: Baldomero Sainos Hernández
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: clase interfaz genérica para la capa service, contiene métodos
 *              que ocupará cada clase implementadora
 */
package com.unsis.odonto.edu.service.base;

import com.unsis.odonto.edu.service.IModelosDeEstudioFotografiasService;
import java.util.List;

/**
 *
 * @author labingsw04
 */
public interface IModelosDeEstudioFotografiasServiceBase<T>{
       /**
     * Declaración de los métodos absatractos
     */
    public void crearRegistro(T registro);

    public List<T> obtenerRegistros();

    public void eliminarRegistro(T registro);

    public T obtenerRegistro(int idRegistro);

    public void actualizarRegistro(T registro);
    
}
