package com.Buscador.service;

import java.util.List;

import com.Buscador.dto.MsgPrivado;


public interface IMsgPrivadoService {
	
	public List<MsgPrivado> listarMsgPrivados();
	
	public MsgPrivado guardarMsgPrivado(MsgPrivado msgPrivado);
	
	
	public MsgPrivado msgPrivadoXID(Long id);
	
	public MsgPrivado actualizarMsgPrivado(MsgPrivado msgPrivado);
	
	public void borrarMsgPrivado(Long id);
}
