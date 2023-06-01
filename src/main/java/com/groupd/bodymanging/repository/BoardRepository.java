package com.groupd.bodymanging.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.resultSet.BoardWordListResultSet;

@Repository
public interface BoardRepository {
    

    @Query(
        value = 
        "SELECT " +
        "* FROM board_view; ",
        nativeQuery = true  
    )
    public List<BoardWordListResultSet> getList();


}
