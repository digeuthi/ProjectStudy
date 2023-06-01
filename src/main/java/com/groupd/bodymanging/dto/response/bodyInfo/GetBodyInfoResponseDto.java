package com.groupd.bodymanging.dto.response.bodyInfo;

import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.BodyInfoEntity;
import com.groupd.bodymanging.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBodyInfoResponseDto extends ResponseDto{
    
    private Integer userCode;
    private List<BodyInfoList> bodyInfoList;

    public GetBodyInfoResponseDto(List<BodyInfoEntity> bodyInfoEntities, UserEntity userEntity){
        super("SU", "Sucess");

    }
}

@Data
@NoArgsConstructor
class BodyInfoList{
    private String recordDate;
    private double height;
    private double weight;
    private double muscleMass;
    private double fatRate;
    private double bmiIndex;
    private String bmiResult;

    public BodyInfoList(BodyInfoEntity bodyInfoEntity){
        
    }
}
