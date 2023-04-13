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
 * @author labingsw02
 */
@Entity
@Table(name = "paciente_alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteAlumno.findAll", query = "SELECT p FROM PacienteAlumno p"),
    @NamedQuery(name = "PacienteAlumno.findByIdPacienteAlumno", query = "SELECT p FROM PacienteAlumno p WHERE p.idPacienteAlumno = :idPacienteAlumno")})
public class PacienteAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente_alumno")
    private Integer idPacienteAlumno;
    @JoinColumn(name = "fk_id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne
    private Alumnos fkIdAlumno;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne
    private Paciente fkIdPaciente;
    @JoinColumn(name = "fk_id_rol_alumno", referencedColumnName = "id_rol_alumno")
    @ManyToOne
    private RolAlumno fkIdRolAlumno;

    public PacienteAlumno() {
    }

    public PacienteAlumno(Integer idPacienteAlumno) {
        this.idPacienteAlumno = idPacienteAlumno;
    }

    public Integer getIdPacienteAlumno() {
        return idPacienteAlumno;
    }

    public void setIdPacienteAlumno(Integer idPacienteAlumno) {
        this.idPacienteAlumno = idPacienteAlumno;
    }

    public Alumnos getFkIdAlumno() {
        return fkIdAlumno;
    }

    public void setFkIdAlumno(Alumnos fkIdAlumno) {
        this.fkIdAlumno = fkIdAlumno;
    }

    public Paciente getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(Paciente fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
    }

    public RolAlumno getFkIdRolAlumno() {
        return fkIdRolAlumno;
    }

    public void setFkIdRolAlumno(RolAlumno fkIdRolAlumno) {
        this.fkIdRolAlumno = fkIdRolAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPacienteAlumno != null ? idPacienteAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteAlumno)) {
            return false;
        }
        PacienteAlumno other = (PacienteAlumno) object;
        if ((this.idPacienteAlumno == null && other.idPacienteAlumno != null) || (this.idPacienteAlumno != null && !this.idPacienteAlumno.equals(other.idPacienteAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.PacienteAlumno[ idPacienteAlumno=" + idPacienteAlumno + " ]";
    }
    
}
