package com.api_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_project.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}