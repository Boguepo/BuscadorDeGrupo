package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.Jugador;
import com.Buscador.dto.MsgPrivado;


public interface IMsgPrivadoService {
	
	public List<MsgPrivado> listarMsgPrivados();
	
	public List<MsgPrivado> remitente(Jugador Jugador);//nos devuelve todos los mensajes que ha mandado 1 user en concreto
	
	public List<MsgPrivado> destino(Jugador Jugador);//nos devuelve todos los mensajes que le han mandado a 1 user en concreto
	
	public MsgPrivado guardarMsgPrivado(MsgPrivado msgPrivado);
	
	public MsgPrivado msgPrivadoXID(Long id);
	
	public MsgPrivado actualizarMsgPrivado(MsgPrivado msgPrivado);
	
	public void borrarMsgPrivado(Long id);
}
