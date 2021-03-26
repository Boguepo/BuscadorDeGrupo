package com.Buscador.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Grupo;

import com.Buscador.dto.MsgPublico;

public interface IMsgPublicoDAO extends JpaRepository<MsgPublico,Long> {

	//nos devuelve todos los mensajes de 1 grupo en concreto
	public List<MsgPublico> findByGrupo(Grupo grupo);
	
}
