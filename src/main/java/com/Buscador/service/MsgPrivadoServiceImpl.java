package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IMsgPrivadoDAO;
import com.Buscador.dto.MsgPrivado;

@Service
public class MsgPrivadoServiceImpl implements IMsgPrivadoService {


	@Autowired
	IMsgPrivadoDAO imsgPrivadoDAO;
	
	@Override
	public List<MsgPrivado> listarMsgPrivados() {
		return imsgPrivadoDAO.findAll();
	}

	@Override
	public MsgPrivado guardarMsgPrivado(MsgPrivado msgPrivado) {
		return imsgPrivadoDAO.save(msgPrivado);
	}

	@Override
	public MsgPrivado msgPrivadoXID(Long id) {
		return imsgPrivadoDAO.findById(id).get();
	}

	@Override
	public MsgPrivado actualizarMsgPrivado(MsgPrivado msgPrivado) {
		return imsgPrivadoDAO.save(msgPrivado);
	}

	@Override
	public void borrarMsgPrivado(Long id) {
		imsgPrivadoDAO.deleteById(id);
	}

}
