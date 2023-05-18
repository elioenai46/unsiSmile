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
@Table(name = "historia_clinica_general")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaClinicaGeneral.findAll", query = "SELECT h FROM HistoriaClinicaGeneral h"),
    @NamedQuery(name = "HistoriaClinicaGeneral.findByIdHistoriaClinicaGeneral", query = "SELECT h FROM HistoriaClinicaGeneral h WHERE h.idHistoriaClinicaGeneral = :idHistoriaClinicaGeneral")})
public class HistoriaClinicaGeneral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historia_clinica_general")
    private Integer idHistoriaClinicaGeneral;
    @JoinColumn(name = "fk_id_antecedentes_personales_patologicos", referencedColumnName = "id_antecedentes_personales_patologicos")
    @ManyToOne
    private AntecedentesPersonalesPatologicos fkIdAntecedentesPersonalesPatologicos;
    @JoinColumn(name = "fk_id_analisis_funcional", referencedColumnName = "id_analisis_funcional")
    @ManyToOne
    private AnalisisFuncional fkIdAnalisisFuncional;
    @JoinColumn(name = "fk_id_analisis_radiografico", referencedColumnName = "id_analisis_radiografico")
    @ManyToOne
    private AnalisisRadiografico fkIdAnalisisRadiografico;
    @JoinColumn(name = "fk_id_antecedentes_heredofamiliares", referencedColumnName = "id_antecedentes_heredofamiliares")
    @ManyToOne
    private AntecedentesHeredofamiliares fkIdAntecedentesHeredofamiliares;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;
    @JoinColumn(name = "fk_id_antecedentes_personales_no_patologicos", referencedColumnName = "id_antecedentes_personales_no_patologicos")
    @ManyToOne
    private AntecedentesPersonalesNoPatologicos fkIdAntecedentesPersonalesNoPatologicos;
    @JoinColumn(name = "fk_id_catedratico_responsable", referencedColumnName = "id_catedratico")
    @ManyToOne(optional = false)
    private Catedraticos fkIdCatedraticoResponsable;
    @JoinColumn(name = "fk_id_odontograma_inicial", referencedColumnName = "id_odontograma")
    @ManyToOne
    private Odontograma fkIdOdontogramaInicial;
    @JoinColumn(name = "fk_id_estudio_de_laboratorio_biopsia", referencedColumnName = "id_estudio_de_laboratorio_biopsia")
    @ManyToOne
    private EstudioDeLaboratorioBiopsia fkIdEstudioDeLaboratorioBiopsia;
    @JoinColumn(name = "fk_id_examen_bucal", referencedColumnName = "id_examen_bucal")
    @ManyToOne
    private ExamenBucal fkIdExamenBucal;
    @JoinColumn(name = "fk_id_odontograma_final", referencedColumnName = "id_odontograma")
    @ManyToOne
    private Odontograma fkIdOdontogramaFinal;
    @JoinColumn(name = "fk_id_postura_del_paciente", referencedColumnName = "id_postura_del_paciente")
    @ManyToOne
    private PosturaDelPaciente fkIdPosturaDelPaciente;
    @JoinColumn(name = "fk_id_signos_vitales", referencedColumnName = "id_signos_vitales")
    @ManyToOne
    private SignosVitales fkIdSignosVitales;
    @JoinColumn(name = "fk_id_examen_clinico", referencedColumnName = "id_examen_clinico")
    @ManyToOne
    private ExamenClinico fkIdExamenClinico;
    @JoinColumn(name = "fk_id_examen_facial", referencedColumnName = "id_examen_facial")
    @ManyToOne
    private ExamenFacial fkIdExamenFacial;
    @JoinColumn(name = "fk_id_interconsulta_medica", referencedColumnName = "id_interconsulta_medica")
    @ManyToOne
    private InterconsultaMedica fkIdInterconsultaMedica;
    @JoinColumn(name = "fk_id_modelos_de_estudio_fotografias", referencedColumnName = "id_modelos_de_estudio_fotografias")
    @ManyToOne
    private ModelosDeEstudioFotografias fkIdModelosDeEstudioFotografias;

    public HistoriaClinicaGeneral() {
    }

    public HistoriaClinicaGeneral(Integer idHistoriaClinicaGeneral) {
        this.idHistoriaClinicaGeneral = idHistoriaClinicaGeneral;
    }

    public Integer getIdHistoriaClinicaGeneral() {
        return idHistoriaClinicaGeneral;
    }

    public void setIdHistoriaClinicaGeneral(Integer idHistoriaClinicaGeneral) {
        this.idHistoriaClinicaGeneral = idHistoriaClinicaGeneral;
    }

    public AntecedentesPersonalesPatologicos getFkIdAntecedentesPersonalesPatologicos() {
        return fkIdAntecedentesPersonalesPatologicos;
    }

    public void setFkIdAntecedentesPersonalesPatologicos(AntecedentesPersonalesPatologicos fkIdAntecedentesPersonalesPatologicos) {
        this.fkIdAntecedentesPersonalesPatologicos = fkIdAntecedentesPersonalesPatologicos;
    }

    public AnalisisFuncional getFkIdAnalisisFuncional() {
        return fkIdAnalisisFuncional;
    }

    public void setFkIdAnalisisFuncional(AnalisisFuncional fkIdAnalisisFuncional) {
        this.fkIdAnalisisFuncional = fkIdAnalisisFuncional;
    }

    public AnalisisRadiografico getFkIdAnalisisRadiografico() {
        return fkIdAnalisisRadiografico;
    }

    public void setFkIdAnalisisRadiografico(AnalisisRadiografico fkIdAnalisisRadiografico) {
        this.fkIdAnalisisRadiografico = fkIdAnalisisRadiografico;
    }

    public AntecedentesHeredofamiliares getFkIdAntecedentesHeredofamiliares() {
        return fkIdAntecedentesHeredofamiliares;
    }

    public void setFkIdAntecedentesHeredofamiliares(AntecedentesHeredofamiliares fkIdAntecedentesHeredofamiliares) {
        this.fkIdAntecedentesHeredofamiliares = fkIdAntecedentesHeredofamiliares;
    }

    public Paciente getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(Paciente fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
    }

    public AntecedentesPersonalesNoPatologicos getFkIdAntecedentesPersonalesNoPatologicos() {
        return fkIdAntecedentesPersonalesNoPatologicos;
    }

    public void setFkIdAntecedentesPersonalesNoPatologicos(AntecedentesPersonalesNoPatologicos fkIdAntecedentesPersonalesNoPatologicos) {
        this.fkIdAntecedentesPersonalesNoPatologicos = fkIdAntecedentesPersonalesNoPatologicos;
    }

    public Catedraticos getFkIdCatedraticoResponsable() {
        return fkIdCatedraticoResponsable;
    }

    public void setFkIdCatedraticoResponsable(Catedraticos fkIdCatedraticoResponsable) {
        this.fkIdCatedraticoResponsable = fkIdCatedraticoResponsable;
    }

    public Odontograma getFkIdOdontogramaInicial() {
        return fkIdOdontogramaInicial;
    }

    public void setFkIdOdontogramaInicial(Odontograma fkIdOdontogramaInicial) {
        this.fkIdOdontogramaInicial = fkIdOdontogramaInicial;
    }

    public EstudioDeLaboratorioBiopsia getFkIdEstudioDeLaboratorioBiopsia() {
        return fkIdEstudioDeLaboratorioBiopsia;
    }

    public void setFkIdEstudioDeLaboratorioBiopsia(EstudioDeLaboratorioBiopsia fkIdEstudioDeLaboratorioBiopsia) {
        this.fkIdEstudioDeLaboratorioBiopsia = fkIdEstudioDeLaboratorioBiopsia;
    }

    public ExamenBucal getFkIdExamenBucal() {
        return fkIdExamenBucal;
    }

    public void setFkIdExamenBucal(ExamenBucal fkIdExamenBucal) {
        this.fkIdExamenBucal = fkIdExamenBucal;
    }

    public Odontograma getFkIdOdontogramaFinal() {
        return fkIdOdontogramaFinal;
    }

    public void setFkIdOdontogramaFinal(Odontograma fkIdOdontogramaFinal) {
        this.fkIdOdontogramaFinal = fkIdOdontogramaFinal;
    }

    public PosturaDelPaciente getFkIdPosturaDelPaciente() {
        return fkIdPosturaDelPaciente;
    }

    public void setFkIdPosturaDelPaciente(PosturaDelPaciente fkIdPosturaDelPaciente) {
        this.fkIdPosturaDelPaciente = fkIdPosturaDelPaciente;
    }

    public SignosVitales getFkIdSignosVitales() {
        return fkIdSignosVitales;
    }

    public void setFkIdSignosVitales(SignosVitales fkIdSignosVitales) {
        this.fkIdSignosVitales = fkIdSignosVitales;
    }

    public ExamenClinico getFkIdExamenClinico() {
        return fkIdExamenClinico;
    }

    public void setFkIdExamenClinico(ExamenClinico fkIdExamenClinico) {
        this.fkIdExamenClinico = fkIdExamenClinico;
    }

    public ExamenFacial getFkIdExamenFacial() {
        return fkIdExamenFacial;
    }

    public void setFkIdExamenFacial(ExamenFacial fkIdExamenFacial) {
        this.fkIdExamenFacial = fkIdExamenFacial;
    }

    public InterconsultaMedica getFkIdInterconsultaMedica() {
        return fkIdInterconsultaMedica;
    }

    public void setFkIdInterconsultaMedica(InterconsultaMedica fkIdInterconsultaMedica) {
        this.fkIdInterconsultaMedica = fkIdInterconsultaMedica;
    }

    public ModelosDeEstudioFotografias getFkIdModelosDeEstudioFotografias() {
        return fkIdModelosDeEstudioFotografias;
    }

    public void setFkIdModelosDeEstudioFotografias(ModelosDeEstudioFotografias fkIdModelosDeEstudioFotografias) {
        this.fkIdModelosDeEstudioFotografias = fkIdModelosDeEstudioFotografias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoriaClinicaGeneral != null ? idHistoriaClinicaGeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinicaGeneral)) {
            return false;
        }
        HistoriaClinicaGeneral other = (HistoriaClinicaGeneral) object;
        if ((this.idHistoriaClinicaGeneral == null && other.idHistoriaClinicaGeneral != null) || (this.idHistoriaClinicaGeneral != null && !this.idHistoriaClinicaGeneral.equals(other.idHistoriaClinicaGeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.HistoriaClinicaGeneral[ idHistoriaClinicaGeneral=" + idHistoriaClinicaGeneral + " ]";
    }
    
}
