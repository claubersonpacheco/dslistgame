package com.superior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
