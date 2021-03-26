package com.Buscador.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "grupos")
public class Grupo {
	//mapeo de la tabla Grupos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGrupo")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idJugador")

	private Jugador jugador;
	
	@ManyToOne
	@JoinColumn(name = "idJuego")
	private Juego juego;
	
	@OneToMany
	@JoinColumn(name = "idGrupo")
	@Cascade(CascadeType.ALL)
	private List<MsgPublico> msgPublico;
	
	@OneToMany
	@JoinColumn(name = "idGrupo")
	@Cascade(CascadeType.ALL)
	private List<JugadorGrupo> jugadorGrupo;
	
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
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "MsgPublico")
	public List<MsgPublico> getMsgPublico() {
		return msgPublico;
	}

	public void setMsgPublico(List<MsgPublico> msgPublico) {
		this.msgPublico = msgPublico;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "JugadorGrupo")
	public List<JugadorGrupo> getJugadorGrupo() {
		return jugadorGrupo;
	}

	public void setJugadorGrupo(List<JugadorGrupo> jugadorGrupo) {
		this.jugadorGrupo = jugadorGrupo;
	}
	
	
}
