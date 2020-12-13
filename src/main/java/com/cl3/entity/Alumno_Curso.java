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
@Table(name = "tb_alumno_curso")
public class Alumno_Curso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno_curso")
	private int codAlumnoCurso;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private Alumno alumno;



	@ManyToOne
	@JoinColumn(name = "id_curso")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name = "id_seccion")
	private Seccion seccion;

	@Column(name = "nota_1")
	private double nota1;

	@Column(name = "nota_2")
	private double nota2;

	@Column(name = "nota_3")
	private double nota3;

	@Column(name = "nota_4")
	private double nota4;

	@Column(name = "nota_5")
	private double nota5;

	public int getCodAlumnoCurso() {
		return codAlumnoCurso;
	}

	public void setCodAlumnoCurso(int codAlumnoCurso) {
		this.codAlumnoCurso = codAlumnoCurso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNota5() {
		return nota5;
	}

	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
