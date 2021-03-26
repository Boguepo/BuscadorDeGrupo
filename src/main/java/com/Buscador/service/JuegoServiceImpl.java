package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IJuegoDAO;
import com.Buscador.dto.Juego;
@Service
public class JuegoServiceImpl implements IJuegoService {

	@Autowired
	IJuegoDAO juegoDAO;
	
	@Override
	public List<Juego> listarJuegos() {
		// TODO Auto-generated method stub
		return juegoDAO.findAll();
	}

	@Override
	public Juego guardarJuego(Juego juego) {
		// TODO Auto-generated method stub
		return juegoDAO.save(juego);
	}

	@Override
	public Juego juegoXID(Long id) {
		// TODO Auto-generated method stub
		return juegoDAO.findById(id).get();
	}

	@Override
	public Juego actualizarJuego(Juego juego) {
		// TODO Auto-generated method stub
		return juegoDAO.save(juego);
	}

	@Override
	public void borrarJuego(Long id) {
		// TODO Auto-generated method stub
		juegoDAO.deleteById(id);
		
	}

}
