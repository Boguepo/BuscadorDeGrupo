package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.MsgPublico;


public interface IMsgPublicoService {
	
	public List<MsgPublico> listarMsgPublicos();
	
	public MsgPublico guardarMsgPublico(MsgPublico msgPublico);
	
	
	public MsgPublico msgPublicoXID(Long id);
	
	public MsgPublico actualizarMsgPrivado(MsgPublico msgPublico);
	
	public void borrarMsgPublico(Long id);
}
