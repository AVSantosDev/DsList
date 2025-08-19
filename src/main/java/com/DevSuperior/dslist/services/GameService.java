package com.DevSuperior.dslist.services;

import com.DevSuperior.dslist.dto.GameMinDTO;
import com.DevSuperior.dslist.entities.Game;
import com.DevSuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll() { //depois deve mudar para GameMinDTO onde está Game somente na linha 19
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> gameMinDTOList = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTOList;
    }


}
