package com.DevSuperior.dslist.repositories;

import com.DevSuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

//o repository é responsável por fazer a busca do id no banco de dados e trazer as informações


}
