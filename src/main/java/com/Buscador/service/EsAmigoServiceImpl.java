package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IEsAmigoDAO;
import com.Buscador.dto.EsAmigo;

@Service
public class EsAmigoServiceImpl implements IEsAmigoService {
	
	@Autowired
	IEsAmigoDAO iEsAmigoDAO;

	@Override
	public List<EsAmigo> listarEsAmigos() {
		// TODO Auto-generated method stub
		return iEsAmigoDAO.findAll();
	}

	@Override
	public EsAmigo guardarEsAmigo(EsAmigo esamigo) {
		// TODO Auto-generated method stub
		return iEsAmigoDAO.save(esamigo);
	}

	@Override
	public EsAmigo EsAmigoXID(long id) {
		// TODO Auto-generated method stub
		return iEsAmigoDAO.findById(id).get();
	}

	@Override
	public EsAmigo actualizarEsAmigo(EsAmigo esamigo) {
		// TODO Auto-generated method stub
		return iEsAmigoDAO.save(esamigo);
	}

	@Override
	public void eliminarEsAmigo(long id) {
		// TODO Auto-generated method stub
		iEsAmigoDAO.deleteById(id);
	}

}
