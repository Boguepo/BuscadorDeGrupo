package com.Buscador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Buscador.dto.Jugador;
import com.Buscador.service.JugadorServiceImpl;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/lfg")

public class JugadorController {

	@Autowired
	JugadorServiceImpl jugadorService;
	
	@GetMapping("/jugadores")
	public List<Jugador> listarJugadores(){
		return jugadorService.listarJugadores();
	}
	
	@PostMapping("/jugador")
	public Jugador guardarJugador(@RequestBody Jugador jugador) {
		return jugadorService.guardarJugador(jugador);
	}
	
	@GetMapping("/jugador/{id}")
	public Jugador jugadorXID(@PathVariable(name = "id") Long id) {
		return jugadorService.jugadorXID(id);
	}
	
	@PutMapping("/jugador/{id}")
	public Jugador actualizarJugador(@PathVariable(name ="id") Long id, @RequestBody Jugador jugador) {
		
		Jugador jug_s = new Jugador();
		Jugador jug_a = new Jugador();
		
		jug_s = jugadorService.jugadorXID(id);
		
		jug_s.setUsername(jugador.getUsername());
		jug_s.setPass(jugador.getPass());
		jug_s.setEmail(jugador.getEmail());
		jug_s.setSteamId(jugador.getSteamId());
		
		jug_a = jugadorService.actualizarJugador(jug_s);
		
		return jug_a;
	}
	
	@DeleteMapping("/jugador/{id}")
	public void borrarJugador(@PathVariable(name = "id") Long id) {
		jugadorService.borrarJugador(id);
		
	}
}
