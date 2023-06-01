package com.groupd.bodymanging.dto.request.mileage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //no와 all의 차이는 무엇인가
@NoArgsConstructor
public class PostMileageRequestDto {
    
    private Integer userCode;
    //왜 int가 아닌 Integer을 쓰는지
}
