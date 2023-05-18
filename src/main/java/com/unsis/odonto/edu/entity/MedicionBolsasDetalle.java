/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "medicion_bolsas_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedicionBolsasDetalle.findAll", query = "SELECT m FROM MedicionBolsasDetalle m"),
    @NamedQuery(name = "MedicionBolsasDetalle.findByIdMedicionBolsasDetalle", query = "SELECT m FROM MedicionBolsasDetalle m WHERE m.idMedicionBolsasDetalle = :idMedicionBolsasDetalle"),
    @NamedQuery(name = "MedicionBolsasDetalle.findByMedicion", query = "SELECT m FROM MedicionBolsasDetalle m WHERE m.medicion = :medicion")})
public class MedicionBolsasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medicion_bolsas_detalle")
    private Integer idMedicionBolsasDetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "medicion")
    private Float medicion;
    @JoinColumn(name = "fk_id_codigo_pieza_dental", referencedColumnName = "id_codigo_pieza_dental")
    @ManyToOne
    private CodigoPiezaDental fkIdCodigoPiezaDental;
    @JoinColumn(name = "fk_id_periodontograma", referencedColumnName = "id_periodontograma")
    @ManyToOne
    private Periodontograma fkIdPeriodontograma;
    @JoinColumn(name = "fk_id_regiones_diente_periodontograma", referencedColumnName = "id_regiones_diente_periodontograma")
    @ManyToOne
    private RegionesDientePeriodontograma fkIdRegionesDientePeriodontograma;
    @JoinColumn(name = "fk_id_regiones_medicion_bolsas", referencedColumnName = "id_regiones_medicion_bolsas")
    @ManyToOne
    private RegionesMedicionBolsas fkIdRegionesMedicionBolsas;

    public MedicionBolsasDetalle() {
    }

    public MedicionBolsasDetalle(Integer idMedicionBolsasDetalle) {
        this.idMedicionBolsasDetalle = idMedicionBolsasDetalle;
    }

    public Integer getIdMedicionBolsasDetalle() {
        return idMedicionBolsasDetalle;
    }

    public void setIdMedicionBolsasDetalle(Integer idMedicionBolsasDetalle) {
        this.idMedicionBolsasDetalle = idMedicionBolsasDetalle;
    }

    public Float getMedicion() {
        return medicion;
    }

    public void setMedicion(Float medicion) {
        this.medicion = medicion;
    }

    public CodigoPiezaDental getFkIdCodigoPiezaDental() {
        return fkIdCodigoPiezaDental;
    }

    public void setFkIdCodigoPiezaDental(CodigoPiezaDental fkIdCodigoPiezaDental) {
        this.fkIdCodigoPiezaDental = fkIdCodigoPiezaDental;
    }

    public Periodontograma getFkIdPeriodontograma() {
        return fkIdPeriodontograma;
    }

    public void setFkIdPeriodontograma(Periodontograma fkIdPeriodontograma) {
        this.fkIdPeriodontograma = fkIdPeriodontograma;
    }

    public RegionesDientePeriodontograma getFkIdRegionesDientePeriodontograma() {
        return fkIdRegionesDientePeriodontograma;
    }

    public void setFkIdRegionesDientePeriodontograma(RegionesDientePeriodontograma fkIdRegionesDientePeriodontograma) {
        this.fkIdRegionesDientePeriodontograma = fkIdRegionesDientePeriodontograma;
    }

    public RegionesMedicionBolsas getFkIdRegionesMedicionBolsas() {
        return fkIdRegionesMedicionBolsas;
    }

    public void setFkIdRegionesMedicionBolsas(RegionesMedicionBolsas fkIdRegionesMedicionBolsas) {
        this.fkIdRegionesMedicionBolsas = fkIdRegionesMedicionBolsas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicionBolsasDetalle != null ? idMedicionBolsasDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicionBolsasDetalle)) {
            return false;
        }
        MedicionBolsasDetalle other = (MedicionBolsasDetalle) object;
        if ((this.idMedicionBolsasDetalle == null && other.idMedicionBolsasDetalle != null) || (this.idMedicionBolsasDetalle != null && !this.idMedicionBolsasDetalle.equals(other.idMedicionBolsasDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.MedicionBolsasDetalle[ idMedicionBolsasDetalle=" + idMedicionBolsasDetalle + " ]";
    }
    
}
