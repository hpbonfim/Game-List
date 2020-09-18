package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	

}
