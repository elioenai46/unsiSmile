/*
 *Autor: Baldomero Sainos Hernandez
 *Fecha creación: 13/abril/2021
 *Fecha modificación: 13/abril/2021
 */
package com.unsis.odonto.edu.modell;

import com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos;
import java.util.List;

public interface IAntecedentesPersonalesNoPatologicosModel {
    public void crearRegistro( AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos);
    public List<AntecedentesPersonalesNoPatologicos> obtenerRegistros();
    public void eliminarRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos);
    public AntecedentesPersonalesNoPatologicos obtenerRegistro(int id_antecedentes_personales_no_patologicos);
    public void actualizarRegistro(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos);
    
}
