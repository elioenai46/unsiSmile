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
@Table(name = "regiones_medicion_bolsas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegionesMedicionBolsas.findAll", query = "SELECT r FROM RegionesMedicionBolsas r"),
    @NamedQuery(name = "RegionesMedicionBolsas.findByIdRegionesMedicionBolsas", query = "SELECT r FROM RegionesMedicionBolsas r WHERE r.idRegionesMedicionBolsas = :idRegionesMedicionBolsas"),
    @NamedQuery(name = "RegionesMedicionBolsas.findByRegion", query = "SELECT r FROM RegionesMedicionBolsas r WHERE r.region = :region")})
public class RegionesMedicionBolsas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regiones_medicion_bolsas")
    private Integer idRegionesMedicionBolsas;
    @Column(name = "region")
    private String region;
    @OneToMany(mappedBy = "fkIdRegionesMedicionBolsas")
    private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;

    public RegionesMedicionBolsas() {
    }

    public RegionesMedicionBolsas(Integer idRegionesMedicionBolsas) {
        this.idRegionesMedicionBolsas = idRegionesMedicionBolsas;
    }

    public Integer getIdRegionesMedicionBolsas() {
        return idRegionesMedicionBolsas;
    }

    public void setIdRegionesMedicionBolsas(Integer idRegionesMedicionBolsas) {
        this.idRegionesMedicionBolsas = idRegionesMedicionBolsas;
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
        hash += (idRegionesMedicionBolsas != null ? idRegionesMedicionBolsas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionesMedicionBolsas)) {
            return false;
        }
        RegionesMedicionBolsas other = (RegionesMedicionBolsas) object;
        if ((this.idRegionesMedicionBolsas == null && other.idRegionesMedicionBolsas != null) || (this.idRegionesMedicionBolsas != null && !this.idRegionesMedicionBolsas.equals(other.idRegionesMedicionBolsas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RegionesMedicionBolsas[ idRegionesMedicionBolsas=" + idRegionesMedicionBolsas + " ]";
    }
    
}
