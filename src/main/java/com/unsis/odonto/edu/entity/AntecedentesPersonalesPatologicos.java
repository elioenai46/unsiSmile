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
@Table(name = "antecedentes_personales_patologicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findAll", query = "SELECT a FROM AntecedentesPersonalesPatologicos a"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByIdAntecedentesPersonalesPatologicos", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.idAntecedentesPersonalesPatologicos = :idAntecedentesPersonalesPatologicos"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByTabaquismo", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.tabaquismo = :tabaquismo"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByAlcoholismo", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.alcoholismo = :alcoholismo"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByOtrasSustanciasPsicoactivasRecreativas", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.otrasSustanciasPsicoactivasRecreativas = :otrasSustanciasPsicoactivasRecreativas"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByPerforaciones", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.perforaciones = :perforaciones"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByTatuajes", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.tatuajes = :tatuajes"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByNeoplastia", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.neoplastia = :neoplastia"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByDiabetes", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.diabetes = :diabetes"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByHipertensionArterial", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.hipertensionArterial = :hipertensionArterial"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByPedecimientosMentales", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.pedecimientosMentales = :pedecimientosMentales"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByObesidadDiagnosticada", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.obesidadDiagnosticada = :obesidadDiagnosticada"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByPadecimientosHematologicos", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.padecimientosHematologicos = :padecimientosHematologicos"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByMalformacionesCongenitasSindromes", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.malformacionesCongenitasSindromes = :malformacionesCongenitasSindromes"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByProblemasCardiacos", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.problemasCardiacos = :problemasCardiacos"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByRadioterapiaQuimioterapia", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.radioterapiaQuimioterapia = :radioterapiaQuimioterapia"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByPadecimientosReumatologicos", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.padecimientosReumatologicos = :padecimientosReumatologicos"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByEnfermedadesDelRinion", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.enfermedadesDelRinion = :enfermedadesDelRinion"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByEts", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.ets = :ets"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByHipertiroidismoHipotiroidismo", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.hipertiroidismoHipotiroidismo = :hipertiroidismoHipotiroidismo"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByEnfermedadesDeViasAereas", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.enfermedadesDeViasAereas = :enfermedadesDeViasAereas"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByProbleamasOculares", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.probleamasOculares = :probleamasOculares"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByEnfermedadesDigestivas", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.enfermedadesDigestivas = :enfermedadesDigestivas"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByTuberculosis", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.tuberculosis = :tuberculosis"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByEnfermedadesDeLaPiel", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.enfermedadesDeLaPiel = :enfermedadesDeLaPiel"),
    @NamedQuery(name = "AntecedentesPersonalesPatologicos.findByTrasplantesDeOrganos", query = "SELECT a FROM AntecedentesPersonalesPatologicos a WHERE a.trasplantesDeOrganos = :trasplantesDeOrganos")})
public class AntecedentesPersonalesPatologicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_antecedentes_personales_patologicos")
    private Integer idAntecedentesPersonalesPatologicos;
    @Column(name = "tabaquismo")
    private Boolean tabaquismo;
    @Column(name = "alcoholismo")
    private Boolean alcoholismo;
    @Column(name = "otras_sustancias_psicoactivas_recreativas")
    private Boolean otrasSustanciasPsicoactivasRecreativas;
    @Column(name = "perforaciones")
    private Boolean perforaciones;
    @Column(name = "tatuajes")
    private Boolean tatuajes;
    @Column(name = "neoplastia")
    private Boolean neoplastia;
    @Column(name = "diabetes")
    private Boolean diabetes;
    @Column(name = "hipertension_arterial")
    private Boolean hipertensionArterial;
    @Column(name = "pedecimientos_mentales")
    private Boolean pedecimientosMentales;
    @Column(name = "obesidad_diagnosticada")
    private Boolean obesidadDiagnosticada;
    @Column(name = "padecimientos_hematologicos")
    private Boolean padecimientosHematologicos;
    @Column(name = "malformaciones_congenitas_sindromes")
    private Boolean malformacionesCongenitasSindromes;
    @Column(name = "problemas_cardiacos")
    private Boolean problemasCardiacos;
    @Column(name = "radioterapia_quimioterapia")
    private Boolean radioterapiaQuimioterapia;
    @Column(name = "padecimientos_reumatologicos")
    private Boolean padecimientosReumatologicos;
    @Column(name = "enfermedades_del_rinion")
    private Boolean enfermedadesDelRinion;
    @Column(name = "ets")
    private Boolean ets;
    @Column(name = "hipertiroidismo_hipotiroidismo")
    private Boolean hipertiroidismoHipotiroidismo;
    @Column(name = "enfermedades_de_vias_aereas")
    private Boolean enfermedadesDeViasAereas;
    @Column(name = "probleamas_oculares")
    private Boolean probleamasOculares;
    @Column(name = "enfermedades_digestivas")
    private Boolean enfermedadesDigestivas;
    @Column(name = "tuberculosis")
    private Boolean tuberculosis;
    @Column(name = "enfermedades_de_la_piel")
    private Boolean enfermedadesDeLaPiel;
    @Column(name = "trasplantes_de_organos")
    private Boolean trasplantesDeOrganos;
    @Lob
    @Column(name = "ha_sido_hospitalizado")
    private String haSidoHospitalizado;
    @Lob
    @Column(name = "ha_tomado_un_medicamento_recientemente")
    private String haTomadoUnMedicamentoRecientemente;
    @Lob
    @Column(name = "ha_tenido_algun_problema_con_anestesia")
    private String haTenidoAlgunProblemaConAnestesia;
    @Lob
    @Column(name = "alergia_medicamento_sustancia")
    private String alergiaMedicamentoSustancia;
    @Lob
    @Column(name = "embarazo")
    private String embarazo;
    @Lob
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "fkIdAntecedentesPersonalesPatologicos")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public AntecedentesPersonalesPatologicos() {
    }

    public AntecedentesPersonalesPatologicos(Integer idAntecedentesPersonalesPatologicos) {
        this.idAntecedentesPersonalesPatologicos = idAntecedentesPersonalesPatologicos;
    }

    public Integer getIdAntecedentesPersonalesPatologicos() {
        return idAntecedentesPersonalesPatologicos;
    }

    public void setIdAntecedentesPersonalesPatologicos(Integer idAntecedentesPersonalesPatologicos) {
        this.idAntecedentesPersonalesPatologicos = idAntecedentesPersonalesPatologicos;
    }

    public Boolean getTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(Boolean tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public Boolean getAlcoholismo() {
        return alcoholismo;
    }

    public void setAlcoholismo(Boolean alcoholismo) {
        this.alcoholismo = alcoholismo;
    }

    public Boolean getOtrasSustanciasPsicoactivasRecreativas() {
        return otrasSustanciasPsicoactivasRecreativas;
    }

    public void setOtrasSustanciasPsicoactivasRecreativas(Boolean otrasSustanciasPsicoactivasRecreativas) {
        this.otrasSustanciasPsicoactivasRecreativas = otrasSustanciasPsicoactivasRecreativas;
    }

    public Boolean getPerforaciones() {
        return perforaciones;
    }

    public void setPerforaciones(Boolean perforaciones) {
        this.perforaciones = perforaciones;
    }

    public Boolean getTatuajes() {
        return tatuajes;
    }

    public void setTatuajes(Boolean tatuajes) {
        this.tatuajes = tatuajes;
    }

    public Boolean getNeoplastia() {
        return neoplastia;
    }

    public void setNeoplastia(Boolean neoplastia) {
        this.neoplastia = neoplastia;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getHipertensionArterial() {
        return hipertensionArterial;
    }

    public void setHipertensionArterial(Boolean hipertensionArterial) {
        this.hipertensionArterial = hipertensionArterial;
    }

    public Boolean getPedecimientosMentales() {
        return pedecimientosMentales;
    }

    public void setPedecimientosMentales(Boolean pedecimientosMentales) {
        this.pedecimientosMentales = pedecimientosMentales;
    }

    public Boolean getObesidadDiagnosticada() {
        return obesidadDiagnosticada;
    }

    public void setObesidadDiagnosticada(Boolean obesidadDiagnosticada) {
        this.obesidadDiagnosticada = obesidadDiagnosticada;
    }

    public Boolean getPadecimientosHematologicos() {
        return padecimientosHematologicos;
    }

    public void setPadecimientosHematologicos(Boolean padecimientosHematologicos) {
        this.padecimientosHematologicos = padecimientosHematologicos;
    }

    public Boolean getMalformacionesCongenitasSindromes() {
        return malformacionesCongenitasSindromes;
    }

    public void setMalformacionesCongenitasSindromes(Boolean malformacionesCongenitasSindromes) {
        this.malformacionesCongenitasSindromes = malformacionesCongenitasSindromes;
    }

    public Boolean getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(Boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public Boolean getRadioterapiaQuimioterapia() {
        return radioterapiaQuimioterapia;
    }

    public void setRadioterapiaQuimioterapia(Boolean radioterapiaQuimioterapia) {
        this.radioterapiaQuimioterapia = radioterapiaQuimioterapia;
    }

    public Boolean getPadecimientosReumatologicos() {
        return padecimientosReumatologicos;
    }

    public void setPadecimientosReumatologicos(Boolean padecimientosReumatologicos) {
        this.padecimientosReumatologicos = padecimientosReumatologicos;
    }

    public Boolean getEnfermedadesDelRinion() {
        return enfermedadesDelRinion;
    }

    public void setEnfermedadesDelRinion(Boolean enfermedadesDelRinion) {
        this.enfermedadesDelRinion = enfermedadesDelRinion;
    }

    public Boolean getEts() {
        return ets;
    }

    public void setEts(Boolean ets) {
        this.ets = ets;
    }

    public Boolean getHipertiroidismoHipotiroidismo() {
        return hipertiroidismoHipotiroidismo;
    }

    public void setHipertiroidismoHipotiroidismo(Boolean hipertiroidismoHipotiroidismo) {
        this.hipertiroidismoHipotiroidismo = hipertiroidismoHipotiroidismo;
    }

    public Boolean getEnfermedadesDeViasAereas() {
        return enfermedadesDeViasAereas;
    }

    public void setEnfermedadesDeViasAereas(Boolean enfermedadesDeViasAereas) {
        this.enfermedadesDeViasAereas = enfermedadesDeViasAereas;
    }

    public Boolean getProbleamasOculares() {
        return probleamasOculares;
    }

    public void setProbleamasOculares(Boolean probleamasOculares) {
        this.probleamasOculares = probleamasOculares;
    }

    public Boolean getEnfermedadesDigestivas() {
        return enfermedadesDigestivas;
    }

    public void setEnfermedadesDigestivas(Boolean enfermedadesDigestivas) {
        this.enfermedadesDigestivas = enfermedadesDigestivas;
    }

    public Boolean getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(Boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public Boolean getEnfermedadesDeLaPiel() {
        return enfermedadesDeLaPiel;
    }

    public void setEnfermedadesDeLaPiel(Boolean enfermedadesDeLaPiel) {
        this.enfermedadesDeLaPiel = enfermedadesDeLaPiel;
    }

    public Boolean getTrasplantesDeOrganos() {
        return trasplantesDeOrganos;
    }

    public void setTrasplantesDeOrganos(Boolean trasplantesDeOrganos) {
        this.trasplantesDeOrganos = trasplantesDeOrganos;
    }

    public String getHaSidoHospitalizado() {
        return haSidoHospitalizado;
    }

    public void setHaSidoHospitalizado(String haSidoHospitalizado) {
        this.haSidoHospitalizado = haSidoHospitalizado;
    }

    public String getHaTomadoUnMedicamentoRecientemente() {
        return haTomadoUnMedicamentoRecientemente;
    }

    public void setHaTomadoUnMedicamentoRecientemente(String haTomadoUnMedicamentoRecientemente) {
        this.haTomadoUnMedicamentoRecientemente = haTomadoUnMedicamentoRecientemente;
    }

    public String getHaTenidoAlgunProblemaConAnestesia() {
        return haTenidoAlgunProblemaConAnestesia;
    }

    public void setHaTenidoAlgunProblemaConAnestesia(String haTenidoAlgunProblemaConAnestesia) {
        this.haTenidoAlgunProblemaConAnestesia = haTenidoAlgunProblemaConAnestesia;
    }

    public String getAlergiaMedicamentoSustancia() {
        return alergiaMedicamentoSustancia;
    }

    public void setAlergiaMedicamentoSustancia(String alergiaMedicamentoSustancia) {
        this.alergiaMedicamentoSustancia = alergiaMedicamentoSustancia;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        hash += (idAntecedentesPersonalesPatologicos != null ? idAntecedentesPersonalesPatologicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPersonalesPatologicos)) {
            return false;
        }
        AntecedentesPersonalesPatologicos other = (AntecedentesPersonalesPatologicos) object;
        if ((this.idAntecedentesPersonalesPatologicos == null && other.idAntecedentesPersonalesPatologicos != null) || (this.idAntecedentesPersonalesPatologicos != null && !this.idAntecedentesPersonalesPatologicos.equals(other.idAntecedentesPersonalesPatologicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AntecedentesPersonalesPatologicos[ idAntecedentesPersonalesPatologicos=" + idAntecedentesPersonalesPatologicos + " ]";
    }
    
}
