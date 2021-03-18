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
	
	
	@PostMapping("/esAmigo")
	public EsAmigo salvarEsAmigo(@RequestBody EsAmigo esAmigo) {
		
		return esAmigoServiceImpl.guardarEsAmigo(esAmigo);
	}
	
	
	@GetMapping("/esAmigo/{id}")
	public EsAmigo esAmigoXID(@PathVariable(name="id") int id) {
		
		EsAmigo EsAmigo_xid= new EsAmigo();
		
		EsAmigo_xid=esAmigoServiceImpl.EsAmigoXID(id);
		
		System.out.println("EsAmigo XID: "+EsAmigo_xid);
		
		return EsAmigo_xid;
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
		
		System.out.println("El EsAmigo actualizado es: "+ EsAmigo_actualizado);
		
		return EsAmigo_actualizado;
	}
	
	@DeleteMapping("/esAmigo/{id}")
	public void eleiminarEsAmigo(@PathVariable(name="id")int id) {
		esAmigoServiceImpl.eliminarEsAmigo(id);
	}
}
