package com.javaspring.DsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.DsList.dto.GameListsDTO;
import com.javaspring.DsList.entities.GameList;
import com.javaspring.DsList.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional (readOnly = true)
    public List<GameListsDTO> getAll(){
        List<GameList> gameList = repository.findAll();
        return gameList.stream().map(x -> new GameListsDTO(x)).toList();

    } 


}
