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
 * @author labingsw02
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByIdPaciente", query = "SELECT p FROM Paciente p WHERE p.idPaciente = :idPaciente"),
    @NamedQuery(name = "Paciente.findByNombre1", query = "SELECT p FROM Paciente p WHERE p.nombre1 = :nombre1"),
    @NamedQuery(name = "Paciente.findByNombre2", query = "SELECT p FROM Paciente p WHERE p.nombre2 = :nombre2"),
    @NamedQuery(name = "Paciente.findByApellido1", query = "SELECT p FROM Paciente p WHERE p.apellido1 = :apellido1"),
    @NamedQuery(name = "Paciente.findByApellido2", query = "SELECT p FROM Paciente p WHERE p.apellido2 = :apellido2"),
    @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Paciente.findByGrupoEtnico", query = "SELECT p FROM Paciente p WHERE p.grupoEtnico = :grupoEtnico"),
    @NamedQuery(name = "Paciente.findByOcupacion", query = "SELECT p FROM Paciente p WHERE p.ocupacion = :ocupacion"),
    @NamedQuery(name = "Paciente.findByFechaNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Paciente.findByDomicilio", query = "SELECT p FROM Paciente p WHERE p.domicilio = :domicilio"),
    @NamedQuery(name = "Paciente.findByEstadoCivil", query = "SELECT p FROM Paciente p WHERE p.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Paciente.findByReligion", query = "SELECT p FROM Paciente p WHERE p.religion = :religion"),
    @NamedQuery(name = "Paciente.findByFechaIngreso", query = "SELECT p FROM Paciente p WHERE p.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Paciente.findByNacionalidad", query = "SELECT p FROM Paciente p WHERE p.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Paciente.findByLocalidad", query = "SELECT p FROM Paciente p WHERE p.localidad = :localidad"),
    @NamedQuery(name = "Paciente.findByEstatus", query = "SELECT p FROM Paciente p WHERE p.estatus = :estatus")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente")
    private Integer idPaciente;
    @Column(name = "nombre1")
    private String nombre1;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido1")
    private String apellido1;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "grupo_etnico")
    private String grupoEtnico;
    @Column(name = "ocupacion")
    private String ocupacion;
    @Column(name = "fecha_nacimiento" , columnDefinition = "DATE")
    //@Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "religion")
    private String religion;
    @Column(name = "fecha_ingreso", columnDefinition = "DATE")
    //@Temporal(TemporalType.DATE)
    private LocalDate fechaIngreso;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "estatus")
    private Boolean estatus;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<PacienteAlumno> pacienteAlumnoCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<ExamenClinico> examenClinicoCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<ExamenFacial> examenFacialCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<EstudioDeLaboratorioBiopsia> estudioDeLaboratorioBiopsiaCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<AnalisisFuncional> analisisFuncionalCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<AntecedentesPersonalesPatologicos> antecedentesPersonalesPatologicosCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<AntecedentesHeredofamiliares> antecedentesHeredofamiliaresCollection;
    @JoinColumn(name = "fk_id_tutor", referencedColumnName = "id_tutor")
    @ManyToOne
    private Tutor fkIdTutor;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<ExamenBucal> examenBucalCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<AntecedentesPersonalesNoPatologicos> antecedentesPersonalesNoPatologicosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdPaciente")
    private Collection<Consulta> consultaCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<PosturaDelPaciente> posturaDelPacienteCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<InterconsultaMedica> interconsultaMedicaCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<ModelosDeEstudioFotografias> modelosDeEstudioFotografiasCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<AnalisisRadiografico> analisisRadiograficoCollection;
    @OneToMany(mappedBy = "fkIdPaciente")
    private Collection<Odontograma> odontogramaCollection;

    public Paciente() {
    }

    public Paciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(String grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
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

    @XmlTransient
    public Collection<ExamenClinico> getExamenClinicoCollection() {
        return examenClinicoCollection;
    }

    public void setExamenClinicoCollection(Collection<ExamenClinico> examenClinicoCollection) {
        this.examenClinicoCollection = examenClinicoCollection;
    }

    @XmlTransient
    public Collection<ExamenFacial> getExamenFacialCollection() {
        return examenFacialCollection;
    }

    public void setExamenFacialCollection(Collection<ExamenFacial> examenFacialCollection) {
        this.examenFacialCollection = examenFacialCollection;
    }

    @XmlTransient
    public Collection<EstudioDeLaboratorioBiopsia> getEstudioDeLaboratorioBiopsiaCollection() {
        return estudioDeLaboratorioBiopsiaCollection;
    }

    public void setEstudioDeLaboratorioBiopsiaCollection(Collection<EstudioDeLaboratorioBiopsia> estudioDeLaboratorioBiopsiaCollection) {
        this.estudioDeLaboratorioBiopsiaCollection = estudioDeLaboratorioBiopsiaCollection;
    }

    @XmlTransient
    public Collection<AnalisisFuncional> getAnalisisFuncionalCollection() {
        return analisisFuncionalCollection;
    }

    public void setAnalisisFuncionalCollection(Collection<AnalisisFuncional> analisisFuncionalCollection) {
        this.analisisFuncionalCollection = analisisFuncionalCollection;
    }

    @XmlTransient
    public Collection<AntecedentesPersonalesPatologicos> getAntecedentesPersonalesPatologicosCollection() {
        return antecedentesPersonalesPatologicosCollection;
    }

    public void setAntecedentesPersonalesPatologicosCollection(Collection<AntecedentesPersonalesPatologicos> antecedentesPersonalesPatologicosCollection) {
        this.antecedentesPersonalesPatologicosCollection = antecedentesPersonalesPatologicosCollection;
    }

    @XmlTransient
    public Collection<AntecedentesHeredofamiliares> getAntecedentesHeredofamiliaresCollection() {
        return antecedentesHeredofamiliaresCollection;
    }

    public void setAntecedentesHeredofamiliaresCollection(Collection<AntecedentesHeredofamiliares> antecedentesHeredofamiliaresCollection) {
        this.antecedentesHeredofamiliaresCollection = antecedentesHeredofamiliaresCollection;
    }

    public Tutor getFkIdTutor() {
        return fkIdTutor;
    }

    public void setFkIdTutor(Tutor fkIdTutor) {
        this.fkIdTutor = fkIdTutor;
    }

    @XmlTransient
    public Collection<ExamenBucal> getExamenBucalCollection() {
        return examenBucalCollection;
    }

    public void setExamenBucalCollection(Collection<ExamenBucal> examenBucalCollection) {
        this.examenBucalCollection = examenBucalCollection;
    }

    @XmlTransient
    public Collection<AntecedentesPersonalesNoPatologicos> getAntecedentesPersonalesNoPatologicosCollection() {
        return antecedentesPersonalesNoPatologicosCollection;
    }

    public void setAntecedentesPersonalesNoPatologicosCollection(Collection<AntecedentesPersonalesNoPatologicos> antecedentesPersonalesNoPatologicosCollection) {
        this.antecedentesPersonalesNoPatologicosCollection = antecedentesPersonalesNoPatologicosCollection;
    }

    @XmlTransient
    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
    }

    @XmlTransient
    public Collection<PosturaDelPaciente> getPosturaDelPacienteCollection() {
        return posturaDelPacienteCollection;
    }

    public void setPosturaDelPacienteCollection(Collection<PosturaDelPaciente> posturaDelPacienteCollection) {
        this.posturaDelPacienteCollection = posturaDelPacienteCollection;
    }

    @XmlTransient
    public Collection<InterconsultaMedica> getInterconsultaMedicaCollection() {
        return interconsultaMedicaCollection;
    }

    public void setInterconsultaMedicaCollection(Collection<InterconsultaMedica> interconsultaMedicaCollection) {
        this.interconsultaMedicaCollection = interconsultaMedicaCollection;
    }

    @XmlTransient
    public Collection<ModelosDeEstudioFotografias> getModelosDeEstudioFotografiasCollection() {
        return modelosDeEstudioFotografiasCollection;
    }

    public void setModelosDeEstudioFotografiasCollection(Collection<ModelosDeEstudioFotografias> modelosDeEstudioFotografiasCollection) {
        this.modelosDeEstudioFotografiasCollection = modelosDeEstudioFotografiasCollection;
    }

    @XmlTransient
    public Collection<AnalisisRadiografico> getAnalisisRadiograficoCollection() {
        return analisisRadiograficoCollection;
    }

    public void setAnalisisRadiograficoCollection(Collection<AnalisisRadiografico> analisisRadiograficoCollection) {
        this.analisisRadiograficoCollection = analisisRadiograficoCollection;
    }

    @XmlTransient
    public Collection<Odontograma> getOdontogramaCollection() {
        return odontogramaCollection;
    }

    public void setOdontogramaCollection(Collection<Odontograma> odontogramaCollection) {
        this.odontogramaCollection = odontogramaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Paciente[ idPaciente=" + idPaciente + " ]";
    }
    
}
