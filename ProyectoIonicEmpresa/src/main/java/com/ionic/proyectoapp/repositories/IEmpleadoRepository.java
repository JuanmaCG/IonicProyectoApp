package com.ionic.proyectoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.proyectoapp.entities.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>{

}
