package com.ionic.proyectoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.proyectoapp.entities.Proyecto;

public interface IProyectoRepository extends JpaRepository<Proyecto, Long>{

}
