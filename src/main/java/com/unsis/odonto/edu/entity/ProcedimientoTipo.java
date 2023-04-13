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
 * @author labingsw02
 */
@Entity
@Table(name = "procedimiento_tipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcedimientoTipo.findAll", query = "SELECT p FROM ProcedimientoTipo p"),
    @NamedQuery(name = "ProcedimientoTipo.findByIdProcedimientoTipo", query = "SELECT p FROM ProcedimientoTipo p WHERE p.idProcedimientoTipo = :idProcedimientoTipo"),
    @NamedQuery(name = "ProcedimientoTipo.findByProcedimiento", query = "SELECT p FROM ProcedimientoTipo p WHERE p.procedimiento = :procedimiento")})
public class ProcedimientoTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedimiento_tipo")
    private Integer idProcedimientoTipo;
    @Column(name = "procedimiento")
    private String procedimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdProcedimientoRealizado")
    private Collection<Consulta> consultaCollection;

    public ProcedimientoTipo() {
    }

    public ProcedimientoTipo(Integer idProcedimientoTipo) {
        this.idProcedimientoTipo = idProcedimientoTipo;
    }

    public Integer getIdProcedimientoTipo() {
        return idProcedimientoTipo;
    }

    public void setIdProcedimientoTipo(Integer idProcedimientoTipo) {
        this.idProcedimientoTipo = idProcedimientoTipo;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    @XmlTransient
    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimientoTipo != null ? idProcedimientoTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoTipo)) {
            return false;
        }
        ProcedimientoTipo other = (ProcedimientoTipo) object;
        if ((this.idProcedimientoTipo == null && other.idProcedimientoTipo != null) || (this.idProcedimientoTipo != null && !this.idProcedimientoTipo.equals(other.idProcedimientoTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.ProcedimientoTipo[ idProcedimientoTipo=" + idProcedimientoTipo + " ]";
    }
    
}
