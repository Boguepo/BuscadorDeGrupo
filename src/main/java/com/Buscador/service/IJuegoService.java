package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Juego;

public interface IJuegoService {
	
	public List<Juego> listarJuegos();
	
	public Juego guardarJuego(Juego juego);
	
	public Juego juegoXID(Long id);
	
	public Juego actualizarJuego(Juego juego);
	
	public void borrarJuego(Long id);
}
