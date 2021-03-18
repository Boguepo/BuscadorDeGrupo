package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IJugadorGrupoDAO;
import com.Buscador.dto.JugadorGrupo;

@Service
public class JugadorGrupoServiceImpl implements IJugadorGrupoService {

	@Autowired
	IJugadorGrupoDAO iJugadorGrupoDAO;
	
	@Override
	public List<JugadorGrupo> listarJugadorGrupo() {
		// TODO Auto-generated method stub
		return iJugadorGrupoDAO.findAll();
	}

	@Override
	public JugadorGrupo guardarJugadorGrupo(JugadorGrupo jugadorgrupo) {
		// TODO Auto-generated method stub
		return iJugadorGrupoDAO.save(jugadorgrupo);
	}

	@Override
	public JugadorGrupo JugadorGrupoXID(long id) {
		// TODO Auto-generated method stub
		return iJugadorGrupoDAO.findById(id).get();
	}

	@Override
	public JugadorGrupo actualizarJugadorGrupo(JugadorGrupo jugadorgrupo) {
		// TODO Auto-generated method stub
		return iJugadorGrupoDAO.save(jugadorgrupo);
	}

	@Override
	public void eliminarJugadorGrupo(long id) {
		// TODO Auto-generated method stub
		iJugadorGrupoDAO.deleteById(id);
	}

}
