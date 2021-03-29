package com.Buscador.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.Juego;

public interface IJuegoDAO extends JpaRepository<Juego, Long>{

}
