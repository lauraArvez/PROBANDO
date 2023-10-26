package controllers;

import com.example.demojar.models.UsuarioModel;
import com.example.demojar.services.UsuarioService;

import java.util.ArrayList;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;



public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	

	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return usuarioService.obtenerUsuarios();
	}
	
/*
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
		return this.usuarioService.guardarUsuario(usuario);
	}
	

	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Integer id) {
	    return this.usuarioService.obtenerPorId(id);
	}
	

	public ArrayList<UsuarioModel> obtenerUsuarioPorJuegosEnPropiedad(@RequestParam("enPropiedad") Integer juegosEnPropiedad){
	    return this.usuarioService.obtenerPorJuegosEnPropiedad(enPropiedad);
	}
	

	public String eliminarPorId(@PathVariable("id") Integer id){
		boolean ok = this.usuarioService.eliminarUsuario(id);
		if (ok){
		    return "Se eliminó el usuario con id " + id;
		}else{
			return "No pudo eliminar el usuario con id" + id;
	    }
	}*/
}