package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Grupo;
import com.Buscador.dto.MsgPublico;


public interface IMsgPublicoService {
	
	public List<MsgPublico> listarMsgPublicos();
	
	public List<MsgPublico> msgXgrupo(Grupo grupo);//nos devuelve todos los mensajes de 1 grupo en concreto
	
	public MsgPublico guardarMsgPublico(MsgPublico msgPublico);
	
	public MsgPublico msgPublicoXID(Long id);
	
	public MsgPublico actualizarMsgPublico(MsgPublico msgPublico);
	
	public void borrarMsgPublico(Long id);
}
