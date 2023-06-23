package com.groupd.bodymanging.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groupd.bodymanging.entity.MenuDetailEntity;
import com.groupd.bodymanging.entity.resultSet.MenuListResultSet;

public interface MenuDetailRepository extends JpaRepository<MenuDetailEntity, Integer>{
    
    //메뉴코드 찾기
    public List<MenuDetailEntity> findByMenuCode(String menuCode);
    // 메뉴 코드에 해당하는 여러 개의 MenuDetailEntity 객체를 
    //조회할 수 있기 때문에 List를 사용하여 여러 개의 결과를 
    //담을 수 있도록 한다.

    //메뉴코드에 따른 식단 메뉴 정보 가져오기
    @Query(
        value = 
        "SELECT " +
        "* FROM user_select_menu ",
        nativeQuery = true
    )
    public List<MenuDetailEntity> getMenuDetail(String menuCode);

    //등록 해둔 식단 목록 가져오기
    @Query(value =
        "SELECT "
        +"MD.menu_code AS menuCode, "
        +"MD.time As time, "
        +"MD.monday AS monday, "
        +"MD.tuesday AS tuesday, "
        +"MD.wednesday AS wednesday, "
        +"MD.thursday AS thursday, "
        +"MD.friday AS friday, "
        +"MD.saturday AS saturday, "
        +"MD.sunday AS sunday "
        +"from menu M, menu_detail MD "
        +"where MD.menu_code = M.menu_code "
        +"order by MD.menu_index; ",
        nativeQuery = true
    )
    public List<MenuListResultSet> getMenuDetailList();
}
