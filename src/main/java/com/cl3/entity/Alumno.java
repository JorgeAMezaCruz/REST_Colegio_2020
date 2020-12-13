package com.cl3.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="tb_alumno")
public class Alumno implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_alumno")
	private int idAlumno;
	
	@Column(name="nombres_alumno")
	private String nomAlumno;
	
	@Column(name="apellido_paterno_alumno")
	private String apePaternoAlumno;
	
	@Column(name="apellido_materno_alumno")
	private String apeMaternoAlumno;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento_alumno")
	private Date fecha_alumno;
	
	@Column(name="dni_alumno")
	private String dniAlumno;
	
	

	@Column(name="nombres_apoderado")
	private String nomApoderado;
	
	@Column(name="apellido_paterno_apoderado")
	private String apePaternoApoderado;
	
	@Column(name="apellido_materno_apoderado")
	private String apeMaternoApoderado;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento_apoderado")
	private Date fecha_apoderado;
	
	@Column(name="dni_apoderado")
	private String dniApoderado;
	

	@Column(name="celular_apoderado")
	private String celularApoderado;

	@Column(name="correo_apoderado")
	private String correoApoderado;


	
	@Column(name="direccion")
	private String direccionAlumno;
	
	@Column(name="distrito")
	private String distritoAlumno;
	
	
	

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNomAlumno() {
		return nomAlumno;
	}

	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}

	public String getApePaternoAlumno() {
		return apePaternoAlumno;
	}

	public void setApePaternoAlumno(String apePaternoAlumno) {
		this.apePaternoAlumno = apePaternoAlumno;
	}

	public String getApeMaternoAlumno() {
		return apeMaternoAlumno;
	}

	public void setApeMaternoAlumno(String apeMaternoAlumno) {
		this.apeMaternoAlumno = apeMaternoAlumno;
	}

	public Date getFecha_alumno() {
		return fecha_alumno;
	}

	public void setFecha_alumno(Date fecha_alumno) {
		this.fecha_alumno = fecha_alumno;
	}

	public String getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public String getNomApoderado() {
		return nomApoderado;
	}

	public void setNomApoderado(String nomApoderado) {
		this.nomApoderado = nomApoderado;
	}

	public String getApePaternoApoderado() {
		return apePaternoApoderado;
	}

	public void setApePaternoApoderado(String apePaternoApoderado) {
		this.apePaternoApoderado = apePaternoApoderado;
	}

	public String getApeMaternoApoderado() {
		return apeMaternoApoderado;
	}

	public void setApeMaternoApoderado(String apeMaternoApoderado) {
		this.apeMaternoApoderado = apeMaternoApoderado;
	}

	public Date getFecha_apoderado() {
		return fecha_apoderado;
	}

	public void setFecha_apoderado(Date fecha_apoderado) {
		this.fecha_apoderado = fecha_apoderado;
	}

	public String getDniApoderado() {
		return dniApoderado;
	}

	public void setDniApoderado(String dniApoderado) {
		this.dniApoderado = dniApoderado;
	}

	public String getCelularApoderado() {
		return celularApoderado;
	}

	public void setCelularApoderado(String celularApoderado) {
		this.celularApoderado = celularApoderado;
	}

	public String getCorreoApoderado() {
		return correoApoderado;
	}

	public void setCorreoApoderado(String correoApoderado) {
		this.correoApoderado = correoApoderado;
	}

	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}

	public String getDistritoAlumno() {
		return distritoAlumno;
	}

	public void setDistritoAlumno(String distritoAlumno) {
		this.distritoAlumno = distritoAlumno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
