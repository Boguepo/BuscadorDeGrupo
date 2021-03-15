package com.Buscador.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupo {
	//mapeo de la tabla Grupos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "isGrupo")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idOwner")
	private Jugador jugador;
	
	@OneToMany
	@JoinColumn(name = "idJuego")
	private Juego juego;
	
	public Grupo() {
		
	}

	public Grupo(Long id, String nombre, Jugador jugador, Juego juego) {
		this.id = id;
		this.nombre = nombre;
		this.jugador = jugador;
		this.juego = juego;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
}
