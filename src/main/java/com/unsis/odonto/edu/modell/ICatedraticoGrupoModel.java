/**
 * Autor: Oscar Funtes Alvarado
 * Fecha creación: 14 de abril de 2023
 * Fecha modificación: 14 de abril de 2023
 * Descripción: interfaz para modelar los métodos abstractos de la clase model
 *              referente a catedraticoGrupo
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.CatedraticoGrupo;
import java.util.List;

public interface ICatedraticoGrupoModel {
    public void crearRegistro(CatedraticoGrupo catedraticoGrupo);
    public List<CatedraticoGrupo> obtenerRegistros();
    public void eliminarRegistro(CatedraticoGrupo catedraticoGrupo);
    public CatedraticoGrupo obtenerRegistro(int idCatedraticoGrupo);
    public void actualizarRegistro(CatedraticoGrupo catedraticoGrupo);
}
