package com.javaspring.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.DsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
