/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "analisis_funcional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnalisisFuncional.findAll", query = "SELECT a FROM AnalisisFuncional a"),
    @NamedQuery(name = "AnalisisFuncional.findByIdAnalisisFuncional", query = "SELECT a FROM AnalisisFuncional a WHERE a.idAnalisisFuncional = :idAnalisisFuncional")})
public class AnalisisFuncional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_funcional")
    private Integer idAnalisisFuncional;
    @Lob
    @Column(name = "Degluci\u00f3n")
    private String deglución;
    @Lob
    @Column(name = "Fonaci\u00f3n_masticaci\u00f3n")
    private String fonaciónmasticación;
    @Lob
    @Column(name = "Respiraci\u00f3n")
    private String respiración;
    @Lob
    @Column(name = "Observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "fkIdAnalisisFuncional")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public AnalisisFuncional() {
    }

    public AnalisisFuncional(Integer idAnalisisFuncional) {
        this.idAnalisisFuncional = idAnalisisFuncional;
    }

    public Integer getIdAnalisisFuncional() {
        return idAnalisisFuncional;
    }

    public void setIdAnalisisFuncional(Integer idAnalisisFuncional) {
        this.idAnalisisFuncional = idAnalisisFuncional;
    }

    public String getDeglución() {
        return deglución;
    }

    public void setDeglución(String deglución) {
        this.deglución = deglución;
    }

    public String getFonaciónmasticación() {
        return fonaciónmasticación;
    }

    public void setFonaciónmasticación(String fonaciónmasticación) {
        this.fonaciónmasticación = fonaciónmasticación;
    }

    public String getRespiración() {
        return respiración;
    }

    public void setRespiración(String respiración) {
        this.respiración = respiración;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection() {
        return historiaClinicaGeneralCollection;
    }

    public void setHistoriaClinicaGeneralCollection(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection) {
        this.historiaClinicaGeneralCollection = historiaClinicaGeneralCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalisisFuncional != null ? idAnalisisFuncional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisFuncional)) {
            return false;
        }
        AnalisisFuncional other = (AnalisisFuncional) object;
        if ((this.idAnalisisFuncional == null && other.idAnalisisFuncional != null) || (this.idAnalisisFuncional != null && !this.idAnalisisFuncional.equals(other.idAnalisisFuncional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AnalisisFuncional[ idAnalisisFuncional=" + idAnalisisFuncional + " ]";
    }
    
}
