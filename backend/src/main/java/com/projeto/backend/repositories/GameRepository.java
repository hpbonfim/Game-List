package com.projeto.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.backend.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	

}
