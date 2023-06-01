package com.groupd.bodymanging.dto.response.user;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponseDto extends ResponseDto {
    
    private String userNickname;
    private String userPhoneNumber;
    private String userAddress;
    private String userGender;
    private int userAge;

    public GetUserResponseDto(UserEntity userEntity){
        super("SU", "Sucess");
        //각각 userEntity에서 받아온 값을 저장하게 하는것 
        this.userNickname = userEntity.getUserNickname();
        this.userPhoneNumber = userEntity.getUserPhoneNumber();
        this.userAddress = userEntity.getUserAddress();
        this.userGender = userEntity.getUserGender();
        this.userAge = userEntity.getUserAge();
    }
}
