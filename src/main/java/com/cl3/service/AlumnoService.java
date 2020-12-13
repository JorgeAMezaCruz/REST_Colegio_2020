package com.cl3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Alumno;
import com.cl3.repository.AlumnoDAO;

@Service
public class AlumnoService {
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	public List<Alumno> listAll(){
		return alumnoDAO.findAll();
	}

	/*
	 * public List<Docente> listAllDocentesRangoSueldo(double st1,double st2){
	 * return docenteDAO.listDocentesPorRangoSueldo(st1, st2); }
	 */
	
	public void saveAlumno(Alumno bean) {
		alumnoDAO.save(bean);
	}
	
}
