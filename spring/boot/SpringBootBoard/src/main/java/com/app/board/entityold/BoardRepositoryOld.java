package com.app.board.entityold;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepositoryOld extends JpaRepository<BoardOld, Integer> {

    List<BoardOld> findAll();







}
