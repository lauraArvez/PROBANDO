package com.api.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UserModel {

	private long id;
    private String username;
    private String email;
    private boolean admin;
    private int juegosEnPropiedad;
    
        
    //constructores
	public UserModel() {
		super();
	}
	
	public UserModel(long id, String username, String email, boolean admin, int juegosEnPropiedad) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.admin = admin;
		this.juegosEnPropiedad = juegosEnPropiedad;
	}
	
	// Getters y Setters
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	public int getJuegosEnPropiedad() {
		return juegosEnPropiedad;
	}
	public void setJuegosEnPropiedad(int juegosEnPropiedad) {
		this.juegosEnPropiedad = juegosEnPropiedad;
	}
    
    
}
