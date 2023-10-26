package com.api.crud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

@Service
public class UserService {
	// sirve para inyectar dependencias
	@Autowired 
	IUserRepository userRepository;
	
	//Obtener usuarios
	public ArrayList<UserModel> getUsers(){
		return (ArrayList<UserModel>) userRepository.findAll();				
	}
	
	//guardar usuarios
	public UserModel saveUser(UserModel user) {
		return userRepository.save(user);				
	}
	
	// devuelve si existe o null si no existe
	public Optional <UserModel> getById(Long Id){
		return userRepository.findById(Id);				
	}
	
	
	//Put
	public UserModel updateById(UserModel request, Long id){
		UserModel user = userRepository.findById(id).get();
		user.setUsername(request.getUsername());
		user.setEmail(request.getEmail());
		user.setJuegosEnPropiedad(request.getJuegosEnPropiedad());
		user.setAdmin(request.isAdmin());
		
		return user;
		
	}
	
	//delete
	public Boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	} 
	

}
