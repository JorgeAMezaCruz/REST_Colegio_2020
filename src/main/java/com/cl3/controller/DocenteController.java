package com.cl3.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.entity.Docente;
import com.cl3.service.DocenteService;


@RestController
@RequestMapping(value = "/docente")
public class DocenteController {
		@Autowired
		private DocenteService docenteService;
		
		/*
		 * @Autowired private CategoriaService categoriaService;
		 */
		

		@GetMapping(path = "/listAllDocentes")
		@ResponseBody
		public List<Docente> listAllDocentes(){
			return docenteService.listAll();
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
		 * @ResponseBody public List<Docente> listAllDocente(@PathVariable("st1") double
		 * sotck1,
		 * 
		 * @PathVariable("st2") double sotck2){ return
		 * docenteService.listAllDocentesRangoSueldo(sotck1, sotck2); }
		 */
		
		
		@PostMapping(path = "/saveDocente")
		public void saveComputadora(@RequestBody Docente bean) {
			docenteService.saveDocente(bean);
		}
	
}
