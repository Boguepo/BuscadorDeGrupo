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

import com.Buscador.dto.Grupo;
import com.Buscador.dto.Juego;
import com.Buscador.service.GrupoServiceImpl;

@RestController
@RequestMapping("/lfg")
public class GrupoController {

	@Autowired
	GrupoServiceImpl grupoService;
	
	@GetMapping("/grupos")
	public List<Grupo> listarGrupos(){
		return grupoService.listarGrupos();
	}
	
	@GetMapping("/gruposJuego")
	public List<Grupo> listarXjuego(@RequestBody Juego juego){
		return grupoService.grupoXjuego(juego);
	}
	
	@PostMapping("/grupo")
	public Grupo guardarGrupo(@RequestBody Grupo grupo) {
		return grupoService.guardarGrupo(grupo);
	}
	
	@GetMapping("/grupo/{id}")
	public Grupo grupoXID(@PathVariable(name = "id") Long id) {
		return grupoService.grupoXID(id);
	}
	
	@PutMapping("/grupo/{id}")
	public Grupo actualizarGrupo(@PathVariable(name = "id") Long id, @RequestBody Grupo grupo) {
		
		Grupo g_s = new Grupo();
		Grupo g_a = new Grupo();
		
		g_s = grupoService.grupoXID(id);
		
		g_s.setJuego(grupo.getJuego());
		g_s.setNombre(grupo.getNombre());
		g_s.setJugador(grupo.getJugador());
		
		g_a = grupoService.actualizarGrupo(g_s);
		
		return g_a;
	}
	
	@DeleteMapping("/grupo/{id}")
	public void borrarGrupo(@PathVariable(name = "id") Long id) {
		grupoService.borrarGrupo(id);
	}
}
