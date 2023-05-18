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
@Table(name = "catedratico_grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatedraticoGrupo.findAll", query = "SELECT c FROM CatedraticoGrupo c"),
    @NamedQuery(name = "CatedraticoGrupo.findByIdCatedraticoSemestreGrupo", query = "SELECT c FROM CatedraticoGrupo c WHERE c.idCatedraticoSemestreGrupo = :idCatedraticoSemestreGrupo")})
public class CatedraticoGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catedratico_semestre_grupo")
    private Integer idCatedraticoSemestreGrupo;
    @JoinColumn(name = "fk_id_catedratico", referencedColumnName = "id_catedratico")
    @ManyToOne
    private Catedraticos fkIdCatedratico;
    @JoinColumn(name = "fk_id_semestre_grupo", referencedColumnName = "id_semestre_grupo")
    @ManyToOne
    private SemestreGrupo fkIdSemestreGrupo;

    public CatedraticoGrupo() {
    }

    public CatedraticoGrupo(Integer idCatedraticoSemestreGrupo) {
        this.idCatedraticoSemestreGrupo = idCatedraticoSemestreGrupo;
    }

    public Integer getIdCatedraticoSemestreGrupo() {
        return idCatedraticoSemestreGrupo;
    }

    public void setIdCatedraticoSemestreGrupo(Integer idCatedraticoSemestreGrupo) {
        this.idCatedraticoSemestreGrupo = idCatedraticoSemestreGrupo;
    }

    public Catedraticos getFkIdCatedratico() {
        return fkIdCatedratico;
    }

    public void setFkIdCatedratico(Catedraticos fkIdCatedratico) {
        this.fkIdCatedratico = fkIdCatedratico;
    }

    public SemestreGrupo getFkIdSemestreGrupo() {
        return fkIdSemestreGrupo;
    }

    public void setFkIdSemestreGrupo(SemestreGrupo fkIdSemestreGrupo) {
        this.fkIdSemestreGrupo = fkIdSemestreGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatedraticoSemestreGrupo != null ? idCatedraticoSemestreGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatedraticoGrupo)) {
            return false;
        }
        CatedraticoGrupo other = (CatedraticoGrupo) object;
        if ((this.idCatedraticoSemestreGrupo == null && other.idCatedraticoSemestreGrupo != null) || (this.idCatedraticoSemestreGrupo != null && !this.idCatedraticoSemestreGrupo.equals(other.idCatedraticoSemestreGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.CatedraticoGrupo[ idCatedraticoSemestreGrupo=" + idCatedraticoSemestreGrupo + " ]";
    }
    
}
