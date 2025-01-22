package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> { // estamos aproveitando do framework, pois já tem as operações básicas, inclusive a busca por id

}
