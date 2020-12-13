package com.cl3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cl3.entity.Horario;

public interface HorarioDAO extends JpaRepository<Horario, Integer>{
	
	
}
