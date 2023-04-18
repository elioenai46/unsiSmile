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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "examen_facial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamenFacial.findAll", query = "SELECT e FROM ExamenFacial e"),
    @NamedQuery(name = "ExamenFacial.findByIdExamenFacial", query = "SELECT e FROM ExamenFacial e WHERE e.idExamenFacial = :idExamenFacial")})
public class ExamenFacial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_examen_facial")
    private Integer idExamenFacial;
    @Lob
    @Column(name = "perfil")
    private String perfil;
    @Lob
    @Column(name = "frente")
    private String frente;
    @Lob
    @Column(name = "senias_particulares")
    private String seniasParticulares;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;
    @OneToMany(mappedBy = "fkIdExamenFacial")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public ExamenFacial() {
    }

    public ExamenFacial(Integer idExamenFacial) {
        this.idExamenFacial = idExamenFacial;
    }

    public Integer getIdExamenFacial() {
        return idExamenFacial;
    }

    public void setIdExamenFacial(Integer idExamenFacial) {
        this.idExamenFacial = idExamenFacial;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public String getSeniasParticulares() {
        return seniasParticulares;
    }

    public void setSeniasParticulares(String seniasParticulares) {
        this.seniasParticulares = seniasParticulares;
    }

    public Paciente getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(Paciente fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
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
        hash += (idExamenFacial != null ? idExamenFacial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenFacial)) {
            return false;
        }
        ExamenFacial other = (ExamenFacial) object;
        if ((this.idExamenFacial == null && other.idExamenFacial != null) || (this.idExamenFacial != null && !this.idExamenFacial.equals(other.idExamenFacial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.ExamenFacial[ idExamenFacial=" + idExamenFacial + " ]";
    }
    
}
