package com.biblioteca.sistema.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.sistema.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
