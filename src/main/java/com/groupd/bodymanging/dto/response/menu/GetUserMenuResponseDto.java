package com.groupd.bodymanging.dto.response.menu;

import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.MenuDetailEntity;
import com.groupd.bodymanging.entity.UserMenuSelect;

public class GetUserMenuResponseDto extends ResponseDto{
    //회원이 고른 식단 메뉴에 대한 정보를 가져오는 responseDto
    //userMenuSelect(PK로 지정된 두 레코드의 Entity)에서 어떤 회원이
    //어떤 메뉴를 골랐는지를 가져와야한다.
    private int userCode;
    private String menuCode;
    private List<SelectMenuDetail> menuDetailList;

    public GetUserMenuResponseDto(UserMenuSelect userMenuSelect, 
            List<MenuDetailEntity> menuDetailEntities){
        super("SU", "Sucess");
        this.userCode = userMenuSelect.getUserCode();
        this.menuCode = userMenuSelect.getMenuCode();
        //userMenuSelect(Entity)에서 값을 가져온다.
        SelectMenuDetail menuDetail = new SelectMenuDetail();

        this.menuDetailList = menuDetail
    }
}

class SelectMenuDetail {

    private String time;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;

    public SelectMenuDetail(MenuDetailEntity menuDetailEntity){

        this.time = menuDetailEntity.getTime();
        this.monday = menuDetailEntity.getMonday();
        this.tuesday = menuDetailEntity.getTuesday();
        this.wednesday = menuDetailEntity.getWednesday();
        this.thursday = menuDetailEntity.getThursday();
        this.friday = menuDetailEntity.getFriday();
        this.saturday = menuDetailEntity.getSaturday();
        this.sunday = menuDetailEntity.getSunday();
    }

    List<SelectMenuDetail> selectMenuDetail(List<Menu)
}
