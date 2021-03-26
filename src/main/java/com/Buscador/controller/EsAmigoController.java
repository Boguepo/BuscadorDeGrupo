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

import com.Buscador.dto.EsAmigo;
import com.Buscador.dto.Jugador;
import com.Buscador.service.EsAmigoServiceImpl;


@RestController
@RequestMapping("/lfg")
public class EsAmigoController {
	@Autowired
	private EsAmigoServiceImpl esAmigoServiceImpl;
	
	@GetMapping("/esAmigos")
	public List<EsAmigo> listarEsAmigos(){
		return esAmigoServiceImpl.listarEsAmigos();
	}
	
	//Endpoint para listar las solicitudes de amistad que has mandado
	@GetMapping("/amigoXjugador")
	public List<EsAmigo> listarXUser(@RequestBody Jugador jugador){
		return esAmigoServiceImpl.listarXJugador(jugador);
	}
	//nos devuelve las solicitudes hechas a 1 user en concreto
	@GetMapping("/jugadorXamigo")
	public List<EsAmigo> solicitudAmigo(@RequestBody Jugador jugador){
		return esAmigoServiceImpl.jugadorXamigo(jugador);
	}
	@PostMapping("/esAmigo")
	public EsAmigo salvarEsAmigo(@RequestBody EsAmigo esAmigo) {
		
		return esAmigoServiceImpl.guardarEsAmigo(esAmigo);
	}
	
	
	@GetMapping("/esAmigo/{id}")
	public EsAmigo esAmigoXID(@PathVariable(name="id") int id) {
		
		return esAmigoServiceImpl.EsAmigoXID(id);
	}
	
	@PutMapping("/esAmigo/{id}")
	public EsAmigo actualizarEsAmigo(@PathVariable(name="id")int id,@RequestBody EsAmigo esAmigo) {
		
		EsAmigo EsAmigo_seleccionado= new EsAmigo();
		EsAmigo EsAmigo_actualizado= new EsAmigo();
		
		EsAmigo_seleccionado= esAmigoServiceImpl.EsAmigoXID(id);
		
		EsAmigo_seleccionado.setUser(esAmigo.getUser());
		EsAmigo_seleccionado.setAmigo(esAmigo.getAmigo());
		EsAmigo_seleccionado.setFecha(esAmigo.getFecha());
		
		EsAmigo_actualizado = esAmigoServiceImpl.actualizarEsAmigo(EsAmigo_seleccionado);
	
		
		return EsAmigo_actualizado;
	}
	
	@DeleteMapping("/esAmigo/{id}")
	public void eleiminarEsAmigo(@PathVariable(name="id")int id) {
		esAmigoServiceImpl.eliminarEsAmigo(id);
	}
}
