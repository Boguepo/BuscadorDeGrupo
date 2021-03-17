package com.Buscador.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "msgPrivado")
public class MsgPrivado {

	@Id
	@Column(name="idMpr")
	private Long idMpr;
	
	@Column(name="mensaje")
	private String mensaje;
	
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	
	@OneToMany
	@JoinColumn(name="idUser")
	private Jugador jugador;
	
	@OneToMany
	@JoinColumn(name="idGrupo")
	private Grupo grupo;
	
	
	//Constructores
	public MsgPrivado() {}
	
	public MsgPrivado(Long idMpr,String mensaje,Date fecha,Jugador jugador,Grupo grupo) {
		this.idMpr=idMpr;
		this.mensaje=mensaje;
		this.fecha=fecha;
		this.jugador=jugador;
		this.grupo=grupo;
	}

	/**
	 * @return the idMpr
	 */
	public Long getIdMpr() {
		return idMpr;
	}

	/**
	 * @param idMpr the idMpr to set
	 */
	public void setIdMpr(Long idMpr) {
		this.idMpr = idMpr;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}

	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	/**
	 * @return the grupo
	 */
	public Grupo getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	
}
