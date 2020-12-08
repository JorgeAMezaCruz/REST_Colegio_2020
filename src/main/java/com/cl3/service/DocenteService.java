package com.cl3.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Docente;
import com.cl3.repository.DocenteDAO;

@Service
public class DocenteService {
	@Autowired
	private DocenteDAO docenteDAO;
	
	public List<Docente> listAll(){
		return docenteDAO.findAll();
	}

	/*
	 * public List<Docente> listAllDocentesRangoSueldo(double st1,double st2){
	 * return docenteDAO.listDocentesPorRangoSueldo(st1, st2); }
	 */
	
	public void saveDocente(Docente bean) {
		docenteDAO.save(bean);
	}
	
}
