package com.javaspring.DsList.dto;

import com.javaspring.DsList.entities.GameList;

public class GameListsDTO {
    private Long id;
    private String name;

    public GameListsDTO(GameList gameList){
        this.id = gameList.getId();
        this.name = gameList.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
