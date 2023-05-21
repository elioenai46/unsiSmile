/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.AntecedentesHeredofamiliares;
import java.util.List;


public interface IAntecedentesHeredofamiliaresModel {
    public void crearRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares);
    public List<AntecedentesHeredofamiliares> obtenerRegistros();
    public void eliminarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares);
    public AntecedentesHeredofamiliares obtenerRegistro(int id_antecedentes_heredofamiliares);
    public void actualizarRegistro(AntecedentesHeredofamiliares antecedentesHeredofamiliares);
    
}
