package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.EsAmigo;
import com.Buscador.dto.Jugador;


public interface IEsAmigoService {

	//Metodos del CRUD
		public List<EsAmigo> listarEsAmigos(); //Listar All 
		
		public List<EsAmigo> listarXJugador(Jugador jugador);//Listar por usuario que manda la solicitud
		
		public List<EsAmigo> jugadorXamigo(Jugador jugador);//Nos muestra los users que han mandado solicitud a 1 user en concreto
		
		public EsAmigo guardarEsAmigo(EsAmigo esamigo);	//Guarda un EsAmigo CREATE
		
		public EsAmigo EsAmigoXID(long id); //Leer datos de un EsAmigo READ
		
		public EsAmigo actualizarEsAmigo(EsAmigo esamigo); //Actualiza datos del EsAmigo UPDATE
		
		public void eliminarEsAmigo(long id);// Elimina el EsAmigo DELETE
	

}
