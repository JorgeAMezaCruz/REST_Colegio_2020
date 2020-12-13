package com.cl3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cl3.entity.Docente_Curso;

public interface DocenteCursoDAO extends JpaRepository<Docente_Curso, Integer>{
	
	@Query("select m from Docente_Curso m where m.seccion.nomSeccion like  :seccion ")
	List<Docente_Curso> listDocentesPorSeccion(@Param("seccion")String seccion);
	
	
	@Query("select m from Docente_Curso m where m.curso.nomCurso like  :curso ")
	List<Docente_Curso> listDocentesPorCurso(@Param("curso")String curso);
	
	
	
	
	
}
