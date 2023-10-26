package com.api.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.models.UserModel;

//repository es clase que epermite hacer consultas/query a una BBDD 

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{
	
	
}
