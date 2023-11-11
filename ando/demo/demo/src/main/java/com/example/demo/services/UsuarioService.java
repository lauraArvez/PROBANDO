package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UsuarioRepository;

/**
 * es la clase que ejecuta la lógica de la aplicación, utiliza interface repository
 * para hacer las conexiones con la bbdd
 */
@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
}
