package com.cl3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.entity.Horario;
import com.cl3.repository.HorarioDAO;

@Service
public class HorarioService {
	@Autowired
	private HorarioDAO horarioDAO;
	
	public List<Horario> listAll(){
		return horarioDAO.findAll();
	}

	public void saveHorario(Horario bean) {
		horarioDAO.save(bean);
	}
	
}
