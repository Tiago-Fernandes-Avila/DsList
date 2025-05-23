package com.javaspring.DsList.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.DsList.dto.GameDTO;
import com.javaspring.DsList.dto.GameMinDTO;
import com.javaspring.DsList.entities.Game;
import com.javaspring.DsList.projections.GameMinProjection;
import com.javaspring.DsList.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameServices gameServices;

    @GetMapping()
    public List<GameMinDTO> All(){
        List<GameMinDTO> result = gameServices.getAll();
       
       return result; 
    }

    @GetMapping(value ="/{id}")
    public GameDTO findGameById(@PathVariable Long id){
        return gameServices.findById(id);
    }

    


}