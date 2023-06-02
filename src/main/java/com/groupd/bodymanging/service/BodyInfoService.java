package com.groupd.bodymanging.service;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.request.bodyInfo.PostBodyInfoRequestDto;
import com.groupd.bodymanging.dto.response.bodyInfo.GetBodyInfoResponseDto;

public interface BodyInfoService {
    
    public ResponseEntity<ResponseEntity> postBodyInfo(String email, PostBodyInfoRequestDto dto);
    public ResponseEntity<? super GetBodyInfoResponseDto> getBodyInfo(Integer userCode);
}
