/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.odonto.edu.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "catedraticos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catedraticos.findAll", query = "SELECT c FROM Catedraticos c"),
    @NamedQuery(name = "Catedraticos.findByIdCatedratico", query = "SELECT c FROM Catedraticos c WHERE c.idCatedratico = :idCatedratico"),
    @NamedQuery(name = "Catedraticos.findByNombre", query = "SELECT c FROM Catedraticos c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Catedraticos.findByNombre2", query = "SELECT c FROM Catedraticos c WHERE c.nombre2 = :nombre2"),
    @NamedQuery(name = "Catedraticos.findByApellido", query = "SELECT c FROM Catedraticos c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Catedraticos.findByApellido2", query = "SELECT c FROM Catedraticos c WHERE c.apellido2 = :apellido2"),
    @NamedQuery(name = "Catedraticos.findByCurp", query = "SELECT c FROM Catedraticos c WHERE c.curp = :curp"),
    @NamedQuery(name = "Catedraticos.findByTelefono", query = "SELECT c FROM Catedraticos c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Catedraticos.findBySexo", query = "SELECT c FROM Catedraticos c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Catedraticos.findByFechaNacimiento", query = "SELECT c FROM Catedraticos c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Catedraticos.findByNumeroTrabajador", query = "SELECT c FROM Catedraticos c WHERE c.numeroTrabajador = :numeroTrabajador"),
    @NamedQuery(name = "Catedraticos.findByEmailCatedratico", query = "SELECT c FROM Catedraticos c WHERE c.emailCatedratico = :emailCatedratico"),
    @NamedQuery(name = "Catedraticos.findByEstatus", query = "SELECT c FROM Catedraticos c WHERE c.estatus = :estatus")})
public class Catedraticos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catedratico")
    private Integer idCatedratico;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "curp")
    private String curp;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    //@Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Column(name = "numero_trabajador")
    private String numeroTrabajador;
    @Basic(optional = false)
    @Column(name = "email_catedratico")
    private String emailCatedratico;
    @Column(name = "estatus")
    private Boolean estatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdCatedraticoResponsable")
    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;
    @JoinColumn(name = "fk_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios fkIdUsuario;
    @OneToMany(mappedBy = "fkIdCatedratico")
    private Collection<CatedraticoGrupo> catedraticoGrupoCollection;

    public Catedraticos() {
    }

    public Catedraticos(Integer idCatedratico) {
        this.idCatedratico = idCatedratico;
    }

    public Catedraticos(Integer idCatedratico, String emailCatedratico) {
        this.idCatedratico = idCatedratico;
        this.emailCatedratico = emailCatedratico;
    }

    public Integer getIdCatedratico() {
        return idCatedratico;
    }

    public void setIdCatedratico(Integer idCatedratico) {
        this.idCatedratico = idCatedratico;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getEmailCatedratico() {
        return emailCatedratico;
    }

    public void setEmailCatedratico(String emailCatedratico) {
        this.emailCatedratico = emailCatedratico;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection() {
        return historiaClinicaGeneralCollection;
    }

    public void setHistoriaClinicaGeneralCollection(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection) {
        this.historiaClinicaGeneralCollection = historiaClinicaGeneralCollection;
    }

    public Usuarios getFkIdUsuario() {
        return fkIdUsuario;
    }

    public void setFkIdUsuario(Usuarios fkIdUsuario) {
        this.fkIdUsuario = fkIdUsuario;
    }

    @XmlTransient
    public Collection<CatedraticoGrupo> getCatedraticoGrupoCollection() {
        return catedraticoGrupoCollection;
    }

    public void setCatedraticoGrupoCollection(Collection<CatedraticoGrupo> catedraticoGrupoCollection) {
        this.catedraticoGrupoCollection = catedraticoGrupoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatedratico != null ? idCatedratico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catedraticos)) {
            return false;
        }
        Catedraticos other = (Catedraticos) object;
        if ((this.idCatedratico == null && other.idCatedratico != null) || (this.idCatedratico != null && !this.idCatedratico.equals(other.idCatedratico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Catedraticos[ idCatedratico=" + idCatedratico + " ]";
    }
    
}
