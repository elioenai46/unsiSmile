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
 * @author labingsw02
 */
@Entity
@Table(name = "region_diente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegionDiente.findAll", query = "SELECT r FROM RegionDiente r"),
    @NamedQuery(name = "RegionDiente.findByIdRegion", query = "SELECT r FROM RegionDiente r WHERE r.idRegion = :idRegion"),
    @NamedQuery(name = "RegionDiente.findByDescripcion", query = "SELECT r FROM RegionDiente r WHERE r.descripcion = :descripcion")})
public class RegionDiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_region")
    private Integer idRegion;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "fkIdRegionDiente")
    private Collection<DienteDetalle> dienteDetalleCollection;

    public RegionDiente() {
    }

    public RegionDiente(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<DienteDetalle> getDienteDetalleCollection() {
        return dienteDetalleCollection;
    }

    public void setDienteDetalleCollection(Collection<DienteDetalle> dienteDetalleCollection) {
        this.dienteDetalleCollection = dienteDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionDiente)) {
            return false;
        }
        RegionDiente other = (RegionDiente) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RegionDiente[ idRegion=" + idRegion + " ]";
    }
    
}
