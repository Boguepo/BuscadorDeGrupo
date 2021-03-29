package com.Buscador.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Jugador;

public interface IJugadorDAO extends JpaRepository<Jugador, Long>{

}
