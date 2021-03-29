package com.Buscador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Grupo;
import com.Buscador.dto.Juego;

public interface IGrupoDAO extends JpaRepository<Grupo, Long> {
	
	public List<Grupo> findByJuego(Juego juego);
}
