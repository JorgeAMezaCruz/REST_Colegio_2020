package com.cl3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Curso;
import com.cl3.entity.Docente;
import com.cl3.entity.Docente_Curso;
import com.cl3.entity.Seccion;
import com.cl3.service.CursoService;
import com.cl3.service.DocenteCursoService;
import com.cl3.service.DocenteService;
import com.cl3.service.SeccionService;

@RestController
@RequestMapping(value = "/docentecurso")
public class DocenteCursoController {

	@Autowired
	private DocenteCursoService docentecursoService;

	@Autowired
	private DocenteService docenteService;

	@Autowired
	private CursoService cursoService;

	@Autowired
	private SeccionService seccionService;

	@GetMapping(path = "/listAllDocentesCursos")
	@ResponseBody
	public List<Docente_Curso> listAllDocentesCursos() {
		return docentecursoService.listAll();
	}

	@GetMapping(path = "/listAllDocentes")
	@ResponseBody
	public List<Docente> listAllDocentes() {
		return docenteService.listAll();
	}

	@GetMapping(path = "/listAllCursos")
	@ResponseBody
	public List<Curso> listAllCursos() {
		return cursoService.listAll();
	}

	@GetMapping(path = "/listAllSecciones")
	@ResponseBody
	public List<Seccion> listAllSecciones() {
		return seccionService.listAll();
	}

	@PostMapping(path = "/saveDocenteCurso")
	public void saveDocenteCurso(@RequestBody Docente_Curso bean) {
		docentecursoService.saveDocenteCurso(bean);
	}

	@GetMapping(path = "/listAllConsulta/{seccion}")
	@ResponseBody
	public List<Docente_Curso> listAllDocente(@PathVariable("seccion") String seccion) {
		return docentecursoService.listAllDocentesPorSeccion(seccion);
	}
	
	
	@GetMapping(path = "/listAllConsultaCurso/{curso}")
	@ResponseBody
	public List<Docente_Curso> listAllDocenteCurso(@PathVariable("curso") String curso) {
		return docentecursoService.listAllDocentesPorCurso(curso);
	}
	
	
	
	
	

}
