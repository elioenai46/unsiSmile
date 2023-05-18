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
@Table(name = "diente_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DienteDetalle.findAll", query = "SELECT d FROM DienteDetalle d"),
    @NamedQuery(name = "DienteDetalle.findByIdDienteDetalle", query = "SELECT d FROM DienteDetalle d WHERE d.idDienteDetalle = :idDienteDetalle")})
public class DienteDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_diente_detalle")
    private Integer idDienteDetalle;
    @JoinColumn(name = "fk_id_codigo_pieza_dental", referencedColumnName = "id_codigo_pieza_dental")
    @ManyToOne
    private CodigoPiezaDental fkIdCodigoPiezaDental;
    @JoinColumn(name = "fk_id_estado_diente", referencedColumnName = "id_estado_diente")
    @ManyToOne
    private EstadoDiente fkIdEstadoDiente;
    @JoinColumn(name = "fk_id_odontograma", referencedColumnName = "id_odontograma")
    @ManyToOne
    private Odontograma fkIdOdontograma;
    @JoinColumn(name = "fk_id_region_diente", referencedColumnName = "id_region")
    @ManyToOne
    private RegionDiente fkIdRegionDiente;

    public DienteDetalle() {
    }

    public DienteDetalle(Integer idDienteDetalle) {
        this.idDienteDetalle = idDienteDetalle;
    }

    public Integer getIdDienteDetalle() {
        return idDienteDetalle;
    }

    public void setIdDienteDetalle(Integer idDienteDetalle) {
        this.idDienteDetalle = idDienteDetalle;
    }

    public CodigoPiezaDental getFkIdCodigoPiezaDental() {
        return fkIdCodigoPiezaDental;
    }

    public void setFkIdCodigoPiezaDental(CodigoPiezaDental fkIdCodigoPiezaDental) {
        this.fkIdCodigoPiezaDental = fkIdCodigoPiezaDental;
    }

    public EstadoDiente getFkIdEstadoDiente() {
        return fkIdEstadoDiente;
    }

    public void setFkIdEstadoDiente(EstadoDiente fkIdEstadoDiente) {
        this.fkIdEstadoDiente = fkIdEstadoDiente;
    }

    public Odontograma getFkIdOdontograma() {
        return fkIdOdontograma;
    }

    public void setFkIdOdontograma(Odontograma fkIdOdontograma) {
        this.fkIdOdontograma = fkIdOdontograma;
    }

    public RegionDiente getFkIdRegionDiente() {
        return fkIdRegionDiente;
    }

    public void setFkIdRegionDiente(RegionDiente fkIdRegionDiente) {
        this.fkIdRegionDiente = fkIdRegionDiente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDienteDetalle != null ? idDienteDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DienteDetalle)) {
            return false;
        }
        DienteDetalle other = (DienteDetalle) object;
        if ((this.idDienteDetalle == null && other.idDienteDetalle != null) || (this.idDienteDetalle != null && !this.idDienteDetalle.equals(other.idDienteDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.DienteDetalle[ idDienteDetalle=" + idDienteDetalle + " ]";
    }
    
}
