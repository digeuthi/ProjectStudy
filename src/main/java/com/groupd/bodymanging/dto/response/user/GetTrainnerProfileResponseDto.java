package com.groupd.bodymanging.dto.response.user;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.UserEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetTrainnerProfileResponseDto extends ResponseDto{
    private List<Trainner> trainnerList;

    public GetTrainnerProfileResponseDto(List<UserEntity> userEntities){
        super("SU", "Sucess");

        List<Trainner> trainnerList = new ArrayList<>();

        for(UserEntity userEntity : userEntities){
            Trainner trainner = new Trainner(userEntity);
            trainnerList.add(trainner);
        }
        this.trainnerList = trainnerList;
    }
}

@Data
@NoArgsConstructor
class Trainner{
    private String trainnerEmail;
    private String trainnerNickname;
    private String trainnerPhoneNumber;
    private String trainnerGender;
    private Integer trainnerAge;

    public Trainner(UserEntity userEntity){
        this.trainnerEmail = userEntity.getUserEmail();
        this.trainnerNickname = userEntity.getUserNickname();
        this.trainnerPhoneNumber = userEntity.getUserPhoneNumber();
        this.trainnerGender = userEntity.getUserGender();
        this.trainnerAge = userEntity.getUserAge();
    }
}
