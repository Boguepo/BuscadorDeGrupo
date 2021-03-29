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

import com.Buscador.dto.Juego;
import com.Buscador.service.JuegoServiceImpl;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/lfg")
public class JuegoController {

	@Autowired
	JuegoServiceImpl juegoService;
	
	@GetMapping("/juegos")
	public List<Juego> listarJuegos(){
		return juegoService.listarJuegos();
	}
	
	@PostMapping("/juego")
	public Juego guardarJuego(@RequestBody Juego juego) {
		return juegoService.guardarJuego(juego);
	}
	
	@GetMapping("/juego/{id}")
	public Juego juegoXID(@PathVariable(name = "id") Long id) {
		return juegoService.juegoXID(id);
	}
	
	@PutMapping("/juego/{id}")
	public Juego actualizarJuego(@PathVariable(name = "id") Long id, @RequestBody Juego juego) {
		
		Juego ju_s = new Juego();
		Juego ju_a = new Juego();
		
		ju_s = juegoService.juegoXID(id);
		
		ju_s.setTitulo(juego.getTitulo());
		ju_s.setThumbnail(juego.getThumbnail());
		ju_s.setUrl(juego.getUrl());
		
		ju_a = juegoService.actualizarJuego(ju_s);
		
		return ju_a;
	}
	
	@DeleteMapping("/juego/{id}")
	public void borrarJuego(@PathVariable(name = "id") Long id) {
		juegoService.borrarJuego(id);
	}
}
