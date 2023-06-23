package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupd.bodymanging.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, String>{
    //메뉴코드가 존재하는지 아닌지에 대한 반환
    public boolean existByMenuCode(String menuCode);
    //메뉴코드에 따른 메뉴값가져오기
    public MenuEntity findByMenuCode(String menuCode);
    //단일 객체인 MenuEntity를 반환하는 메서드. 
    //이는 메뉴 코드에 해당하는 단 하나의 메뉴만을 조회하고 반환한다.
}
