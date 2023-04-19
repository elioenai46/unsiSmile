/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 14/abril/2021
 */
package com.unsis.odonto.edu.service;

import com.unsis.odonto.edu.entity.AnalisisRadiografico;
import java.util.List;

public interface IAnalisisRadiograficoService {
    public void crearRegistro(AnalisisRadiografico analisisRadiografico);
    public List<AnalisisRadiografico> obtenerRegistros();
    public void eliminarRegistro(AnalisisRadiografico analisisRadiografico);
    public AnalisisRadiografico obtenerRegistro(int id_AnalisisRadiografico);//Corregir
    public void actualizarRegistro(AnalisisRadiografico analisisRadiografico);
}
