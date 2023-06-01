package com.groupd.bodymanging.dto.response.menu;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.MenuDetailEntity;
import com.groupd.bodymanging.entity.UserMenuSelect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
        //생성자, UserMenuSelect, MenuDetailEntity Entity를 매개변수로 가져옴.
        this.userCode = userMenuSelect.getUserCode();
        this.menuCode = userMenuSelect.getMenuCode();
        //userMenuSelect(Entity)에서 값을 가져온다.
        SelectMenuDetail menuDetail = new SelectMenuDetail();
        //밑의 SelectMenuDetail에 빈생성자 만드는 어노테이션 안 만들어놔서
        //가져올수가 없어서 오류가 떴었음.

        this.menuDetailList = menuDetail.selectMenuDetail(menuDetailEntities);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public List<SelectMenuDetail> selectMenuDetail(List<MenuDetailEntity> menuDetailEntities){

        List<SelectMenuDetail> menuDetailList = new ArrayList<>();
        //List<SelectMenuDetail>타입의 지역 변수 menuDetailList 선언.
        //새로운 ArrayList<MenuDetail>로 초기화한다.
    for (MenuDetailEntity menuDetailEntity : menuDetailEntities){
        //MenuDetailEntity리스트에 있는 각각의 menuDetailEntities객체를 가져와서
        // menuDetailEntity라는 변수에 할당하는 반복문. menuDetailEntities의 리스트에서 가져와
        // menuDetailEntit에 하나하나 담는다.
        SelectMenuDetail menuDetail = new SelectMenuDetail(menuDetailEntity);
        //SelectMenuDetail 객체를 기반으로 새로운 MenuDetail객체 생성
        //MenuDetail에 menuDetailEntity를 전달해서 새로운 객체를 만들고 변수에 할당.
        menuDetailList.add(menuDetail);
        //앞서 생성한 menuDetail객체를 menuDetailList에 추가한다.
        //반복문이 실행될때마다 생성된 객체가 리스트에 저장된다.
    }
    return menuDetailList;
    }
}
