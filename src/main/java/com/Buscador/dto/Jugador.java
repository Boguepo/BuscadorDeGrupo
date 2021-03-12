package com.Buscador.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name ="jugador")
public class Jugador {
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
	
	
}
