package com.example.demojar.models;

import jakarta.persistence.*;



@Entity
@Table (name = "usuario")
public class UsuarioModel {
    
    private Integer id;
    private String username;
    private String email;
    private boolean admin;
    private Integer juegosEnPropiedad;

    
    public UsuarioModel() {
    }

    public UsuarioModel(Integer id, String username, String email, boolean admin, Integer juegos_en_propiedad) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.admin = admin;
        this.juegosEnPropiedad = juegos_en_propiedad;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public Integer getJuegosEnPropiedad() {
        return juegosEnPropiedad;
    }
    public void setJuegos_en_propiedad(Integer juegosEnPropiedad) {
        this.juegosEnPropiedad = juegosEnPropiedad;
    }

    

    
}
