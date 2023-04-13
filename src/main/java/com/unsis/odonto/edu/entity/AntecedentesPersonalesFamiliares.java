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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author labingsw02
 */
@Entity
@Table(name = "antecedentes_personales_familiares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findAll", query = "SELECT a FROM AntecedentesPersonalesFamiliares a"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByIdAntecedentesPersonalesFamiliares", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.idAntecedentesPersonalesFamiliares = :idAntecedentesPersonalesFamiliares"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByPadecimientoEnFamiliar", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.padecimientoEnFamiliar = :padecimientoEnFamiliar"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByTipo", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByPadecimientoCronico", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.padecimientoCronico = :padecimientoCronico"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByDiabetes", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.diabetes = :diabetes"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByHipertension", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.hipertension = :hipertension"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByEpilepsia", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.epilepsia = :epilepsia"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByCardiopatias", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.cardiopatias = :cardiopatias"),
    @NamedQuery(name = "AntecedentesPersonalesFamiliares.findByHemorragias", query = "SELECT a FROM AntecedentesPersonalesFamiliares a WHERE a.hemorragias = :hemorragias")})
public class AntecedentesPersonalesFamiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_antecedentes_personales_familiares")
    private Integer idAntecedentesPersonalesFamiliares;
    @Basic(optional = false)
    @Column(name = "padecimiento_en_familiar")
    private boolean padecimientoEnFamiliar;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "padecimiento_cronico")
    private Boolean padecimientoCronico;
    @Column(name = "diabetes")
    private Boolean diabetes;
    @Column(name = "hipertension")
    private Boolean hipertension;
    @Column(name = "epilepsia")
    private Boolean epilepsia;
    @Column(name = "cardiopatias")
    private Boolean cardiopatias;
    @Column(name = "hemorragias")
    private Boolean hemorragias;
    @Lob
    @Column(name = "alergias")
    private String alergias;
    @Lob
    @Column(name = "enfermedades_infecciosas")
    private String enfermedadesInfecciosas;

    public AntecedentesPersonalesFamiliares() {
    }

    public AntecedentesPersonalesFamiliares(Integer idAntecedentesPersonalesFamiliares) {
        this.idAntecedentesPersonalesFamiliares = idAntecedentesPersonalesFamiliares;
    }

    public AntecedentesPersonalesFamiliares(Integer idAntecedentesPersonalesFamiliares, boolean padecimientoEnFamiliar) {
        this.idAntecedentesPersonalesFamiliares = idAntecedentesPersonalesFamiliares;
        this.padecimientoEnFamiliar = padecimientoEnFamiliar;
    }

    public Integer getIdAntecedentesPersonalesFamiliares() {
        return idAntecedentesPersonalesFamiliares;
    }

    public void setIdAntecedentesPersonalesFamiliares(Integer idAntecedentesPersonalesFamiliares) {
        this.idAntecedentesPersonalesFamiliares = idAntecedentesPersonalesFamiliares;
    }

    public boolean getPadecimientoEnFamiliar() {
        return padecimientoEnFamiliar;
    }

    public void setPadecimientoEnFamiliar(boolean padecimientoEnFamiliar) {
        this.padecimientoEnFamiliar = padecimientoEnFamiliar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getPadecimientoCronico() {
        return padecimientoCronico;
    }

    public void setPadecimientoCronico(Boolean padecimientoCronico) {
        this.padecimientoCronico = padecimientoCronico;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getHipertension() {
        return hipertension;
    }

    public void setHipertension(Boolean hipertension) {
        this.hipertension = hipertension;
    }

    public Boolean getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(Boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public Boolean getCardiopatias() {
        return cardiopatias;
    }

    public void setCardiopatias(Boolean cardiopatias) {
        this.cardiopatias = cardiopatias;
    }

    public Boolean getHemorragias() {
        return hemorragias;
    }

    public void setHemorragias(Boolean hemorragias) {
        this.hemorragias = hemorragias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesInfecciosas() {
        return enfermedadesInfecciosas;
    }

    public void setEnfermedadesInfecciosas(String enfermedadesInfecciosas) {
        this.enfermedadesInfecciosas = enfermedadesInfecciosas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAntecedentesPersonalesFamiliares != null ? idAntecedentesPersonalesFamiliares.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPersonalesFamiliares)) {
            return false;
        }
        AntecedentesPersonalesFamiliares other = (AntecedentesPersonalesFamiliares) object;
        if ((this.idAntecedentesPersonalesFamiliares == null && other.idAntecedentesPersonalesFamiliares != null) || (this.idAntecedentesPersonalesFamiliares != null && !this.idAntecedentesPersonalesFamiliares.equals(other.idAntecedentesPersonalesFamiliares))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.AntecedentesPersonalesFamiliares[ idAntecedentesPersonalesFamiliares=" + idAntecedentesPersonalesFamiliares + " ]";
    }
    
}
