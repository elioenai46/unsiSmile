/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.model;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesPatologicos;
import java.util.List;



public interface IAntecedentesPersonalesPatologicosModel {
    public void crearRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos);
    public List<AntecedentesPersonalesPatologicos> obtenerRegistros();
    public void eliminarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos);
    public AntecedentesPersonalesPatologicos obtenerRegistro(int id_antecedentes_personales_patologicos); 
    public void actualizarRegistro(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos);
}

