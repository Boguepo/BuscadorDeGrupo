package com.Buscador.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buscador.dto.MsgPublico;

public interface IMsgPublicoDAO extends JpaRepository<MsgPublico,Long> {

}
