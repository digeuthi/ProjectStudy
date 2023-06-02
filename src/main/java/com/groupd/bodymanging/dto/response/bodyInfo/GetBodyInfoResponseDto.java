package com.groupd.bodymanging.dto.response.bodyInfo;

import java.util.ArrayList;
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

        this.userCode = userEntity.getUserCode();
        //BodyInfoList에 저장할 지역변수만 초기화 및 선언 
        BodyInfoList bodyInfoList = new BodyInfoList();
        this.bodyInfoList = bodyInfoList.recordList(bodyInfoEntities);
        //recordList메서드를 불러와서(생성자인가) bodyInfoLists에 저장된
        //bodyInfoEntities를 가져오는것.
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
        this.recordDate = bodyInfoEntity.getRecordDate();
        this.height = bodyInfoEntity.getHeight();
        this.weight = bodyInfoEntity.getWeight();
        this.muscleMass = bodyInfoEntity.getMuscleMass();
        this.fatRate = bodyInfoEntity.getFatRate();
        this.bmiIndex = bodyInfoEntity.getBmiIndex();
        this.bmiResult = bodyInfoEntity.getBmiResult();
    }

    public static List<BodyInfoList> recordList(List<BodyInfoEntity> bodyInfoEntities){
        //recordList 

        List<BodyInfoList> bodyInfoLists = new ArrayList<>();
        //Duplicate local variable bodyInfoList라는 중복이 뜨기 때문에
        // bodyInfoLists라고 이름 설정.

        for(BodyInfoEntity bodyInfoEntity : bodyInfoEntities){
            BodyInfoList bodyInfoList = new BodyInfoList(bodyInfoEntity);
            bodyInfoLists.add(bodyInfoList);
        }
        return bodyInfoLists;
    }
}
