package com.biblioteca.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.sistema.model.Usuario;
import com.biblioteca.sistema.repositiory.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repo;

    // Cadastro de usuário
    @PostMapping
    public Usuario criar(@RequestBody Usuario u) {
        return repo.save(u);
    }

    // Login de usuário
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario u) {
        Usuario usuario = repo.findByEmailAndSenha(u.getEmail(), u.getSenha());
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(401).body("Usuário ou senha inválidos.");
        }
    }
}
