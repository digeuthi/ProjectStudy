package com.groupd.bodymanging.dto.request.mileage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
//NoArgsConstructor 아무것도 매개변수로 넣지 않는 빈생성자 만들기
//AllArgsConstructor 모든 매개변수를 받는 생성자 만들기
public class PostMileageRequestDto {
    
    private Integer userCode;
    //왜 int가 아닌 Integer을 쓰는지
    
    //Integer를 사용하는 것은 int와는 다르게 null 값을 허용하고, 
    //제네릭과 호환성이 있으며, 초기값으로 null을 가질 수 있다는 장점
}
