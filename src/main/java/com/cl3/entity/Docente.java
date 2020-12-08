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
@Table(name="tb_docente")
public class Docente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_docente")
	private int idDocente;
	
	@Column(name="nombres_docente")
	private String nomDocente;
	
	@Column(name="apellido_paterno_docente")
	private String apePaternoDocente;
	
	@Column(name="apellido_materno_docente")
	private String apeMaternoDocente;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento_docente")
	private Date fecha;
	
	@Column(name="dni_docente")
	private String dniDocente;
	
	@Column(name="direccion_docente")
	private String direccionDocente;
	
	@Column(name="distrito_docente")
	private String distritoDocente;

	@Column(name="celular_docente")
	private String celularDocente;

	@Column(name="correo_docente")
	private String correoDocente;

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public String getNomDocente() {
		return nomDocente;
	}

	public void setNomDocente(String nomDocente) {
		this.nomDocente = nomDocente;
	}

	public String getApePaternoDocente() {
		return apePaternoDocente;
	}

	public void setApePaternoDocente(String apePaternoDocente) {
		this.apePaternoDocente = apePaternoDocente;
	}

	public String getApeMaternoDocente() {
		return apeMaternoDocente;
	}

	public void setApeMaternoDocente(String apeMaternoDocente) {
		this.apeMaternoDocente = apeMaternoDocente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDniDocente() {
		return dniDocente;
	}

	public void setDniDocente(String dniDocente) {
		this.dniDocente = dniDocente;
	}

	public String getDireccionDocente() {
		return direccionDocente;
	}

	public void setDireccionDocente(String direccionDocente) {
		this.direccionDocente = direccionDocente;
	}

	public String getDistritoDocente() {
		return distritoDocente;
	}

	public void setDistritoDocente(String distritoDocente) {
		this.distritoDocente = distritoDocente;
	}

	public String getCelularDocente() {
		return celularDocente;
	}

	public void setCelularDocente(String celularDocente) {
		this.celularDocente = celularDocente;
	}

	public String getCorreoDocente() {
		return correoDocente;
	}

	public void setCorreoDocente(String correoDocente) {
		this.correoDocente = correoDocente;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
