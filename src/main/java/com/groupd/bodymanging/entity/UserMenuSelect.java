package com.groupd.bodymanging.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupd.bodymanging.entity.primaryKey.SelectPK;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "UserMenuSelect")
@Entity(name = "UserMenuSelect")
@IdClass(SelectPK.class)
public class UserMenuSelect {
    @Id
    private String menuCode;
    @Id
    private Integer userCode;

    public UserMenuSelect(Integer userCode, String menuCode){
        //여기서는 entity에서 가져오는게 아니라서 따로 생성자를 만들어줘야하는건가?
        //menuDetailEntity에서는 정보는 엔티티에서 가져오는거니까 생성자를
        //AllArgsConstructor로 만드는걸로 해서 안만들어봤는데..이건 그냥
        //Integer String 으로 가져오는거니까 생성자를 만든건가...
        this.menuCode = menuCode;
        this.userCode = userCode;
    }
}
