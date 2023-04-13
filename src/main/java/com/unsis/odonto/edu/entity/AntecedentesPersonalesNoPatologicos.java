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
@Table(name = "antecedentes_personales_no_patologicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findAll", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByIdAntecedentesPersonalesNoPatologicos", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.idAntecedentesPersonalesNoPatologicos = :idAntecedentesPersonalesNoPatologicos"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByComeFrutasVerduras", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.comeFrutasVerduras = :comeFrutasVerduras"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByComeCarne", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.comeCarne = :comeCarne"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByComeCereales", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.comeCereales = :comeCereales"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByComeAlimentosChatarra", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.comeAlimentosChatarra = :comeAlimentosChatarra"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByTomaDosLitrosDeAguaXDia", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.tomaDosLitrosDeAguaXDia = :tomaDosLitrosDeAguaXDia"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByUnoMasRefrescosDia", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.unoMasRefrescosDia = :unoMasRefrescosDia"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByHorasDuermeDia", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.horasDuermeDia = :horasDuermeDia"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByBa\u00f1oVecesXSemana", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.ba\u00f1oVecesXSemana = :ba\u00f1oVecesXSemana"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByCepilladoXDia", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.cepilladoXDia = :cepilladoXDia"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findBySuViviendaTienePiso", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.suViviendaTienePiso = :suViviendaTienePiso"),
    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findByMaterialDeVivienda", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a WHERE a.materialDeVivienda = :materialDeVivienda")})
public class AntecedentesPersonalesNoPatologicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_antecedentes_personales_no_patologicos")
    private Integer idAntecedentesPersonalesNoPatologicos;
    @Column(name = "come_frutas_verduras")
    private Boolean comeFrutasVerduras;
    @Column(name = "come_carne")
    private Boolean comeCarne;
    @Column(name = "come_cereales")
    private Boolean comeCereales;
    @Column(name = "come_alimentos_chatarra")
    private Boolean comeAlimentosChatarra;
    @Column(name = "toma_dos_litros_de_agua_x_dia")
    private Boolean tomaDosLitrosDeAguaXDia;
    @Column(name = "uno_mas_refrescos_dia")
    private Boolean unoMasRefrescosDia;
    @Column(name = "horas_duerme_dia")
    private Integer horasDuermeDia;
    @Column(name = "ba\u00f1o_veces_x_semana")
    private Integer bañoVecesXSemana;
    @Column(name = "cepillado_x_dia")
    private Integer cepilladoXDia;
    @Column(name = "su_vivienda_tiene_piso")
    private Integer suViviendaTienePiso;
    @Column(name = "material_de_vivienda")
    private String materialDeVivienda;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;
    @OneToMany(mappedBy = "fkIdAntecedentesPersonalesNoPatologicos")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public AntecedentesPersonalesNoPatologicos() {
    }

    public AntecedentesPersonalesNoPatologicos(Integer idAntecedentesPersonalesNoPatologicos) {
        this.idAntecedentesPersonalesNoPatologicos = idAntecedentesPersonalesNoPatologicos;
    }

    public Integer getIdAntecedentesPersonalesNoPatologicos() {
        return idAntecedentesPersonalesNoPatologicos;
    }

    public void setIdAntecedentesPersonalesNoPatologicos(Integer idAntecedentesPersonalesNoPatologicos) {
        this.idAntecedentesPersonalesNoPatologicos = idAntecedentesPersonalesNoPatologicos;
    }

    public Boolean getComeFrutasVerduras() {
        return comeFrutasVerduras;
    }

    public void setComeFrutasVerduras(Boolean comeFrutasVerduras) {
        this.comeFrutasVerduras = comeFrutasVerduras;
    }

    public Boolean getComeCarne() {
        return comeCarne;
    }

    public void setComeCarne(Boolean comeCarne) {
        this.comeCarne = comeCarne;
    }

    public Boolean getComeCereales() {
        return comeCereales;
    }

    public void setComeCereales(Boolean comeCereales) {
        this.comeCereales = comeCereales;
    }

    public Boolean getComeAlimentosChatarra() {
        return comeAlimentosChatarra;
    }

    public void setComeAlimentosChatarra(Boolean comeAlimentosChatarra) {
        this.comeAlimentosChatarra = comeAlimentosChatarra;
    }

    public Boolean getTomaDosLitrosDeAguaXDia() {
        return tomaDosLitrosDeAguaXDia;
    }

    public void setTomaDosLitrosDeAguaXDia(Boolean tomaDosLitrosDeAguaXDia) {
        this.tomaDosLitrosDeAguaXDia = tomaDosLitrosDeAguaXDia;
    }

    public Boolean getUnoMasRefrescosDia() {
        return unoMasRefrescosDia;
    }

    public void setUnoMasRefrescosDia(Boolean unoMasRefrescosDia) {
        this.unoMasRefrescosDia = unoMasRefrescosDia;
    }

    public Integer getHorasDuermeDia() {
        return horasDuermeDia;
    }

    public void setHorasDuermeDia(Integer horasDuermeDia) {
        this.horasDuermeDia = horasDuermeDia;
    }

    public Integer getBañoVecesXSemana() {
        return bañoVecesXSemana;
    }

    public void setBañoVecesXSemana(Integer bañoVecesXSemana) {
        this.bañoVecesXSemana = bañoVecesXSemana;
    }

    public Integer getCepilladoXDia() {
        return cepilladoXDia;
    }

    public void setCepilladoXDia(Integer cepilladoXDia) {
        this.cepilladoXDia = cepilladoXDia;
    }

    public Integer getSuViviendaTienePiso() {
        return suViviendaTienePiso;
    }

    public void setSuViviendaTienePiso(Integer suViviendaTienePiso) {
        this.suViviendaTienePiso = suViviendaTienePiso;
    }

    public String getMaterialDeVivienda() {
        return materialDeVivienda;
    }

    public void setMaterialDeVivienda(String materialDeVivienda) {
        this.materialDeVivienda = materialDeVivienda;
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
        hash += (idAntecedentesPersonalesNoPatologicos != null ? idAntecedentesPersonalesNoPatologicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPersonalesNoPatologicos)) {
            return false;
        }
        AntecedentesPersonalesNoPatologicos other = (AntecedentesPersonalesNoPatologicos) object;
        if ((this.idAntecedentesPersonalesNoPatologicos == null && other.idAntecedentesPersonalesNoPatologicos != null) || (this.idAntecedentesPersonalesNoPatologicos != null && !this.idAntecedentesPersonalesNoPatologicos.equals(other.idAntecedentesPersonalesNoPatologicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AntecedentesPersonalesNoPatologicos[ idAntecedentesPersonalesNoPatologicos=" + idAntecedentesPersonalesNoPatologicos + " ]";
    }
    
}
