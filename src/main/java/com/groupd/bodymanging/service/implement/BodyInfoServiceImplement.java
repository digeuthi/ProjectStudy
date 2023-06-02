package com.groupd.bodymanging.service.implement;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.request.bodyInfo.PostBodyInfoRequestDto;
import com.groupd.bodymanging.dto.response.bodyInfo.GetBodyInfoResponseDto;
import com.groupd.bodymanging.service.BodyInfoService;

public class BodyInfoServiceImplement implements BodyInfoService{

    @Override
    public ResponseEntity<ResponseEntity> postBodyInfo(String email, PostBodyInfoRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postBodyInfo'");
    }

    @Override
    public ResponseEntity<? super GetBodyInfoResponseDto> getBodyInfo(Integer userCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBodyInfo'");
    }
    
}
