package com.DevSuperior.dslist.repositories;


import com.DevSuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

//o repository é responsável por fazer a busca do id no banco de dados e trazer as informações


}
