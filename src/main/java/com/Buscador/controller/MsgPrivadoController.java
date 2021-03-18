package com.Buscador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Buscador.dto.MsgPrivado;
import com.Buscador.service.MsgPrivadoServiceImpl;

@RestController
@RequestMapping("/lfg")
public class MsgPrivadoController {

	@Autowired
	MsgPrivadoServiceImpl msgPrivadoService;
	
	@GetMapping("/msgPrivado")
	public List<MsgPrivado> listarMsgPrivados(){
		return msgPrivadoService.listarMsgPrivados();
	}
	
	@PostMapping("/msgPrivado")
	public MsgPrivado guardarMsgPrivado(@RequestBody MsgPrivado msgPrivado) {
		return msgPrivadoService.guardarMsgPrivado(msgPrivado);
	}
	
	@GetMapping("/msgPrivado/{id}")
	public MsgPrivado msgPrivadoXID(@PathVariable(name = "id") Long id) {
		return msgPrivadoService.msgPrivadoXID(id);
	}
	
	@PutMapping("/msgPrivado/{id}")
	public MsgPrivado actualizarMsgPrivado(@PathVariable(name ="id") Long id, @RequestBody MsgPrivado msgPrivado) {
		
		MsgPrivado msgPrivado_sel = new MsgPrivado();//Seleccionado
		MsgPrivado msgPrivado_act = new MsgPrivado();//Actualizado
		
		msgPrivado_sel = msgPrivadoService.msgPrivadoXID(id);
		
		msgPrivado_sel.setMensaje(msgPrivado.getMensaje());
		msgPrivado_sel.setFecha(msgPrivado.getFecha());
		msgPrivado_sel.setJugador(msgPrivado.getJugador());
		msgPrivado_sel.setJugadorDest(msgPrivado.getJugadorDest());
		
		msgPrivado_act = msgPrivadoService.actualizarMsgPrivado(msgPrivado_sel);
		
		return msgPrivado_act;
	}
	
	@DeleteMapping("/msgPrivado/{id}")
	public void borrarMsgPrivado(@PathVariable(name = "id") Long id) {
		msgPrivadoService.borrarMsgPrivado(id);
		
	}
	
}
