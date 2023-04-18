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
@Table(name = "analisis_radiografico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnalisisRadiografico.findAll", query = "SELECT a FROM AnalisisRadiografico a"),
    @NamedQuery(name = "AnalisisRadiografico.findByIdAnalisisRadiografico", query = "SELECT a FROM AnalisisRadiografico a WHERE a.idAnalisisRadiografico = :idAnalisisRadiografico")})
public class AnalisisRadiografico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_radiografico")
    private Integer idAnalisisRadiografico;
    @Lob
    @Column(name = "Periapical")
    private String periapical;
    @Lob
    @Column(name = "cefalica_lateral")
    private String cefalicaLateral;
    @Lob
    @Column(name = "Panoramica")
    private String panoramica;
    @OneToMany(mappedBy = "fkIdAnalisisRadiografico")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;

    public AnalisisRadiografico() {
    }

    public AnalisisRadiografico(Integer idAnalisisRadiografico) {
        this.idAnalisisRadiografico = idAnalisisRadiografico;
    }

    public Integer getIdAnalisisRadiografico() {
        return idAnalisisRadiografico;
    }

    public void setIdAnalisisRadiografico(Integer idAnalisisRadiografico) {
        this.idAnalisisRadiografico = idAnalisisRadiografico;
    }

    public String getPeriapical() {
        return periapical;
    }

    public void setPeriapical(String periapical) {
        this.periapical = periapical;
    }

    public String getCefalicaLateral() {
        return cefalicaLateral;
    }

    public void setCefalicaLateral(String cefalicaLateral) {
        this.cefalicaLateral = cefalicaLateral;
    }

    public String getPanoramica() {
        return panoramica;
    }

    public void setPanoramica(String panoramica) {
        this.panoramica = panoramica;
    }

    @XmlTransient
    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection() {
        return historiaClinicaGeneralCollection;
    }

    public void setHistoriaClinicaGeneralCollection(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection) {
        this.historiaClinicaGeneralCollection = historiaClinicaGeneralCollection;
    }

    public Paciente getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(Paciente fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalisisRadiografico != null ? idAnalisisRadiografico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisRadiografico)) {
            return false;
        }
        AnalisisRadiografico other = (AnalisisRadiografico) object;
        if ((this.idAnalisisRadiografico == null && other.idAnalisisRadiografico != null) || (this.idAnalisisRadiografico != null && !this.idAnalisisRadiografico.equals(other.idAnalisisRadiografico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AnalisisRadiografico[ idAnalisisRadiografico=" + idAnalisisRadiografico + " ]";
    }
    
}
