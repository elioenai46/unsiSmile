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
@Table(name = "examen_bucal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamenBucal.findAll", query = "SELECT e FROM ExamenBucal e"),
    @NamedQuery(name = "ExamenBucal.findByIdExamenBucal", query = "SELECT e FROM ExamenBucal e WHERE e.idExamenBucal = :idExamenBucal")})
public class ExamenBucal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_examen_bucal")
    private Integer idExamenBucal;
    @Lob
    @Column(name = "Relaci\u00f3n_molar_Derecha")
    private String relaciónmolarDerecha;
    @Lob
    @Column(name = "Relaci\u00f3n_molar_Izquierda")
    private String relaciónmolarIzquierda;
    @Lob
    @Column(name = "Relaci\u00f3n_canina_Derecha")
    private String relacióncaninaDerecha;
    @Lob
    @Column(name = "Relaci\u00f3n_canina_Izquierda")
    private String relacióncaninaIzquierda;
    @OneToMany(mappedBy = "fkIdExamenBucal")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public ExamenBucal() {
    }

    public ExamenBucal(Integer idExamenBucal) {
        this.idExamenBucal = idExamenBucal;
    }

    public Integer getIdExamenBucal() {
        return idExamenBucal;
    }

    public void setIdExamenBucal(Integer idExamenBucal) {
        this.idExamenBucal = idExamenBucal;
    }

    public String getRelaciónmolarDerecha() {
        return relaciónmolarDerecha;
    }

    public void setRelaciónmolarDerecha(String relaciónmolarDerecha) {
        this.relaciónmolarDerecha = relaciónmolarDerecha;
    }

    public String getRelaciónmolarIzquierda() {
        return relaciónmolarIzquierda;
    }

    public void setRelaciónmolarIzquierda(String relaciónmolarIzquierda) {
        this.relaciónmolarIzquierda = relaciónmolarIzquierda;
    }

    public String getRelacióncaninaDerecha() {
        return relacióncaninaDerecha;
    }

    public void setRelacióncaninaDerecha(String relacióncaninaDerecha) {
        this.relacióncaninaDerecha = relacióncaninaDerecha;
    }

    public String getRelacióncaninaIzquierda() {
        return relacióncaninaIzquierda;
    }

    public void setRelacióncaninaIzquierda(String relacióncaninaIzquierda) {
        this.relacióncaninaIzquierda = relacióncaninaIzquierda;
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
        hash += (idExamenBucal != null ? idExamenBucal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenBucal)) {
            return false;
        }
        ExamenBucal other = (ExamenBucal) object;
        if ((this.idExamenBucal == null && other.idExamenBucal != null) || (this.idExamenBucal != null && !this.idExamenBucal.equals(other.idExamenBucal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.ExamenBucal[ idExamenBucal=" + idExamenBucal + " ]";
    }
    
}
