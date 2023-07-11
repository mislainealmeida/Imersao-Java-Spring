package com.devsuperior.dslist.services;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //registra como um componente do sistema
public class GameService {
    @Autowired
    private GameRespository gameRespository;// injetando Repository no Service.

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRespository.findAll();
        List<GameMinDTO> dto =  result.stream()
                .map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
