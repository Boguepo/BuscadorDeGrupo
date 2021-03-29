package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Grupo;
import com.Buscador.dto.Juego;

public interface IGrupoService {

	public List<Grupo> listarGrupos();
	
	public Grupo guardarGrupo(Grupo grupo);
	
	public List<Grupo> grupoXjuego(Juego juego);
	
	public Grupo grupoXID(Long id);
	
	public Grupo actualizarGrupo(Grupo grupo);
	
	public void borrarGrupo(Long id);
}
