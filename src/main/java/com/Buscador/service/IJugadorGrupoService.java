package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Grupo;
import com.Buscador.dto.Jugador;
import com.Buscador.dto.JugadorGrupo;

public interface IJugadorGrupoService {
	//Metodos del CRUD
			public List<JugadorGrupo> listarJugadorGrupo(); //Listar All 
			
			public List<JugadorGrupo> userXgrupo(Jugador jugador);//Nos muestra los grupos donde este 1 jugador en concreto
			
			public List<JugadorGrupo> grupoXusers(Grupo grupo);//Nos muestra los usuarios que hay en 1 grupo en concreto
			
			public JugadorGrupo guardarJugadorGrupo(JugadorGrupo jugadorgrupo);	//Guarda un JugadorGrupo CREATE
			
			public JugadorGrupo JugadorGrupoXID(long id); //Leer datos de un JugadorGrupo READ
			
			public JugadorGrupo actualizarJugadorGrupo(JugadorGrupo jugadorgrupo); //Actualiza datos del JugadorGrupo UPDATE
			
			public void eliminarJugadorGrupo(long id);// Elimina el JugadorGrupo DELETE
		
}
