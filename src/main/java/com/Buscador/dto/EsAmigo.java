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
@Table(name="Es_amigo")
public class EsAmigo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name="id_a")
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "id_user")
    private Jugador user;
 
    @ManyToOne
    @JoinColumn(name = "id_amigo")
    private Jugador amigo;
	
    @Temporal(TemporalType.TIMESTAMP)
	private Date aceptado;

	public EsAmigo() {
		super();
	}

	public EsAmigo(long id, Jugador user, Jugador amigo, Date aceptado) {
		super();
		this.id = id;
		this.user = user;
		this.amigo = amigo;
		this.aceptado = aceptado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Jugador getUser() {
		return user;
	}

	public void setUser(Jugador user) {
		this.user = user;
	}

	public Jugador getAmigo() {
		return amigo;
	}

	public void setAmigo(Jugador amigo) {
		this.amigo = amigo;
	}

	public Date getFecha() {
		return aceptado;
	}

	public void setFecha(Date aceptado) {
		this.aceptado = aceptado;
	}

	@Override
	public String toString() {
		return "EsAmigo [id=" + id + ", user=" + user + ", amigo=" + amigo + ", aceptado=" + aceptado + "]";
	}
	
	
}
