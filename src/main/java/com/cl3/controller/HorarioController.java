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
import com.cl3.service.HorarioService;


@RestController
@RequestMapping(value = "/horario")
public class HorarioController {
		@Autowired
		private HorarioService horarioService;
		
		/*
		 * @Autowired private CategoriaService categoriaService;
		 */
		

		@GetMapping(path = "/listAllHorarios")
		@ResponseBody
		public List<Horario> listAllHorarios(){
			return horarioService.listAll();
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
		
		
		@PostMapping(path = "/saveHorario")
		public void saveHorario(@RequestBody Horario bean) {
			horarioService.saveHorario(bean);
		}
	
}
