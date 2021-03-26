package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IJugadorDAO;
import com.Buscador.dto.Jugador;
@Service
public class JugadorServiceImpl implements IJugadorService {

	@Autowired
	IJugadorDAO jugadorDAO;
	
	@Override
	public List<Jugador> listarJugadores() {
		// TODO Auto-generated method stub
		return jugadorDAO.findAll();
	}

	@Override
	public Jugador guardarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		return jugadorDAO.save(jugador);
	}

	@Override
	public Jugador jugadorXID(Long id) {
		// TODO Auto-generated method stub
		return jugadorDAO.findById(id).get();
	}

	@Override
	public Jugador actualizarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		return jugadorDAO.save(jugador);
	}

	@Override
	public void borrarJugador(Long id) {
		// TODO Auto-generated method stub
		jugadorDAO.deleteById(id);
		
	}

}
