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
@Table(name = "semestres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semestres.findAll", query = "SELECT s FROM Semestres s"),
    @NamedQuery(name = "Semestres.findByIdSemestre", query = "SELECT s FROM Semestres s WHERE s.idSemestre = :idSemestre"),
    @NamedQuery(name = "Semestres.findBySemestre", query = "SELECT s FROM Semestres s WHERE s.semestre = :semestre")})
public class Semestres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_semestre")
    private Integer idSemestre;
    @Column(name = "semestre")
    private String semestre;
    @OneToMany(mappedBy = "fkIdSemestre")
    private Collection<SemestreGrupo> semestreGrupoCollection;

    public Semestres() {
    }

    public Semestres(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Integer getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @XmlTransient
    public Collection<SemestreGrupo> getSemestreGrupoCollection() {
        return semestreGrupoCollection;
    }

    public void setSemestreGrupoCollection(Collection<SemestreGrupo> semestreGrupoCollection) {
        this.semestreGrupoCollection = semestreGrupoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSemestre != null ? idSemestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestres)) {
            return false;
        }
        Semestres other = (Semestres) object;
        if ((this.idSemestre == null && other.idSemestre != null) || (this.idSemestre != null && !this.idSemestre.equals(other.idSemestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Semestres[ idSemestre=" + idSemestre + " ]";
    }
    
}
