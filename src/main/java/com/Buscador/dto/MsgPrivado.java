package com.Buscador.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private Jugador jugador;
	
	@ManyToOne
	@JoinColumn(name="idUserDestino")
	private Jugador jugadorDest;
	
	
	//Constructores
	public MsgPrivado() {}
	
	public MsgPrivado(Long idMpr,String mensaje,Date fecha,Jugador jugador,Jugador jugadorDest) {
		this.idMpr=idMpr;
		this.mensaje=mensaje;
		this.fecha=fecha;
		this.jugador=jugador;
		this.jugadorDest=jugadorDest;
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
	 * @return the jugadorDest
	 */
	public Jugador getJugadorDest() {
		return jugadorDest;
	}

	/**
	 * @param jugadorDest the jugadorDest to set
	 */
	public void setJugadorDest(Jugador jugadorDest) {
		this.jugadorDest = jugadorDest;
	}


	
	
}
