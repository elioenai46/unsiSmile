/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "signos_vitales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SignosVitales.findAll", query = "SELECT s FROM SignosVitales s"),
    @NamedQuery(name = "SignosVitales.findByIdSignosVitales", query = "SELECT s FROM SignosVitales s WHERE s.idSignosVitales = :idSignosVitales"),
    @NamedQuery(name = "SignosVitales.findByPeso", query = "SELECT s FROM SignosVitales s WHERE s.peso = :peso"),
    @NamedQuery(name = "SignosVitales.findByEstatura", query = "SELECT s FROM SignosVitales s WHERE s.estatura = :estatura"),
    @NamedQuery(name = "SignosVitales.findByTemperatura", query = "SELECT s FROM SignosVitales s WHERE s.temperatura = :temperatura"),
    @NamedQuery(name = "SignosVitales.findByFrecuenciaCardiaca", query = "SELECT s FROM SignosVitales s WHERE s.frecuenciaCardiaca = :frecuenciaCardiaca"),
    @NamedQuery(name = "SignosVitales.findByFrecuenciaRespiratoria", query = "SELECT s FROM SignosVitales s WHERE s.frecuenciaRespiratoria = :frecuenciaRespiratoria"),
    @NamedQuery(name = "SignosVitales.findByPesionArterial", query = "SELECT s FROM SignosVitales s WHERE s.pesionArterial = :pesionArterial"),
    @NamedQuery(name = "SignosVitales.findBySaturacionOxigeno", query = "SELECT s FROM SignosVitales s WHERE s.saturacionOxigeno = :saturacionOxigeno"),
    @NamedQuery(name = "SignosVitales.findByGlucosa", query = "SELECT s FROM SignosVitales s WHERE s.glucosa = :glucosa"),
    @NamedQuery(name = "SignosVitales.findByPulso", query = "SELECT s FROM SignosVitales s WHERE s.pulso = :pulso")})
public class SignosVitales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_signos_vitales")
    private Integer idSignosVitales;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private Double peso;
    @Column(name = "estatura")
    private Double estatura;
    @Column(name = "temperatura")
    private Double temperatura;
    @Column(name = "frecuencia_cardiaca")
    private Double frecuenciaCardiaca;
    @Column(name = "frecuencia_respiratoria")
    private Double frecuenciaRespiratoria;
    @Column(name = "pesion_arterial")
    private Double pesionArterial;
    @Column(name = "saturacion_oxigeno")
    private Double saturacionOxigeno;
    @Column(name = "glucosa")
    private Double glucosa;
    @Column(name = "pulso")
    private Double pulso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdSignosVitales")
    private Collection<Consulta> consultaCollection;
    @OneToMany(mappedBy = "fkIdSignosVitales")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public SignosVitales() {
    }

    public SignosVitales(Integer idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    public Integer getIdSignosVitales() {
        return idSignosVitales;
    }

    public void setIdSignosVitales(Integer idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(Double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public Double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(Double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public Double getPesionArterial() {
        return pesionArterial;
    }

    public void setPesionArterial(Double pesionArterial) {
        this.pesionArterial = pesionArterial;
    }

    public Double getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(Double saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public Double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(Double glucosa) {
        this.glucosa = glucosa;
    }

    public Double getPulso() {
        return pulso;
    }

    public void setPulso(Double pulso) {
        this.pulso = pulso;
    }

    @XmlTransient
    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
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
        hash += (idSignosVitales != null ? idSignosVitales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SignosVitales)) {
            return false;
        }
        SignosVitales other = (SignosVitales) object;
        if ((this.idSignosVitales == null && other.idSignosVitales != null) || (this.idSignosVitales != null && !this.idSignosVitales.equals(other.idSignosVitales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.SignosVitales[ idSignosVitales=" + idSignosVitales + " ]";
    }
    
}
