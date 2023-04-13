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
@Table(name = "grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g"),
    @NamedQuery(name = "Grupo.findByIdGrupos", query = "SELECT g FROM Grupo g WHERE g.idGrupos = :idGrupos"),
    @NamedQuery(name = "Grupo.findByGrupo", query = "SELECT g FROM Grupo g WHERE g.grupo = :grupo")})
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_grupos")
    private Integer idGrupos;
    @Column(name = "grupo")
    private String grupo;
    @OneToMany(mappedBy = "fkIdGrupo")
    private Collection<SemestreGrupo> semestreGrupoCollection;

    public Grupo() {
    }

    public Grupo(Integer idGrupos) {
        this.idGrupos = idGrupos;
    }

    public Integer getIdGrupos() {
        return idGrupos;
    }

    public void setIdGrupos(Integer idGrupos) {
        this.idGrupos = idGrupos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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
        hash += (idGrupos != null ? idGrupos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.idGrupos == null && other.idGrupos != null) || (this.idGrupos != null && !this.idGrupos.equals(other.idGrupos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Grupo[ idGrupos=" + idGrupos + " ]";
    }
    
}
