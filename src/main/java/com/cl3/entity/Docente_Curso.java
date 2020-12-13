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
@Table(name="tb_docente_curso")
public class Docente_Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_docente_curso")
	private int codDocenteCurso;
	
	@ManyToOne
	@JoinColumn(name="id_docente")
	private Docente docente;
	
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	@ManyToOne
	@JoinColumn(name="id_seccion")
	private Seccion seccion;

	public int getCodDocenteCurso() {
		return codDocenteCurso;
	}

	public void setCodDocenteCurso(int codDocenteCurso) {
		this.codDocenteCurso = codDocenteCurso;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
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
	
	
}
