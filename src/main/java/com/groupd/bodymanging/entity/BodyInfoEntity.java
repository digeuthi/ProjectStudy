package com.groupd.bodymanging.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.groupd.bodymanging.dto.request.bodyInfo.PostBodyInfoRequestDto;
import com.groupd.bodymanging.entity.primaryKey.BodyPK;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BodyInfo")
@Table(name = "BodyInfo")
@IdClass(BodyPK.class) //복합기 설정때문에 여기서 가져옴
public class BodyInfoEntity {
    @Id
    private Integer userCode;
    @Id
    private String recordDate;
    @NotNull
    private double height;
    @NotNull
    private double weight;
    @NotNull
    private double muscleMass;
    @NotNull
    private double fatRate;
    @NotNull
    private double bmiIndex;
    @NotBlank
    private String bmiResult;

    public BodyInfoEntity(PostBodyInfoRequestDto dto){
        
        Date now = new Date(); //그날 그날의 새로운 날짜를 받아와야함
        SimpleDateFormat simpleDateFormat =
            new SimpleDateFormat("yyyy-MM-dd");
        String recodeDate = simpleDateFormat.format(now);
        //기록 날짜를 simpleDateFormat 형식으로 맞춰주고 오늘의 날짜는 now로 맞춰줌

        this.height = dto.getHeight();
        this.weight = dto.getWeight();
        this.muscleMass = dto.getMuscleMass();
        this.fatRate = dto.getFatRate();
        this.recordDate = recodeDate;
    }
}
