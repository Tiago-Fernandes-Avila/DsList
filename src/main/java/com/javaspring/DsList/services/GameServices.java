package com.javaspring.DsList.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.DsList.dto.GameMinDTO;
import com.javaspring.DsList.entities.Game;
import com.javaspring.DsList.repositories.GameRepository;

@Service
public class GameServices {
   @Autowired
  private GameRepository repository;

   public List<GameMinDTO> getAll(){
    List<Game> result = repository.findAll();
    List<GameMinDTO> listDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
      
    return listDTO;
   }

    
    
}
