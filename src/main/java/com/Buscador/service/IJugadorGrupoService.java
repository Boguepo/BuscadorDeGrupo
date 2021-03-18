package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.JugadorGrupo;

public interface IJugadorGrupoService {
	//Metodos del CRUD
			public List<JugadorGrupo> listarJugadorGrupo(); //Listar All 
			
			public JugadorGrupo guardarJugadorGrupo(JugadorGrupo jugadorgrupo);	//Guarda un JugadorGrupo CREATE
			
			public JugadorGrupo JugadorGrupoXID(long id); //Leer datos de un JugadorGrupo READ
			
			public JugadorGrupo actualizarJugadorGrupo(JugadorGrupo jugadorgrupo); //Actualiza datos del JugadorGrupo UPDATE
			
			public void eliminarJugadorGrupo(long id);// Elimina el JugadorGrupo DELETE
		
}
