package com.Buscador.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.EsAmigo;


public interface IEsAmigoDAO extends JpaRepository<EsAmigo, Long>{
	
}

