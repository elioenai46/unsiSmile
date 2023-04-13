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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "semestre_grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SemestreGrupo.findAll", query = "SELECT s FROM SemestreGrupo s"),
    @NamedQuery(name = "SemestreGrupo.findByIdSemestreGrupo", query = "SELECT s FROM SemestreGrupo s WHERE s.idSemestreGrupo = :idSemestreGrupo")})
public class SemestreGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_semestre_grupo")
    private Integer idSemestreGrupo;
    @OneToMany(mappedBy = "fkIdSemestreGrupo")
    private Collection<Alumnos> alumnosCollection;
    @JoinColumn(name = "fk_id_grupo", referencedColumnName = "id_grupos")
    @ManyToOne
    private Grupo fkIdGrupo;
    @JoinColumn(name = "fk_id_semestre", referencedColumnName = "id_semestre")
    @ManyToOne
    private Semestres fkIdSemestre;
    @OneToMany(mappedBy = "fkIdSemestreGrupo")
    private Collection<CatedraticoGrupo> catedraticoGrupoCollection;

    public SemestreGrupo() {
    }

    public SemestreGrupo(Integer idSemestreGrupo) {
        this.idSemestreGrupo = idSemestreGrupo;
    }

    public Integer getIdSemestreGrupo() {
        return idSemestreGrupo;
    }

    public void setIdSemestreGrupo(Integer idSemestreGrupo) {
        this.idSemestreGrupo = idSemestreGrupo;
    }

    @XmlTransient
    public Collection<Alumnos> getAlumnosCollection() {
        return alumnosCollection;
    }

    public void setAlumnosCollection(Collection<Alumnos> alumnosCollection) {
        this.alumnosCollection = alumnosCollection;
    }

    public Grupo getFkIdGrupo() {
        return fkIdGrupo;
    }

    public void setFkIdGrupo(Grupo fkIdGrupo) {
        this.fkIdGrupo = fkIdGrupo;
    }

    public Semestres getFkIdSemestre() {
        return fkIdSemestre;
    }

    public void setFkIdSemestre(Semestres fkIdSemestre) {
        this.fkIdSemestre = fkIdSemestre;
    }

    @XmlTransient
    public Collection<CatedraticoGrupo> getCatedraticoGrupoCollection() {
        return catedraticoGrupoCollection;
    }

    public void setCatedraticoGrupoCollection(Collection<CatedraticoGrupo> catedraticoGrupoCollection) {
        this.catedraticoGrupoCollection = catedraticoGrupoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSemestreGrupo != null ? idSemestreGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SemestreGrupo)) {
            return false;
        }
        SemestreGrupo other = (SemestreGrupo) object;
        if ((this.idSemestreGrupo == null && other.idSemestreGrupo != null) || (this.idSemestreGrupo != null && !this.idSemestreGrupo.equals(other.idSemestreGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.SemestreGrupo[ idSemestreGrupo=" + idSemestreGrupo + " ]";
    }
    
}
