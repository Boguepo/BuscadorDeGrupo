package com.Buscador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Grupo;
import com.Buscador.dto.Jugador;
import com.Buscador.dto.JugadorGrupo;

public interface IJugadorGrupoDAO extends JpaRepository<JugadorGrupo, Long>{

	//nos busca todos los grupos donde este 1 usuario en concreto
	public List<JugadorGrupo> findByJugador(Jugador jugador);
	
	//nos busca los jugadores que hay en 1 grupo en concreto
	public List<JugadorGrupo> findByGrupo(Grupo grupo);
}
