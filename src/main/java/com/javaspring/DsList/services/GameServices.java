package com.javaspring.DsList.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.DsList.dto.GameDTO;
import com.javaspring.DsList.dto.GameMinDTO;
import com.javaspring.DsList.entities.Game;
import com.javaspring.DsList.projections.GameMinProjection;
import com.javaspring.DsList.repositories.GameRepository;

@Service
public class GameServices {
   @Autowired
  private GameRepository repository;


   @Transactional(readOnly = true)
   public List<GameMinDTO> getAll(){
    List<Game> result = repository.findAll();
    List<GameMinDTO> listDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
      
    return listDTO;
   }

   @Transactional(readOnly = true) // para deixar o nosso banco de dados 
//em conformes com o acid
   public GameDTO findById(Long id){
      Game game = null;
      try{
       game = repository.findById(id).get();
      }
      catch(IllegalArgumentException e){
         System.out.println("Error! id args is null: " + e.getMessage());
      }
      GameDTO gameDTO = new GameDTO(game);
      return gameDTO;
   }
   @Transactional(readOnly = true)
   public List<GameMinDTO> findByList(Long listId){
     List <GameMinProjection> gameMin = repository.queryByList(listId);
     return gameMin.stream().map(x -> new GameMinDTO(x)).toList();


   }

    
    
}
