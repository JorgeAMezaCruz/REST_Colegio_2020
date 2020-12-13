package com.cl3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Curso;
import com.cl3.service.CursoService;


@RestController
@RequestMapping(value = "/curso")
public class CursoController {
		@Autowired
		private CursoService cursoService;
		
		/*
		 * @Autowired private CategoriaService categoriaService;
		 */
		

		@GetMapping(path = "/listAllCursos")
		@ResponseBody
		public List<Curso> listAllCursos(){
			return cursoService.listAll();
		}
		
		/*
		 * @GetMapping(path = "/listAllCategorias")
		 * 
		 * @ResponseBody public List<Categoria> listAllCategorias(){ return
		 * categoriaService.listAll(); }
		 */
		
		/*
		 * //select computadora > a una fila
		 * 
		 * @GetMapping(path = "/listAllConsulta/{st1}/{st2}")
		 * 
		 * @ResponseBody public List<Allumno> listAllAllumno(@PathVariable("st1") double
		 * sotck1,
		 * 
		 * @PathVariable("st2") double sotck2){ return
		 * alumnoService.listAllAllumnosRangoSueldo(sotck1, sotck2); }
		 */
		
		
		@PostMapping(path = "/saveCurso")
		public void saveCurso(@RequestBody Curso bean) {
			cursoService.saveCurso(bean);
		}
	
}
