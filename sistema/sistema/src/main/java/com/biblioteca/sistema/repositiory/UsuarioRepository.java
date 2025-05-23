package com.biblioteca.sistema.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.sistema.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndSenha(String email, String senha);
}
