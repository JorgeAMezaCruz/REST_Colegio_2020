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

import com.cl3.entity.Alumno;
import com.cl3.entity.Alumno_Curso;
import com.cl3.entity.Curso;
import com.cl3.entity.Docente_Curso;
import com.cl3.entity.Seccion;
import com.cl3.service.AlumnoCursoService;
import com.cl3.service.AlumnoService;
import com.cl3.service.CursoService;
import com.cl3.service.SeccionService;

@RestController
@RequestMapping(value = "/alumnocurso")
public class AlumnoCursoController {
	@Autowired
	private AlumnoCursoService alumnocursoService;

	@Autowired
	private AlumnoService alumnoService;

	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private SeccionService seccionService;
	
	@GetMapping(path = "/listAllAlumnosCursos")
	@ResponseBody
	public List<Alumno_Curso> listAllAlumnosCursos() {
		return alumnocursoService.listAll();
	}
	
	
	@GetMapping(path = "/listAllAlumnos")
	@ResponseBody
	public List<Alumno> listAllAlumnos() {
		return alumnoService.listAll();
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
	
	
	@PostMapping(path = "/saveAlumnoCurso")
	public void saveAlumnoCurso(@RequestBody Alumno_Curso bean) {
		alumnocursoService.saveAlumnoCurso(bean);
	}
	
	

	@GetMapping(path = "/listAllConsulta/{seccion}")
	@ResponseBody
	public List<Alumno_Curso> listAllAlumno(@PathVariable("seccion") String seccion) {
		return alumnocursoService.listAllAlumnosPorSeccion(seccion);
	}
	
	
	@GetMapping(path = "/listAllConsultaCurso/{curso}")
	@ResponseBody
	public List<Alumno_Curso> listAllAlumnoCurso(@PathVariable("curso") String curso) {
		return alumnocursoService.listAllAlumnosPorCurso(curso);
	}
	
	
	

}
