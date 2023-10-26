package com.example.demojar.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojar.models.UsuarioModel;
import com.example.demojar.repositories.UsuarioRepository;


@Service
// tipo de dato y tipo de identificador
public class UsuarioService{
	@Autowired
	UsuarioRepository usuarioRepositorio;
	
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		// cast para retornar en formato json
	  return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	  
	}
	
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepositorio.save(usuario);
    }

    // el método puede fallar si no existe el Id por eso es de tipo Optional
    public Optional<UsuarioModel> obtenerPorId(Integer id){
        return usuarioRepositorio.findById(id);
    }


    public ArrayList<UsuarioModel>  obtenerjuegosEnPropiedad(Integer enPropiedad) {
        return usuarioRepositorio.findByPrioridad(enPropiedad);
    }
    

    public boolean eliminarUsuario(Integer id) {
        try{
            usuarioRepositorio.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}