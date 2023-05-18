/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "consulta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByIdConsulta", query = "SELECT c FROM Consulta c WHERE c.idConsulta = :idConsulta"),
    @NamedQuery(name = "Consulta.findByFechaDeConsulta", query = "SELECT c FROM Consulta c WHERE c.fechaDeConsulta = :fechaDeConsulta")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consulta")
    private Integer idConsulta;
    @Lob
    @Column(name = "diagnostico")
    private String diagnostico;
    @Lob
    @Column(name = "pronostico")
    private String pronostico;
    @Lob
    @Column(name = "tratamiento")
    private String tratamiento;
    @Lob
    @Column(name = "manejo_integral")
    private String manejoIntegral;
    @Lob
    @Column(name = "motivo_de_la_consulta")
    private String motivoDeLaConsulta;
    @Column(name = "fecha_de_consulta")
    @Temporal(TemporalType.DATE)
    private Date fechaDeConsulta;
    @JoinColumn(name = "fk_id_clinica", referencedColumnName = "id_clinica")
    @ManyToOne(optional = false)
    private Clinica fkIdClinica;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne(optional = false)
    private Paciente fkIdPaciente;
    @JoinColumn(name = "fk_id_procedimiento_realizado", referencedColumnName = "id_procedimiento_tipo")
    @ManyToOne(optional = false)
    private ProcedimientoTipo fkIdProcedimientoRealizado;
    @JoinColumn(name = "fk_id_signos_vitales", referencedColumnName = "id_signos_vitales")
    @ManyToOne(optional = false)
    private SignosVitales fkIdSignosVitales;
    @JoinColumn(name = "fk_id_alumno", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios fkIdAlumno;

    public Consulta() {
    }

    public Consulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getManejoIntegral() {
        return manejoIntegral;
    }

    public void setManejoIntegral(String manejoIntegral) {
        this.manejoIntegral = manejoIntegral;
    }

    public String getMotivoDeLaConsulta() {
        return motivoDeLaConsulta;
    }

    public void setMotivoDeLaConsulta(String motivoDeLaConsulta) {
        this.motivoDeLaConsulta = motivoDeLaConsulta;
    }

    public Date getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(Date fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public Clinica getFkIdClinica() {
        return fkIdClinica;
    }

    public void setFkIdClinica(Clinica fkIdClinica) {
        this.fkIdClinica = fkIdClinica;
    }

    public Paciente getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(Paciente fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
    }

    public ProcedimientoTipo getFkIdProcedimientoRealizado() {
        return fkIdProcedimientoRealizado;
    }

    public void setFkIdProcedimientoRealizado(ProcedimientoTipo fkIdProcedimientoRealizado) {
        this.fkIdProcedimientoRealizado = fkIdProcedimientoRealizado;
    }

    public SignosVitales getFkIdSignosVitales() {
        return fkIdSignosVitales;
    }

    public void setFkIdSignosVitales(SignosVitales fkIdSignosVitales) {
        this.fkIdSignosVitales = fkIdSignosVitales;
    }

    public Usuarios getFkIdAlumno() {
        return fkIdAlumno;
    }

    public void setFkIdAlumno(Usuarios fkIdAlumno) {
        this.fkIdAlumno = fkIdAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulta != null ? idConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idConsulta == null && other.idConsulta != null) || (this.idConsulta != null && !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Consulta[ idConsulta=" + idConsulta + " ]";
    }
    
}
