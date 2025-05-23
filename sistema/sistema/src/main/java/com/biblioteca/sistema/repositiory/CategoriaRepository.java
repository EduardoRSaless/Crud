package com.biblioteca.sistema.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.sistema.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
