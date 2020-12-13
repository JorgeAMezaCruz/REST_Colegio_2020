package com.cl3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Seccion;
import com.cl3.repository.SeccionDAO;

@Service
public class SeccionService {
	@Autowired
	private SeccionDAO seccionDAO;

	public List<Seccion> listAll() {
		return seccionDAO.findAll();
	}


	public void saveSeccion(Seccion bean) {
		seccionDAO.save(bean);
	}

}
