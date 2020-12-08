package com.cl3.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.cl3.entity.Docente;

public interface DocenteDAO extends JpaRepository<Docente, Integer>{
	
	
}
