package com.DevSuperior.dslist.services;

import com.DevSuperior.dslist.dto.GameDTO;
import com.DevSuperior.dslist.dto.GameListDTO;
import com.DevSuperior.dslist.dto.GameMinDTO;
import com.DevSuperior.dslist.entities.Game;
import com.DevSuperior.dslist.entities.GameList;
import com.DevSuperior.dslist.repositories.GameListRepository;
import com.DevSuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//service é responsável pela regra do negócio ela gerencia toda a aplicação


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }



}
