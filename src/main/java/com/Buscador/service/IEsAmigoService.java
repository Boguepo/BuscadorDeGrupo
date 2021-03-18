package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.EsAmigo;


public interface IEsAmigoService {

	//Metodos del CRUD
		public List<EsAmigo> listarEsAmigos(); //Listar All 
		
		public EsAmigo guardarEsAmigo(EsAmigo esamigo);	//Guarda un EsAmigo CREATE
		
		public EsAmigo EsAmigoXID(long id); //Leer datos de un EsAmigo READ
		
		public EsAmigo actualizarEsAmigo(EsAmigo esamigo); //Actualiza datos del EsAmigo UPDATE
		
		public void eliminarEsAmigo(long id);// Elimina el EsAmigo DELETE
	

}
