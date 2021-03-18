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

import com.Buscador.dto.MsgPublico;
import com.Buscador.service.MsgPublicoServiceImpl;


@RestController
@RequestMapping("/lfg")
public class MsgPublicoController {
	@Autowired
	MsgPublicoServiceImpl msgPublicoService;
	
	@GetMapping("/msgPublico")
	public List<MsgPublico> listarMsgPublicos(){
		return msgPublicoService.listarMsgPublicos();
	}
	
	@PostMapping("/msgPublico")
	public MsgPublico guardarMsgPublico(@RequestBody MsgPublico msgPublico) {
		return msgPublicoService.guardarMsgPublico(msgPublico);
	}
	
	@GetMapping("/msgPublico/{id}")
	public MsgPublico msgPublicoXID(@PathVariable(name = "id") Long id) {
		return msgPublicoService.msgPublicoXID(id);
	}
	
	@PutMapping("/msgPublico/{id}")
	public MsgPublico actualizarMsgPublico(@PathVariable(name ="id") Long id, @RequestBody MsgPublico msgPublico) {
		
		MsgPublico msgPublico_sel = new MsgPublico();//Seleccionado
		MsgPublico msgPublico_act = new MsgPublico();//Actualizado
		
		msgPublico_sel = msgPublicoService.msgPublicoXID(id);
		
		msgPublico_sel.setMensaje(msgPublico.getMensaje());
		msgPublico_sel.setFecha(msgPublico.getFecha());
		msgPublico_sel.setJugador(msgPublico.getJugador());
		msgPublico_sel.setGrupo(msgPublico.getGrupo());
		
		msgPublico_act = msgPublicoService.actualizarMsgPublico(msgPublico_sel);
		
		return msgPublico_act;
	}
	
	@DeleteMapping("/msgPublico/{id}")
	public void borrarMsgPublico(@PathVariable(name = "id") Long id) {
		msgPublicoService.borrarMsgPublico(id);
		
	}
}
