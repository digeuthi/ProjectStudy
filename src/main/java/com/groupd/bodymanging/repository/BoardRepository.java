package com.groupd.bodymanging.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.BoardEntity;



@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, String>{
    public BoardEntity findByBoardNumber(int boardNumber);

}
