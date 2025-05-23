package com.biblioteca.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.sistema.model.Categoria;
import com.biblioteca.sistema.repositiory.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {
    @Autowired
    private CategoriaRepository repo;

    @GetMapping public List<Categoria> listar() { return repo.findAll(); }
    @PostMapping public Categoria inserir(@RequestBody Categoria c) { return repo.save(c); }
    @PutMapping("/{id}") public Categoria atualizar(@PathVariable Long id, @RequestBody Categoria c) {
        c.setId(id);
        return repo.save(c);
    }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { repo.deleteById(id); }
}

