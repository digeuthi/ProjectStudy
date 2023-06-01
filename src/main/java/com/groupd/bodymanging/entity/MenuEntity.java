package com.groupd.bodymanging.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Menu") // entity에 이름 지정하는건가
@Table(name = "Menu") //DB랑 연결할때 이름 지정하는것.
public class MenuEntity {
    @Id
    private String menuCode;
}
