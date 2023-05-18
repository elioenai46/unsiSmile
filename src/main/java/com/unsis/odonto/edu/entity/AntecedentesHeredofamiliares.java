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
@Table(name = "antecedentes_heredofamiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AntecedentesHeredofamiliares.findAll", query = "SELECT a FROM AntecedentesHeredofamiliares a"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByIdAntecedentesHeredofamiliares", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.idAntecedentesHeredofamiliares = :idAntecedentesHeredofamiliares"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByNeoplacia", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.neoplacia = :neoplacia"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByDiabetes", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.diabetes = :diabetes"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByHipertencion", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.hipertencion = :hipertencion"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByPadecimientosMentalesNeurologicos", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.padecimientosMentalesNeurologicos = :padecimientosMentalesNeurologicos"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByObecidad", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.obecidad = :obecidad"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByPadecimientosHematologicos", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.padecimientosHematologicos = :padecimientosHematologicos"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByMalformacionesCongenitas", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.malformacionesCongenitas = :malformacionesCongenitas"),
    @NamedQuery(name = "AntecedentesHeredofamiliares.findByProblemasCardiacos", query = "SELECT a FROM AntecedentesHeredofamiliares a WHERE a.problemasCardiacos = :problemasCardiacos")})
public class AntecedentesHeredofamiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_antecedentes_heredofamiliares")
    private Integer idAntecedentesHeredofamiliares;
    @Column(name = "Neoplacia")
    private Boolean neoplacia;
    @Lob
    @Column(name = "Neoplacia_rAmplia")
    private String neoplaciarAmplia;
    @Column(name = "diabetes")
    private Boolean diabetes;
    @Lob
    @Column(name = "diabetes_amplio")
    private String diabetesAmplio;
    @Column(name = "hipertencion")
    private Boolean hipertencion;
    @Lob
    @Column(name = "hipertencion_amplio")
    private String hipertencionAmplio;
    @Column(name = "padecimientos_mentales_neurologicos")
    private Boolean padecimientosMentalesNeurologicos;
    @Lob
    @Column(name = "padecimientos_mentales_neurologicos_amplio")
    private String padecimientosMentalesNeurologicosAmplio;
    @Column(name = "obecidad")
    private Boolean obecidad;
    @Lob
    @Column(name = "obecidad_amplio")
    private String obecidadAmplio;
    @Column(name = "padecimientos_hematologicos")
    private Boolean padecimientosHematologicos;
    @Lob
    @Column(name = "padecimientos_hematologicos_amplio")
    private String padecimientosHematologicosAmplio;
    @Column(name = "malformaciones_congenitas")
    private Boolean malformacionesCongenitas;
    @Lob
    @Column(name = "malformaciones_congenitas_amplio")
    private String malformacionesCongenitasAmplio;
    @Column(name = "problemas_cardiacos")
    private Boolean problemasCardiacos;
    @Lob
    @Column(name = "problemas_cardiacos_amplio")
    private String problemasCardiacosAmplio;
    @OneToMany(mappedBy = "fkIdAntecedentesHeredofamiliares")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public AntecedentesHeredofamiliares() {
    }

    public AntecedentesHeredofamiliares(Integer idAntecedentesHeredofamiliares) {
        this.idAntecedentesHeredofamiliares = idAntecedentesHeredofamiliares;
    }

    public Integer getIdAntecedentesHeredofamiliares() {
        return idAntecedentesHeredofamiliares;
    }

    public void setIdAntecedentesHeredofamiliares(Integer idAntecedentesHeredofamiliares) {
        this.idAntecedentesHeredofamiliares = idAntecedentesHeredofamiliares;
    }

    public Boolean getNeoplacia() {
        return neoplacia;
    }

    public void setNeoplacia(Boolean neoplacia) {
        this.neoplacia = neoplacia;
    }

    public String getNeoplaciarAmplia() {
        return neoplaciarAmplia;
    }

    public void setNeoplaciarAmplia(String neoplaciarAmplia) {
        this.neoplaciarAmplia = neoplaciarAmplia;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetesAmplio() {
        return diabetesAmplio;
    }

    public void setDiabetesAmplio(String diabetesAmplio) {
        this.diabetesAmplio = diabetesAmplio;
    }

    public Boolean getHipertencion() {
        return hipertencion;
    }

    public void setHipertencion(Boolean hipertencion) {
        this.hipertencion = hipertencion;
    }

    public String getHipertencionAmplio() {
        return hipertencionAmplio;
    }

    public void setHipertencionAmplio(String hipertencionAmplio) {
        this.hipertencionAmplio = hipertencionAmplio;
    }

    public Boolean getPadecimientosMentalesNeurologicos() {
        return padecimientosMentalesNeurologicos;
    }

    public void setPadecimientosMentalesNeurologicos(Boolean padecimientosMentalesNeurologicos) {
        this.padecimientosMentalesNeurologicos = padecimientosMentalesNeurologicos;
    }

    public String getPadecimientosMentalesNeurologicosAmplio() {
        return padecimientosMentalesNeurologicosAmplio;
    }

    public void setPadecimientosMentalesNeurologicosAmplio(String padecimientosMentalesNeurologicosAmplio) {
        this.padecimientosMentalesNeurologicosAmplio = padecimientosMentalesNeurologicosAmplio;
    }

    public Boolean getObecidad() {
        return obecidad;
    }

    public void setObecidad(Boolean obecidad) {
        this.obecidad = obecidad;
    }

    public String getObecidadAmplio() {
        return obecidadAmplio;
    }

    public void setObecidadAmplio(String obecidadAmplio) {
        this.obecidadAmplio = obecidadAmplio;
    }

    public Boolean getPadecimientosHematologicos() {
        return padecimientosHematologicos;
    }

    public void setPadecimientosHematologicos(Boolean padecimientosHematologicos) {
        this.padecimientosHematologicos = padecimientosHematologicos;
    }

    public String getPadecimientosHematologicosAmplio() {
        return padecimientosHematologicosAmplio;
    }

    public void setPadecimientosHematologicosAmplio(String padecimientosHematologicosAmplio) {
        this.padecimientosHematologicosAmplio = padecimientosHematologicosAmplio;
    }

    public Boolean getMalformacionesCongenitas() {
        return malformacionesCongenitas;
    }

    public void setMalformacionesCongenitas(Boolean malformacionesCongenitas) {
        this.malformacionesCongenitas = malformacionesCongenitas;
    }

    public String getMalformacionesCongenitasAmplio() {
        return malformacionesCongenitasAmplio;
    }

    public void setMalformacionesCongenitasAmplio(String malformacionesCongenitasAmplio) {
        this.malformacionesCongenitasAmplio = malformacionesCongenitasAmplio;
    }

    public Boolean getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(Boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public String getProblemasCardiacosAmplio() {
        return problemasCardiacosAmplio;
    }

    public void setProblemasCardiacosAmplio(String problemasCardiacosAmplio) {
        this.problemasCardiacosAmplio = problemasCardiacosAmplio;
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
        hash += (idAntecedentesHeredofamiliares != null ? idAntecedentesHeredofamiliares.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesHeredofamiliares)) {
            return false;
        }
        AntecedentesHeredofamiliares other = (AntecedentesHeredofamiliares) object;
        if ((this.idAntecedentesHeredofamiliares == null && other.idAntecedentesHeredofamiliares != null) || (this.idAntecedentesHeredofamiliares != null && !this.idAntecedentesHeredofamiliares.equals(other.idAntecedentesHeredofamiliares))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AntecedentesHeredofamiliares[ idAntecedentesHeredofamiliares=" + idAntecedentesHeredofamiliares + " ]";
    }
    
}
