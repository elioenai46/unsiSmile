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
@Table(name = "regiones_diente_periodontograma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegionesDientePeriodontograma.findAll", query = "SELECT r FROM RegionesDientePeriodontograma r"),
    @NamedQuery(name = "RegionesDientePeriodontograma.findByIdRegionesDientePeriodontograma", query = "SELECT r FROM RegionesDientePeriodontograma r WHERE r.idRegionesDientePeriodontograma = :idRegionesDientePeriodontograma"),
    @NamedQuery(name = "RegionesDientePeriodontograma.findByRegion", query = "SELECT r FROM RegionesDientePeriodontograma r WHERE r.region = :region")})
public class RegionesDientePeriodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regiones_diente_periodontograma")
    private Integer idRegionesDientePeriodontograma;
    @Column(name = "region")
    private String region;
    @OneToMany(mappedBy = "fkIdRegionesDientePeriodontograma")
    private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;

    public RegionesDientePeriodontograma() {
    }

    public RegionesDientePeriodontograma(Integer idRegionesDientePeriodontograma) {
        this.idRegionesDientePeriodontograma = idRegionesDientePeriodontograma;
    }

    public Integer getIdRegionesDientePeriodontograma() {
        return idRegionesDientePeriodontograma;
    }

    public void setIdRegionesDientePeriodontograma(Integer idRegionesDientePeriodontograma) {
        this.idRegionesDientePeriodontograma = idRegionesDientePeriodontograma;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @XmlTransient
    public Collection<MedicionBolsasDetalle> getMedicionBolsasDetalleCollection() {
        return medicionBolsasDetalleCollection;
    }

    public void setMedicionBolsasDetalleCollection(Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection) {
        this.medicionBolsasDetalleCollection = medicionBolsasDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegionesDientePeriodontograma != null ? idRegionesDientePeriodontograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionesDientePeriodontograma)) {
            return false;
        }
        RegionesDientePeriodontograma other = (RegionesDientePeriodontograma) object;
        if ((this.idRegionesDientePeriodontograma == null && other.idRegionesDientePeriodontograma != null) || (this.idRegionesDientePeriodontograma != null && !this.idRegionesDientePeriodontograma.equals(other.idRegionesDientePeriodontograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RegionesDientePeriodontograma[ idRegionesDientePeriodontograma=" + idRegionesDientePeriodontograma + " ]";
    }
    
}
