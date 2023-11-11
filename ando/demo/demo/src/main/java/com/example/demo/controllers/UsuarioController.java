package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UsuarioModel;

/**
 * Aqui se recibe la petición web, que llama inmediatamente después al service
 */

@RestController
public class UsuarioController {

    private static final String template ="hello, %s";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("usuario")
    public UsuarioModel pixelVenture(@RequestParam(value ="name", defaultValue = "world")String name){
        return new UsuarioModel(counter.incrementAndGet(), String.format(template,name));

    }
}
