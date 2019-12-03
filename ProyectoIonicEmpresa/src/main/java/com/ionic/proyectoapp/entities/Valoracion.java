package com.ionic.proyectoapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Valoraciones")
public class Valoracion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_valoracion")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "empleado_id", nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "proyecto_id", nullable = false)
	private Proyecto proyecto;
	
	@Column(name = "valoracion")
	private int valoracion;
	
	public Valoracion() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
}
