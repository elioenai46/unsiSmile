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
import javax.persistence.ManyToOne;
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
@Table(name = "alumnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findByIdAlumno", query = "SELECT a FROM Alumnos a WHERE a.idAlumno = :idAlumno"),
    @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos.findByNombre2", query = "SELECT a FROM Alumnos a WHERE a.nombre2 = :nombre2"),
    @NamedQuery(name = "Alumnos.findByApellido", query = "SELECT a FROM Alumnos a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Alumnos.findByApellido2", query = "SELECT a FROM Alumnos a WHERE a.apellido2 = :apellido2"),
    @NamedQuery(name = "Alumnos.findBySexo", query = "SELECT a FROM Alumnos a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Alumnos.findByCurp", query = "SELECT a FROM Alumnos a WHERE a.curp = :curp"),
    @NamedQuery(name = "Alumnos.findByMatricula", query = "SELECT a FROM Alumnos a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Alumnos.findByTelefono", query = "SELECT a FROM Alumnos a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Alumnos.findByEmailAlumno", query = "SELECT a FROM Alumnos a WHERE a.emailAlumno = :emailAlumno"),
    @NamedQuery(name = "Alumnos.findByEstatus", query = "SELECT a FROM Alumnos a WHERE a.estatus = :estatus")})
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "curp")
    private String curp;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "email_alumno")
    private String emailAlumno;
    @Column(name = "estatus")
    private Boolean estatus;
    @OneToMany(mappedBy = "fkIdAlumno")
    private Collection<PacienteAlumno> pacienteAlumnoCollection;
    @JoinColumn(name = "fk_id_semestre_grupo", referencedColumnName = "id_semestre_grupo")
    @ManyToOne
    private SemestreGrupo fkIdSemestreGrupo;
    @JoinColumn(name = "f_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios fIdUsuario;

    public Alumnos() {
    }

    public Alumnos(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Alumnos(Integer idAlumno, String emailAlumno) {
        this.idAlumno = idAlumno;
        this.emailAlumno = emailAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public Collection<PacienteAlumno> getPacienteAlumnoCollection() {
        return pacienteAlumnoCollection;
    }

    public void setPacienteAlumnoCollection(Collection<PacienteAlumno> pacienteAlumnoCollection) {
        this.pacienteAlumnoCollection = pacienteAlumnoCollection;
    }

    public SemestreGrupo getFkIdSemestreGrupo() {
        return fkIdSemestreGrupo;
    }

    public void setFkIdSemestreGrupo(SemestreGrupo fkIdSemestreGrupo) {
        this.fkIdSemestreGrupo = fkIdSemestreGrupo;
    }

    public Usuarios getFIdUsuario() {
        return fIdUsuario;
    }

    public void setFIdUsuario(Usuarios fIdUsuario) {
        this.fIdUsuario = fIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Alumnos[ idAlumno=" + idAlumno + " ]";
    }
    
}
