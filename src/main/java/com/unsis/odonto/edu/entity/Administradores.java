/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author labingsw02
 */
@Entity
@Table(name = "administradores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administradores.findAll", query = "SELECT a FROM Administradores a"),
    @NamedQuery(name = "Administradores.findByIdAdministrador", query = "SELECT a FROM Administradores a WHERE a.idAdministrador = :idAdministrador"),
    @NamedQuery(name = "Administradores.findByNombre1", query = "SELECT a FROM Administradores a WHERE a.nombre1 = :nombre1"),
    @NamedQuery(name = "Administradores.findByNombre2", query = "SELECT a FROM Administradores a WHERE a.nombre2 = :nombre2"),
    @NamedQuery(name = "Administradores.findByApellido1", query = "SELECT a FROM Administradores a WHERE a.apellido1 = :apellido1"),
    @NamedQuery(name = "Administradores.findByApellido2", query = "SELECT a FROM Administradores a WHERE a.apellido2 = :apellido2"),
    @NamedQuery(name = "Administradores.findByCurp", query = "SELECT a FROM Administradores a WHERE a.curp = :curp"),
    @NamedQuery(name = "Administradores.findByTelefono", query = "SELECT a FROM Administradores a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Administradores.findByNumeroTrabajador", query = "SELECT a FROM Administradores a WHERE a.numeroTrabajador = :numeroTrabajador"),
    @NamedQuery(name = "Administradores.findByFechaNacimiento", query = "SELECT a FROM Administradores a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Administradores.findBySexo", query = "SELECT a FROM Administradores a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Administradores.findByEmailAdmin", query = "SELECT a FROM Administradores a WHERE a.emailAdmin = :emailAdmin"),
    @NamedQuery(name = "Administradores.findByEstatus", query = "SELECT a FROM Administradores a WHERE a.estatus = :estatus")})
public class Administradores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_administrador")
    private Integer idAdministrador;
    @Column(name = "nombre1")
    private String nombre1;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido1")
    private String apellido1;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "curp")
    private String curp;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "numero_trabajador")
    private String numeroTrabajador;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Column(name = "sexo")
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "email_admin")
    private String emailAdmin;
    @Column(name = "estatus")
    private Boolean estatus;
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuarios fkUsuario;

    public Administradores() {
    }

    public Administradores(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Administradores(Integer idAdministrador, String emailAdmin) {
        this.idAdministrador = idAdministrador;
        this.emailAdmin = emailAdmin;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public Usuarios getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Usuarios fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrador != null ? idAdministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administradores)) {
            return false;
        }
        Administradores other = (Administradores) object;
        if ((this.idAdministrador == null && other.idAdministrador != null) || (this.idAdministrador != null && !this.idAdministrador.equals(other.idAdministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Administradores[ idAdministrador=" + idAdministrador + " ]";
    }
    
}
