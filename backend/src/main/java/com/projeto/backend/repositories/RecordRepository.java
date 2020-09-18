package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.backend.entities.Genre;

public interface RecordRepository extends JpaRepository<Genre, Long>{
	

}
