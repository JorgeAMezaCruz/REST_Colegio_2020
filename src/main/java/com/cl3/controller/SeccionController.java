package com.cl3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Horario;
import com.cl3.entity.Seccion;
import com.cl3.service.HorarioService;
import com.cl3.service.SeccionService;

@RestController
@RequestMapping(value = "/seccion")
public class SeccionController {
	@Autowired
	private SeccionService seccionService;

	@Autowired
	private HorarioService horarioService;

	@GetMapping(path = "/listAllSecciones")
	@ResponseBody
	public List<Seccion> listAllSecciones() {
		return seccionService.listAll();
	}

	@GetMapping(path = "/listAllHorarios")
	@ResponseBody
	public List<Horario> listAllHorarios() {
		return horarioService.listAll();
	}

	@PostMapping(path = "/saveSeccion")
	public void saveSeccion(@RequestBody Seccion bean) {
		seccionService.saveSeccion(bean);
	}

}
