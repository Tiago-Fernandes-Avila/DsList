package com.javaspring.DsList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaspring.DsList.dto.GameMinDTO;
import com.javaspring.DsList.entities.Game;
import com.javaspring.DsList.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{

    @Query (value = "Select tb_game.id, tb_game.title, tb_game.game_year, tb_game.img_url, tb_game.short_description, tb_belonging.position from tb_game inner join tb_belonging on tb_belonging.game_id = tb_game.id where tb_belonging.list_id = :idDaLista order by tb_belonging.position;", nativeQuery = true)
    public List<GameMinProjection> queryByList(@Param("idDaLista") Long id);
}   
