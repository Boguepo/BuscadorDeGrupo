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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "juegos")
public class Juego {
	//mapeo de la tabla Juegos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJuego")
	private Long id;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "thumbnailUrl")//url del icono del juego 
	private String thumbnail;
	@Column(name = "url")//url del juego
	private String url;
	
	@OneToMany
	@JoinColumn(name = "idJuego")
	@Cascade(CascadeType.SAVE_UPDATE)
	private List<Grupo> grupo;
	
	
	
	public Juego() {
		
	}

	public Juego(Long id, String titulo, String thumbnail, String url, List<Grupo> grupo, List<MsgPublico> msgPublico) {
		this.id = id;
		this.titulo = titulo;
		this.thumbnail = thumbnail;
		this.url = url;
		this.grupo = grupo;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Grupo")
	public List<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}

	
	
	
}
