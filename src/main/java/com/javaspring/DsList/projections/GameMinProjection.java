package com.javaspring.DsList.projections;

public interface GameMinProjection { 
    //quando criamos uma @query ou seja uma consulta personalizada no repositorio do spring boot jpa temos que criar interfaces pois esse metodos que criamos dentro da interface extendida pala JpaRepository precisa retornar um tipo interface
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription(); 
    Integer getPosistion();
    
    
} 
