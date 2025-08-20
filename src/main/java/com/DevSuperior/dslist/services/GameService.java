package com.DevSuperior.dslist.services;

import com.DevSuperior.dslist.dto.GameDTO;
import com.DevSuperior.dslist.dto.GameMinDTO;
import com.DevSuperior.dslist.entities.Game;
import com.DevSuperior.dslist.projection.GameMinProjection;
import com.DevSuperior.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//service é responsável pela regra do negócio ela gerencia toda a aplicação


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() { //depois deve mudar para GameMinDTO onde está Game somente nessa linha
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> gameMinDTOList = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTOList;
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }


}
