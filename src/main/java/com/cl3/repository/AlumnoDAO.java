package com.cl3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cl3.entity.Alumno;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer>{
	
	
}
