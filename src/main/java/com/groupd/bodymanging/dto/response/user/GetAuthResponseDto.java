package com.groupd.bodymanging.dto.response.user;

import com.groupd.bodymanging.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAuthResponseDto extends ResponseDto{
    
    private Integer userCode;
    private String token;
    private int expirationDate;

    //생성자
    public GetAuthResponseDto(Integer userCode){ //회원가입
        super("SU","Sucess");
        this.userCode = userCode;
    }

    //생성자
    public GetAuthResponseDto(String token, Integer userCode){//로그인
        super("SU", "Sucess");
        this.userCode = userCode;
        this.token = token; //로그인 시 토큰 생성되게 설정
        this.expirationDate = 3600; //만료기간 설정
    }

}
