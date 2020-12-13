package com.cl3.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tb_seccion")
public class Seccion implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_seccion")
	private int idSeccion;
	
	@Column(name="nombre_seccion")
	private String nomSeccion;

	@ManyToOne
	@JoinColumn(name="id_horario")
	private Horario horario;

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getNomSeccion() {
		return nomSeccion;
	}

	public void setNomSeccion(String nomSeccion) {
		this.nomSeccion = nomSeccion;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}	
	
	
	
	
}
