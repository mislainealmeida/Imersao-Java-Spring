package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//fará operações básicas(consultar, deletar...) com o banco
public interface GameRespository extends JpaRepository <Game, Long>{

}
