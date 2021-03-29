package com.Buscador.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "msgPublico")
public class MsgPublico {

	@Id
	@Column(name="idMpu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMpu;
	
	@Column(name="mensaje")
	private String mensaje;
	
	@Column(name="fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="idJugador")

	private Jugador jugador;
	
	@ManyToOne
	@JoinColumn(name="idGrupo")
	private Grupo grupo;
	
	//Constructores
	public MsgPublico() {}
	
	public MsgPublico(Long idMpu,String mensaje,Date fecha,Jugador jugador,Grupo grupo) {
		this.idMpu=idMpu;
		this.mensaje=mensaje;
		this.fecha=fecha;
		this.jugador=jugador;
		this.grupo=grupo;
	}

	/**
	 * @return the idMpu
	 */
	public Long getIdMpu() {
		return idMpu;
	}

	/**
	 * @param idMpu the idMpu to set
	 */
	public void setIdMpu(Long idMpu) {
		this.idMpu = idMpu;
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
