package com.groupd.bodymanging.dto.response.menu;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.resultSet.MenuListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetMenuDetailListResponseDto extends ResponseDto{
    private List<MenuDetail> menuDetailList;
    //List<MenuDetail> 타입의 menuDetailList 비공개 인스턴스 변수 선언.
    //이 변수는 MenuDetail객체의 리스트를 저장한다.

    public GetMenuDetailListResponseDto(List<MenuListResultSet> resultSet){
        super("SU", "Sucess");
        //생성자, List<MenuResultSet>타입의 매개변수를 resultSet이름으로 받는다

        List<MenuDetail> menuDetailList = new ArrayList<>();
        //메뉴 디테일 리스트를 배열로 바꿔서 하나하나 넣어주려고 그러나?
        //List<MenuDetail>타입의 지역 변수 menuDetailList 선언.
        //새로운 ArrayList<MenuDetail>로 초기화한다.
        for(MenuListResultSet result : resultSet){
            //resultSet리스트에 있는 각각의 MenuResultSet객체를 가져와서
            // result라는 변수에 할당하는 반복문. resultSet의 리스트에서 가져와
            // result에 하나하나 담는다.
            MenuDetail menuDetail = new MenuDetail(result);
            //MenuListResultSet 객체를 기반으로 새로운 MenuDetail객체 생성
            //MenuDetail에 result를 전달해서 새로운 객체를 만들고 변수에 할당.
            menuDetailList.add(menuDetail);
            //앞서 생성한 menuDetail객체를 menuDetailList에 추가한다.
            //반복문이 실행될때마다 생성된 객체가 리스트에 저장된다.
        }
        this.menuDetailList = menuDetailList;
        //지역 변수인 menuDetailList를 인스턴스 변수인 menuDetailList에 할당
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class MenuDetail{
        private String menuCode;
        private String time;
        private String monday;
        private String tuesday;
        private String wednesday;
        private String thursday;
        private String friday;
        private String saturday;
        private String sunday;

        public MenuDetail(MenuListResultSet resultSet){
            this.menuCode = resultSet.getMenuCode();
            this.time = resultSet.getTime();
            this.monday = resultSet.getMonday();
            this.tuesday = resultSet.getTuesday();
            this.wednesday = resultSet.getWednesday();
            this.thursday = resultSet.getThursday();
            this.friday = resultSet.getFriday();
            this.saturday = resultSet.getSaturday();
            this.sunday = resultSet.getSunday();
        }

    }
}
