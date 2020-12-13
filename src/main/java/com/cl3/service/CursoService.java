package com.cl3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Curso;
import com.cl3.repository.CursoDAO;

@Service
public class CursoService {
	@Autowired
	private CursoDAO cursoDAO;
	
	public List<Curso> listAll(){
		return cursoDAO.findAll();
	}

	public void saveCurso(Curso bean) {
		cursoDAO.save(bean);
	}
	
}
