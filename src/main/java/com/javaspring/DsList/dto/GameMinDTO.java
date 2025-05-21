package com.javaspring.DsList.dto;

import com.javaspring.DsList.entities.Game;

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
    
     public GameMinDTO(){

     }

}
