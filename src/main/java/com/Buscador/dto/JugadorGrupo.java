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
@Table(name="jugadorGrupo")
public class JugadorGrupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name="idJg")
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "idJugador")
	
    private Jugador jugador;
 
    @ManyToOne
    @JoinColumn(name = "idGrupo")
  
    private Grupo grupo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	public JugadorGrupo() {
		super();
	}

	public JugadorGrupo(long id, Jugador jugador, Grupo grupo, Date fecha) {
		super();
		this.id = id;
		this.jugador = jugador;
		this.grupo = grupo;
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "JugadorGrupo [id=" + id + ", jugador=" + jugador + ", grupo=" + grupo + ", fecha=" + fecha + "]";
	}
	

}
