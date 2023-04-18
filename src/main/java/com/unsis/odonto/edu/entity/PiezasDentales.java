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
@Table(name = "piezas_dentales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PiezasDentales.findAll", query = "SELECT p FROM PiezasDentales p"),
    @NamedQuery(name = "PiezasDentales.findByIdPiezaDental", query = "SELECT p FROM PiezasDentales p WHERE p.idPiezaDental = :idPiezaDental"),
    @NamedQuery(name = "PiezasDentales.findByNombre", query = "SELECT p FROM PiezasDentales p WHERE p.nombre = :nombre")})
public class PiezasDentales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pieza_dental")
    private String idPiezaDental;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "fkIdPiezaDental")
    private Collection<DienteDetalle> dienteDetalleCollection;

    public PiezasDentales() {
    }

    public PiezasDentales(String idPiezaDental) {
        this.idPiezaDental = idPiezaDental;
    }

    public String getIdPiezaDental() {
        return idPiezaDental;
    }

    public void setIdPiezaDental(String idPiezaDental) {
        this.idPiezaDental = idPiezaDental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idPiezaDental != null ? idPiezaDental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PiezasDentales)) {
            return false;
        }
        PiezasDentales other = (PiezasDentales) object;
        if ((this.idPiezaDental == null && other.idPiezaDental != null) || (this.idPiezaDental != null && !this.idPiezaDental.equals(other.idPiezaDental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.PiezasDentales[ idPiezaDental=" + idPiezaDental + " ]";
    }
    
}
