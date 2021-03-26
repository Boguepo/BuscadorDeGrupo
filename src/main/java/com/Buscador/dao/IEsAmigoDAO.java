package com.Buscador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.EsAmigo;
import com.Buscador.dto.Jugador;


public interface IEsAmigoDAO extends JpaRepository<EsAmigo, Long>{
	
	//Nos busca todos las solicitudes que ha mandado 1 usuario en concreto
	public List<EsAmigo> findByUser(Jugador jugador);
	
	//Nos devuelve los usuarios que le han mandado slicitud de amistad a 1 usuario concreto
	public List<EsAmigo> findByAmigo(Jugador jugador);
}

