package com.superior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
