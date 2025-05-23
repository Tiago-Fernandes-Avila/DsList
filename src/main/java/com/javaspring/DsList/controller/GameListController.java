package com.javaspring.DsList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.DsList.dto.GameListsDTO;
import com.javaspring.DsList.dto.GameMinDTO;
import com.javaspring.DsList.services.GameListService;
import com.javaspring.DsList.services.GameServices;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameListsDTO> findAll(){
        return gameListService.getAll();
    }
        @GetMapping("/{listId}/games")
    public List<GameMinDTO> getGamesByList(@PathVariable Long listId ){
       return gameServices.findByList(listId);
    }
}
