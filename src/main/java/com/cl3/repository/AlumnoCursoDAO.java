package com.cl3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cl3.entity.Alumno_Curso;

public interface AlumnoCursoDAO extends JpaRepository<Alumno_Curso, Integer>{
	
	@Query("select m from Alumno_Curso m where m.seccion.nomSeccion like  :seccion ")
	List<Alumno_Curso> listAlumnosPorSeccion(@Param("seccion")String seccion);
	
	
	@Query("select m from Alumno_Curso m where m.curso.nomCurso like  :curso ")
	List<Alumno_Curso> listAlumnosPorCurso(@Param("curso")String curso);
	
	
	
}
