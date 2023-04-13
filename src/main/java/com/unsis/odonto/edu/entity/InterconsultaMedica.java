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
@Table(name = "interconsulta_medica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InterconsultaMedica.findAll", query = "SELECT i FROM InterconsultaMedica i"),
    @NamedQuery(name = "InterconsultaMedica.findByIdInterconsultaMedica", query = "SELECT i FROM InterconsultaMedica i WHERE i.idInterconsultaMedica = :idInterconsultaMedica")})
public class InterconsultaMedica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_interconsulta_medica")
    private Integer idInterconsultaMedica;
    @Lob
    @Column(name = "nombre_medico")
    private String nombreMedico;
    @Lob
    @Column(name = "razon")
    private String razon;
    @Lob
    @Column(name = "motivo_de_diagnostico_presuntivo")
    private String motivoDeDiagnosticoPresuntivo;
    @Lob
    @Column(name = "Motivo_de_envio")
    private String motivodeenvio;
    @Lob
    @Column(name = "servicio_al_que_se_envia")
    private String servicioAlQueSeEnvia;
    @OneToMany(mappedBy = "fkIdInterconsultaMedica")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;

    public InterconsultaMedica() {
    }

    public InterconsultaMedica(Integer idInterconsultaMedica) {
        this.idInterconsultaMedica = idInterconsultaMedica;
    }

    public Integer getIdInterconsultaMedica() {
        return idInterconsultaMedica;
    }

    public void setIdInterconsultaMedica(Integer idInterconsultaMedica) {
        this.idInterconsultaMedica = idInterconsultaMedica;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getMotivoDeDiagnosticoPresuntivo() {
        return motivoDeDiagnosticoPresuntivo;
    }

    public void setMotivoDeDiagnosticoPresuntivo(String motivoDeDiagnosticoPresuntivo) {
        this.motivoDeDiagnosticoPresuntivo = motivoDeDiagnosticoPresuntivo;
    }

    public String getMotivodeenvio() {
        return motivodeenvio;
    }

    public void setMotivodeenvio(String motivodeenvio) {
        this.motivodeenvio = motivodeenvio;
    }

    public String getServicioAlQueSeEnvia() {
        return servicioAlQueSeEnvia;
    }

    public void setServicioAlQueSeEnvia(String servicioAlQueSeEnvia) {
        this.servicioAlQueSeEnvia = servicioAlQueSeEnvia;
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
        hash += (idInterconsultaMedica != null ? idInterconsultaMedica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InterconsultaMedica)) {
            return false;
        }
        InterconsultaMedica other = (InterconsultaMedica) object;
        if ((this.idInterconsultaMedica == null && other.idInterconsultaMedica != null) || (this.idInterconsultaMedica != null && !this.idInterconsultaMedica.equals(other.idInterconsultaMedica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.InterconsultaMedica[ idInterconsultaMedica=" + idInterconsultaMedica + " ]";
    }
    
}
