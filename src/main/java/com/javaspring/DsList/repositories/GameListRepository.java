package com.javaspring.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.DsList.entities.GameList;

public interface GameListRepository extends JpaRepository < GameList, Long >{


}
