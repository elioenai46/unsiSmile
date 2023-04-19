/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.ExamenBucal;
import java.util.List;

public interface IExamenBucalModel {
    public void crearRegistro(ExamenBucal examenBucal);
    public List<ExamenBucal> obtenerRegistros();
    public void eliminarRegistro(ExamenBucal examenBucal);
    public ExamenBucal obtenerRegistro(int id_examen_bucal);
    public void actualizarRegistro(ExamenBucal examenBucal);    
}
 