package com.ionic.proyectoapp.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_empleado")
	private Long id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellidos")
	private String last_name;
	
	@Column(unique = true)
	private String dni;
	
	private String puesto;
	
	@Column(name = "sueldo")
	private int salary;
	
	@ManyToOne
	@JoinColumn(name = "id_proyecto", nullable = false)
	private Proyecto proyecto;
	
	@OneToMany(mappedBy = "empleado")
	private Set<Valoracion> valoraciones;
	
	public Empleado () {}

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

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Set<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	
	
}
