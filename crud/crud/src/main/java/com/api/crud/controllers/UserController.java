package com.api.crud.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;

// etiquetas
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//petición get
	@GetMapping
	public ArrayList<UserModel> getUsers(){
	 return this.userService.getUsers();
	}
	
	@PostMapping
	// que vamos a envuar 
	public UserModel saveUser(@RequestBody UserModel user ){
		return this.userService.saveUser(user);
	}

	@GetMapping(path ="/{Id}")
	public Optional<UserModel> getUserById(@PathVariable Long id){
		return this.userService.getById(id);
	}

	@PutMapping(path ="/{Id}")
	public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id")Long id) {
		return this.userService.updateById(request, id);
	}

	@DeleteMapping(path ="/{Id}")
	public String deleteById(@PathVariable("id") Long id) {
		boolean ok = this.userService.deleteUser(id);
		if(ok) {
			return "Usuario con id: "+ id + " eliminado" ;
		}else {
			return "Error!";
		}
	}
}
