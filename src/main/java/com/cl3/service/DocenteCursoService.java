package com.cl3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Docente_Curso;
import com.cl3.repository.DocenteCursoDAO;

@Service
public class DocenteCursoService {
	@Autowired
	private DocenteCursoDAO docentecursoDAO;

	public List<Docente_Curso> listAll() {
		return docentecursoDAO.findAll();
	}


	public void saveDocenteCurso(Docente_Curso bean) {
		docentecursoDAO.save(bean);
	}
	
	
	public List<Docente_Curso> listAllDocentesPorSeccion(String seccion){
		return docentecursoDAO.listDocentesPorSeccion(seccion);
	}
	
	public List<Docente_Curso> listAllDocentesPorCurso(String curso){
		return docentecursoDAO.listDocentesPorCurso(curso);
	}

}
