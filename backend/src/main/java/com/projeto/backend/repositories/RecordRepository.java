package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.backend.entities.Genre;

@Repository
public interface RecordRepository extends JpaRepository<Genre, Long>{
	

}
