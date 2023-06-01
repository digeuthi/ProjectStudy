package com.groupd.bodymanging.dto.response.mileage;

import com.groupd.bodymanging.dto.response.ResponseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetMileageResponseDto extends ResponseDto{
    
    private Integer userCode;
    private Integer attendanceMileage;
    //왜 int랑 Integer을 나눠서 쓰는걸까...
    public GetMileageResponseDto(Integer userCode, Integer attendanceMileage){
        super("SU", "Sucess");
        this.userCode = userCode;
        this.attendanceMileage = attendanceMileage;
    }
}
