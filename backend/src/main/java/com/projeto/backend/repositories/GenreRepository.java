package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.backend.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	

}
