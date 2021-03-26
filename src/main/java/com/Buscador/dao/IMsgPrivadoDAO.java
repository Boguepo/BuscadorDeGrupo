package com.Buscador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Jugador;
import com.Buscador.dto.MsgPrivado;

public interface IMsgPrivadoDAO extends JpaRepository<MsgPrivado,Long>{
	
	//nos devuelve los mensajes que ha mandado 1 user en concreto
	public List<MsgPrivado> findByJugador(Jugador jugador);
	//nos devuelve los mensajes que se le han mandado a 1 user en concreto
	public List<MsgPrivado> findByJugadorDest(Jugador jugadorDest);
}
