package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IGrupoDAO;
import com.Buscador.dto.Grupo;
import com.Buscador.dto.Juego;
@Service
public class GrupoServiceImpl implements IGrupoService {

	@Autowired
	IGrupoDAO grupoDAO;

	@Override
	public List<Grupo> listarGrupos() {
		// TODO Auto-generated method stub
		return grupoDAO.findAll();
	}

	@Override
	public Grupo guardarGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return grupoDAO.save(grupo);
	}


	@Override
	public Grupo grupoXID(Long id) {
		// TODO Auto-generated method stub
		return grupoDAO.findById(id).get();
	}

	@Override
	public Grupo actualizarGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return grupoDAO.save(grupo);
	}

	@Override
	public void borrarGrupo(Long id) {
		// TODO Auto-generated method stub
		grupoDAO.deleteById(id);
		
	}

	@Override
	public List<Grupo> grupoXjuego(Juego juego) {
		// TODO Auto-generated method stub
		return grupoDAO.findByJuego(juego);
	}
}
