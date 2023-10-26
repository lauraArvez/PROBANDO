package com.example.demojar.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demojar.models.*;



@Repository
// tipo de dato y tipo de identificador
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> {
	public abstract ArrayList<UsuarioModel> findByPrioridad(Integer juegosEnPropiedad);
}