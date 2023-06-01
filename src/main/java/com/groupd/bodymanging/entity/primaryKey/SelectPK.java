package com.groupd.bodymanging.entity.primaryKey;

import javax.persistence.Column;

import com.groupd.bodymanging.entity.UserMenuSelect;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SelectPK {
    @Column(name = "user_code")
    private Integer userCode;
    @Column(name = "menu_code")
    private String menuCode;

    public SelectPK(UserMenuSelect userMenuSelect){
        this.userCode = userMenuSelect.getUserCode();
        this.menuCode = userMenuSelect.getMenuCode();
    }
    //음 아마도 본인 엔티티에서 본인 매개변수를 모두 받는 경우에는
    //all~ 을 통해서 생성자가 자동으로 만들어지는것같은데
    //다른 엔티티에서 가져와야하거나 다른 값을 넣어야할때는 따로
    //생성자를 만들어서 구현하는것 같은데...
}
