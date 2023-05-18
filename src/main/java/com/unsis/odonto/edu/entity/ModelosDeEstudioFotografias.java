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
@Table(name = "modelos_de_estudio_fotografias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelosDeEstudioFotografias.findAll", query = "SELECT m FROM ModelosDeEstudioFotografias m"),
    @NamedQuery(name = "ModelosDeEstudioFotografias.findByIdModelosDeEstudioFotografias", query = "SELECT m FROM ModelosDeEstudioFotografias m WHERE m.idModelosDeEstudioFotografias = :idModelosDeEstudioFotografias")})
public class ModelosDeEstudioFotografias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_modelos_de_estudio_fotografias")
    private Integer idModelosDeEstudioFotografias;
    @Lob
    @Column(name = "Modelos_de_estudio")
    private String modelosdeestudio;
    @Lob
    @Column(name = "Tipo_de_arcada")
    private String tipodearcada;
    @Lob
    @Column(name = "Fotografias")
    private String fotografias;
    @OneToMany(mappedBy = "fkIdModelosDeEstudioFotografias")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public ModelosDeEstudioFotografias() {
    }

    public ModelosDeEstudioFotografias(Integer idModelosDeEstudioFotografias) {
        this.idModelosDeEstudioFotografias = idModelosDeEstudioFotografias;
    }

    public Integer getIdModelosDeEstudioFotografias() {
        return idModelosDeEstudioFotografias;
    }

    public void setIdModelosDeEstudioFotografias(Integer idModelosDeEstudioFotografias) {
        this.idModelosDeEstudioFotografias = idModelosDeEstudioFotografias;
    }

    public String getModelosdeestudio() {
        return modelosdeestudio;
    }

    public void setModelosdeestudio(String modelosdeestudio) {
        this.modelosdeestudio = modelosdeestudio;
    }

    public String getTipodearcada() {
        return tipodearcada;
    }

    public void setTipodearcada(String tipodearcada) {
        this.tipodearcada = tipodearcada;
    }

    public String getFotografias() {
        return fotografias;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
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
        hash += (idModelosDeEstudioFotografias != null ? idModelosDeEstudioFotografias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosDeEstudioFotografias)) {
            return false;
        }
        ModelosDeEstudioFotografias other = (ModelosDeEstudioFotografias) object;
        if ((this.idModelosDeEstudioFotografias == null && other.idModelosDeEstudioFotografias != null) || (this.idModelosDeEstudioFotografias != null && !this.idModelosDeEstudioFotografias.equals(other.idModelosDeEstudioFotografias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.ModelosDeEstudioFotografias[ idModelosDeEstudioFotografias=" + idModelosDeEstudioFotografias + " ]";
    }
    
}
