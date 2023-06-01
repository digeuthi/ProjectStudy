package com.groupd.bodymanging.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "MenuDetail")
@Table(name = "MenuDetail")
public class MenuDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoInclement 적용
    private int menuIndex;
    private String menuCode;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;
    private String time;

    //AllArgsConstructor 사용해서 모든 매개변수 받는 생성자 만들었으니까
    //원래 있던 모든 매개변수 받는 생성자는 만들지 않아봄.
}
