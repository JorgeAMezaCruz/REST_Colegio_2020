package com.cl3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cl3.entity.Curso;

public interface CursoDAO extends JpaRepository<Curso, Integer>{
	
	
}
