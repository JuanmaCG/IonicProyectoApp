package com.ionic.proyectoapp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tecnologias")
public class Tecnologia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_tecnologia")
	private Long id;
	
	@Column(name = "nombre")
	private String name;
	
	@ManyToMany()
	@JoinTable(
			name = "tecnologias_proyectos",
			joinColumns = @JoinColumn(name = "fk_tecnologia", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "fk_proyecto", nullable = false)
	)
	private List<Proyecto> proyectos;

	
	public Tecnologia() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Proyecto> getProyectos() {
		return proyectos;
	}


	public void setProyectos(List<Proyecto> proyecto) {
		this.proyectos = proyecto;
	}
	
	
}
