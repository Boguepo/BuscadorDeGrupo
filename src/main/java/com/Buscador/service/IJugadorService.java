package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Jugador;

public interface IJugadorService {
	
	public List<Jugador> listarJugadores();
	
	public Jugador guardarJugador(Jugador jugador);
	
	public Jugador jugadorXID(Long id);
	
	public Jugador actualizarJugador(Jugador jugador);
	
	public void borrarJugador(Long id);
}
