package com.Buscador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buscador.dao.IMsgPublicoDAO;
import com.Buscador.dto.MsgPublico;



@Service
public class MsgPublicoServiceImpl implements IMsgPublicoService{
	@Autowired
	IMsgPublicoDAO imsgPublicoDAO;

	@Override
	public List<MsgPublico> listarMsgPublicos() {
	
		return imsgPublicoDAO.findAll();
	}

	@Override
	public MsgPublico guardarMsgPublico(MsgPublico msgPublico) {
		return imsgPublicoDAO.save(msgPublico);
	}

	@Override
	public MsgPublico msgPublicoXID(Long id) {
		return imsgPublicoDAO.findById(id).get();
	}

	@Override
	public MsgPublico actualizarMsgPrivado(MsgPublico msgPublico) {
		return imsgPublicoDAO.save(msgPublico);
	}

	@Override
	public void borrarMsgPublico(Long id) {
		imsgPublicoDAO.deleteById(id);
	}
	

}
