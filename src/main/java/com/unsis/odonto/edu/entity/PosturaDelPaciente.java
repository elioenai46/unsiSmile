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
@Table(name = "postura_del_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PosturaDelPaciente.findAll", query = "SELECT p FROM PosturaDelPaciente p"),
    @NamedQuery(name = "PosturaDelPaciente.findByIdPosturaDelPaciente", query = "SELECT p FROM PosturaDelPaciente p WHERE p.idPosturaDelPaciente = :idPosturaDelPaciente")})
public class PosturaDelPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_postura_del_paciente")
    private Integer idPosturaDelPaciente;
    @Lob
    @Column(name = "atm_palpacion")
    private String atmPalpacion;
    @OneToMany(mappedBy = "fkIdPosturaDelPaciente")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public PosturaDelPaciente() {
    }

    public PosturaDelPaciente(Integer idPosturaDelPaciente) {
        this.idPosturaDelPaciente = idPosturaDelPaciente;
    }

    public Integer getIdPosturaDelPaciente() {
        return idPosturaDelPaciente;
    }

    public void setIdPosturaDelPaciente(Integer idPosturaDelPaciente) {
        this.idPosturaDelPaciente = idPosturaDelPaciente;
    }

    public String getAtmPalpacion() {
        return atmPalpacion;
    }

    public void setAtmPalpacion(String atmPalpacion) {
        this.atmPalpacion = atmPalpacion;
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
        hash += (idPosturaDelPaciente != null ? idPosturaDelPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosturaDelPaciente)) {
            return false;
        }
        PosturaDelPaciente other = (PosturaDelPaciente) object;
        if ((this.idPosturaDelPaciente == null && other.idPosturaDelPaciente != null) || (this.idPosturaDelPaciente != null && !this.idPosturaDelPaciente.equals(other.idPosturaDelPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.PosturaDelPaciente[ idPosturaDelPaciente=" + idPosturaDelPaciente + " ]";
    }
    
}
