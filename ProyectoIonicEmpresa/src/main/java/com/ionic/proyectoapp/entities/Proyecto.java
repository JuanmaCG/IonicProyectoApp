package com.ionic.proyectoapp.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Proyectos")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_proyecto")
	private Long id;
	
	@Column(name="nombre")
	private String name;
	
	@ManyToMany(mappedBy = "proyectos")
	private List<Tecnologia> tecnologia;
	
	@OneToMany(mappedBy = "proyecto")
	private Set<Empleado> empleados;

	@OneToMany(mappedBy = "proyecto")
	private Set<Valoracion> valoraciones;
	
	public Proyecto() {}

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

	public List<Tecnologia> getTecnologias() {
		return tecnologia;
	}

	public void setTecnologias(List<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleado) {
		this.empleados = empleado;
	}

	public List<Tecnologia> getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(List<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public Set<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	
	
	
}
