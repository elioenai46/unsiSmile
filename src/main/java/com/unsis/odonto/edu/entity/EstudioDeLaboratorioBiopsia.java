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
@Table(name = "estudio_de_laboratorio_biopsia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstudioDeLaboratorioBiopsia.findAll", query = "SELECT e FROM EstudioDeLaboratorioBiopsia e"),
    @NamedQuery(name = "EstudioDeLaboratorioBiopsia.findByIdEstudioDeLaboratorioBiopsia", query = "SELECT e FROM EstudioDeLaboratorioBiopsia e WHERE e.idEstudioDeLaboratorioBiopsia = :idEstudioDeLaboratorioBiopsia")})
public class EstudioDeLaboratorioBiopsia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudio_de_laboratorio_biopsia")
    private Integer idEstudioDeLaboratorioBiopsia;
    @Lob
    @Column(name = "tipo_de_estudio")
    private String tipoDeEstudio;
    @Lob
    @Column(name = "tipo_de_biopsia")
    private String tipoDeBiopsia;
    @Lob
    @Column(name = "region_de_biopsia")
    private String regionDeBiopsia;
    @Lob
    @Column(name = "regi\u00f3n_donde_se_realiz\u00f3_biopsia")
    private String regiónDondeSeRealizóBiopsia;
    @Lob
    @Column(name = "laboratorio_donde_se_envia_el_estudio")
    private String laboratorioDondeSeEnviaElEstudio;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;
    @OneToMany(mappedBy = "fkIdEstudioDeLaboratorioBiopsia")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public EstudioDeLaboratorioBiopsia() {
    }

    public EstudioDeLaboratorioBiopsia(Integer idEstudioDeLaboratorioBiopsia) {
        this.idEstudioDeLaboratorioBiopsia = idEstudioDeLaboratorioBiopsia;
    }

    public Integer getIdEstudioDeLaboratorioBiopsia() {
        return idEstudioDeLaboratorioBiopsia;
    }

    public void setIdEstudioDeLaboratorioBiopsia(Integer idEstudioDeLaboratorioBiopsia) {
        this.idEstudioDeLaboratorioBiopsia = idEstudioDeLaboratorioBiopsia;
    }

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getTipoDeBiopsia() {
        return tipoDeBiopsia;
    }

    public void setTipoDeBiopsia(String tipoDeBiopsia) {
        this.tipoDeBiopsia = tipoDeBiopsia;
    }

    public String getRegionDeBiopsia() {
        return regionDeBiopsia;
    }

    public void setRegionDeBiopsia(String regionDeBiopsia) {
        this.regionDeBiopsia = regionDeBiopsia;
    }

    public String getRegiónDondeSeRealizóBiopsia() {
        return regiónDondeSeRealizóBiopsia;
    }

    public void setRegiónDondeSeRealizóBiopsia(String regiónDondeSeRealizóBiopsia) {
        this.regiónDondeSeRealizóBiopsia = regiónDondeSeRealizóBiopsia;
    }

    public String getLaboratorioDondeSeEnviaElEstudio() {
        return laboratorioDondeSeEnviaElEstudio;
    }

    public void setLaboratorioDondeSeEnviaElEstudio(String laboratorioDondeSeEnviaElEstudio) {
        this.laboratorioDondeSeEnviaElEstudio = laboratorioDondeSeEnviaElEstudio;
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
        hash += (idEstudioDeLaboratorioBiopsia != null ? idEstudioDeLaboratorioBiopsia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudioDeLaboratorioBiopsia)) {
            return false;
        }
        EstudioDeLaboratorioBiopsia other = (EstudioDeLaboratorioBiopsia) object;
        if ((this.idEstudioDeLaboratorioBiopsia == null && other.idEstudioDeLaboratorioBiopsia != null) || (this.idEstudioDeLaboratorioBiopsia != null && !this.idEstudioDeLaboratorioBiopsia.equals(other.idEstudioDeLaboratorioBiopsia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.EstudioDeLaboratorioBiopsia[ idEstudioDeLaboratorioBiopsia=" + idEstudioDeLaboratorioBiopsia + " ]";
    }
    
}
