package com.cl3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Alumno_Curso;
import com.cl3.entity.Docente_Curso;
import com.cl3.repository.AlumnoCursoDAO;

@Service
public class AlumnoCursoService {
	@Autowired
	private AlumnoCursoDAO alumnocursoDAO;

	public List<Alumno_Curso> listAll() {
		return alumnocursoDAO.findAll();
	}


	public void saveAlumnoCurso(Alumno_Curso bean) {
		alumnocursoDAO.save(bean);
	}
	
	
	public List<Alumno_Curso> listAllAlumnosPorSeccion(String seccion){
		return alumnocursoDAO.listAlumnosPorSeccion(seccion);
	}
	
	public List<Alumno_Curso> listAllAlumnosPorCurso(String curso){
		return alumnocursoDAO.listAlumnosPorCurso(curso);
	}

}
