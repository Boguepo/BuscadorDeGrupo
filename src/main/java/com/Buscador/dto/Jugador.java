package com.Buscador.dto;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="jugador")
public class Jugador {
	//mapeo de la tabla de Jugadores
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJugador")
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "pass")
	private String pass;
	@Column(name = "email")
	private String email;
	@Column(name = "steamId")
	private String steamId;
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<Grupo> grupo;
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<JugadorGrupo> jugadorGrupo;
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<EsAmigo> peticion;// referente a id_user de la tabla es_amigo
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<EsAmigo> peticionDestino;//referente a id_amigo de la tabla es_amigo
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<MsgPrivado> mensajePrivado;//referentea a id_user de la tabla msgPrivado
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<MsgPrivado> mensajePrivadoDestino;//referente a id_userDestino de la tabla msgPrivado
	
	@OneToMany
	@JoinColumn(name = "idJugador")
	private List<MsgPublico> mensajePublico;
	
	public Jugador() {
		
	}

	public Jugador(Long id, String username, String pass, String email, String steamId, List<Grupo> grupo,
			List<JugadorGrupo> jugadorGrupo, List<EsAmigo> peticion, List<EsAmigo> peticionDestino,
			List<MsgPrivado> mensajePrivado, List<MsgPrivado> mensajePrivadoDestino, List<MsgPublico> mensajePublico) {
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.steamId = steamId;
		this.grupo = grupo;
		this.jugadorGrupo = jugadorGrupo;
		this.peticion = peticion;
		this.peticionDestino = peticionDestino;
		this.mensajePrivado = mensajePrivado;
		this.mensajePrivadoDestino = mensajePrivadoDestino;
		this.mensajePublico = mensajePublico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSteamId() {
		return steamId;
	}

	public void setSteamId(String steamId) {
		this.steamId = steamId;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Grupo")
	public List<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "JugadorGrupo")
	public List<JugadorGrupo> getJugadorGrupo() {
		return jugadorGrupo;
	}

	public void setJugadorGrupo(List<JugadorGrupo> jugadorGrupo) {
		this.jugadorGrupo = jugadorGrupo;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "EsAmigo")
	public List<EsAmigo> getPeticion() {
		return peticion;
	}

	public void setPeticion(List<EsAmigo> peticion) {
		this.peticion = peticion;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "EsAmigo")
	public List<EsAmigo> getPeticionDestino() {
		return peticionDestino;
	}

	public void setPeticionDestino(List<EsAmigo> peticionDestino) {
		this.peticionDestino = peticionDestino;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "MsgPrivado")
	public List<MsgPrivado> getMensajePrivado() {
		return mensajePrivado;
	}

	public void setMensajePrivado(List<MsgPrivado> mensajePrivado) {
		this.mensajePrivado = mensajePrivado;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "MsgPrivado")
	public List<MsgPrivado> getMensajePrivadoDestino() {
		return mensajePrivadoDestino;
	}

	public void setMensajePrivadoDestino(List<MsgPrivado> mensajePrivadoDestino) {
		this.mensajePrivadoDestino = mensajePrivadoDestino;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "MsgPublico")
	public List<MsgPublico> getMensajePublico() {
		return mensajePublico;
	}

	public void setMensajePublico(List<MsgPublico> mensajePublico) {
		this.mensajePublico = mensajePublico;
	}
	
	
	
}
