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

import com.Buscador.dto.JugadorGrupo;
import com.Buscador.service.JugadorGrupoServiceImpl;


@RestController
@RequestMapping("/lfg")
public class JugadorGrupoController {

	@Autowired
	private JugadorGrupoServiceImpl jugadorGrupoServiceImpl;
	
	@GetMapping("/jugadorGrupos")
	public List<JugadorGrupo> listarJugadorGrupos(){
		return jugadorGrupoServiceImpl.listarJugadorGrupo();
	}
	
	
	@PostMapping("/jugadorGrupo")
	public JugadorGrupo salvarJugadorGrupo(@RequestBody JugadorGrupo jugadorGrupo) {
		
		return jugadorGrupoServiceImpl.guardarJugadorGrupo(jugadorGrupo);
	}
	
	
	@GetMapping("/jugadorGrupo/{id}")
	public JugadorGrupo jugadorGrupoXID(@PathVariable(name="id") int id) {
		
		JugadorGrupo JugadorGrupo_xid= new JugadorGrupo();
		
		JugadorGrupo_xid=jugadorGrupoServiceImpl.JugadorGrupoXID(id);
		
		System.out.println("JugadorGrupo XID: "+JugadorGrupo_xid);
		
		return JugadorGrupo_xid;
	}
	
	@PutMapping("/jugadorGrupo/{id}")
	public JugadorGrupo actualizarJugadorGrupo(@PathVariable(name="id")int id,@RequestBody JugadorGrupo jugadorGrupo) {
		
		JugadorGrupo JugadorGrupo_seleccionado= new JugadorGrupo();
		JugadorGrupo JugadorGrupo_actualizado= new JugadorGrupo();
		
		JugadorGrupo_seleccionado= jugadorGrupoServiceImpl.JugadorGrupoXID(id);
		
		JugadorGrupo_seleccionado.setJugador(jugadorGrupo.getJugador());
		JugadorGrupo_seleccionado.setGrupo(jugadorGrupo.getGrupo());
		JugadorGrupo_seleccionado.setFecha(jugadorGrupo.getFecha());
		
		JugadorGrupo_actualizado = jugadorGrupoServiceImpl.actualizarJugadorGrupo(JugadorGrupo_seleccionado);
		
		System.out.println("El JugadorGrupo actualizado es: "+ JugadorGrupo_actualizado);
		
		return JugadorGrupo_actualizado;
	}
	
	@DeleteMapping("/jugadorGrupo/{id}")
	public void eleiminarJugadorGrupo(@PathVariable(name="id")int id) {
		jugadorGrupoServiceImpl.eliminarJugadorGrupo(id);
	}

}
