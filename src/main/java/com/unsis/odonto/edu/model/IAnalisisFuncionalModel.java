/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.AnalisisFuncional;
import java.util.List;


public interface IAnalisisFuncionalModel {
    public void crearRegistro(AnalisisFuncional analisisFuncional);
    public List<AnalisisFuncional> obtenerRegistros();
    public void eliminarRegistro(AnalisisFuncional analisisFuncional);
    public AnalisisFuncional obtenerRegistro(int id_analisis_funcional); 
    public void actualizarRegistro(AnalisisFuncional  analisisFuncional);
    
}


