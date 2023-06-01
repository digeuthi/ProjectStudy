package com.groupd.bodymanging.dto.response.menu;

import com.groupd.bodymanging.dto.response.ResponseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchMenuResponseDto extends ResponseDto {
    
    private int userCode;
    private String menuCode;

    public PatchMenuResponseDto(int userCode, String menuCode){
        //왜 생성자의 매개변수가 어떨때는 엔티티이고 아니면 그냥 값을 집어넣는걸까?
        super("SU", "Sucess");
        this.userCode = userCode;
        this.menuCode = menuCode;
    }

}
