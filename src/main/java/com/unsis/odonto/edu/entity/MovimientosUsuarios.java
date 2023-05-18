/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "movimientosUsuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovimientosUsuarios.findAll", query = "SELECT m FROM MovimientosUsuarios m"),
    @NamedQuery(name = "MovimientosUsuarios.findByIdMovimientos", query = "SELECT m FROM MovimientosUsuarios m WHERE m.idMovimientos = :idMovimientos"),
    @NamedQuery(name = "MovimientosUsuarios.findByEntidad", query = "SELECT m FROM MovimientosUsuarios m WHERE m.entidad = :entidad"),
    @NamedQuery(name = "MovimientosUsuarios.findByIdEntidad", query = "SELECT m FROM MovimientosUsuarios m WHERE m.idEntidad = :idEntidad"),
    @NamedQuery(name = "MovimientosUsuarios.findByFechaDeRealizacion", query = "SELECT m FROM MovimientosUsuarios m WHERE m.fechaDeRealizacion = :fechaDeRealizacion"),
    @NamedQuery(name = "MovimientosUsuarios.findByTipoMovimiento", query = "SELECT m FROM MovimientosUsuarios m WHERE m.tipoMovimiento = :tipoMovimiento")})
public class MovimientosUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimientos")
    private Integer idMovimientos;
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "id_entidad")
    private Integer idEntidad;
    @Column(name = "fecha_de_realizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeRealizacion;
    @Column(name = "tipo_movimiento")
    private Character tipoMovimiento;

    public MovimientosUsuarios() {
    }

    public MovimientosUsuarios(Integer idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public Integer getIdMovimientos() {
        return idMovimientos;
    }

    public void setIdMovimientos(Integer idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    public Date getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(Date fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public Character getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Character tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimientos != null ? idMovimientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosUsuarios)) {
            return false;
        }
        MovimientosUsuarios other = (MovimientosUsuarios) object;
        if ((this.idMovimientos == null && other.idMovimientos != null) || (this.idMovimientos != null && !this.idMovimientos.equals(other.idMovimientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.MovimientosUsuarios[ idMovimientos=" + idMovimientos + " ]";
    }
    
}
