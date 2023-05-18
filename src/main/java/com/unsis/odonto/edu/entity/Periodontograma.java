/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "periodontograma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodontograma.findAll", query = "SELECT p FROM Periodontograma p"),
    @NamedQuery(name = "Periodontograma.findByIdPeriodontograma", query = "SELECT p FROM Periodontograma p WHERE p.idPeriodontograma = :idPeriodontograma"),
    @NamedQuery(name = "Periodontograma.findByFecha", query = "SELECT p FROM Periodontograma p WHERE p.fecha = :fecha")})
public class Periodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_periodontograma")
    private Integer idPeriodontograma;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(mappedBy = "fkIdPeriodontograma")
    private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;

    public Periodontograma() {
    }

    public Periodontograma(Integer idPeriodontograma) {
        this.idPeriodontograma = idPeriodontograma;
    }

    public Integer getIdPeriodontograma() {
        return idPeriodontograma;
    }

    public void setIdPeriodontograma(Integer idPeriodontograma) {
        this.idPeriodontograma = idPeriodontograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (idPeriodontograma != null ? idPeriodontograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodontograma)) {
            return false;
        }
        Periodontograma other = (Periodontograma) object;
        if ((this.idPeriodontograma == null && other.idPeriodontograma != null) || (this.idPeriodontograma != null && !this.idPeriodontograma.equals(other.idPeriodontograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Periodontograma[ idPeriodontograma=" + idPeriodontograma + " ]";
    }
    
}
