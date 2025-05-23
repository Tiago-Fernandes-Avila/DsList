package com.javaspring.DsList.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaspring.DsList.entities.Game;
import com.javaspring.DsList.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private String imgUrl;
    private String shortText;
    private Integer year;
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortText() {
        return shortText;
    }
    public Integer getYear() {
        return year;
    }
   
  
    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.imgUrl = game.getImgUrl();
        this.shortText =game.getShortDescription();
        this.year = game.getYear();
    }

    public GameMinDTO(GameMinProjection projection){
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
        this.imgUrl = projection.getImgUrl();
        this.shortText = projection.getShortDescription();
    }
    
     public GameMinDTO(){

     }

}
