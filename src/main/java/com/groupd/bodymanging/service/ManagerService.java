package com.groupd.bodymanging.service;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.request.user.PostManagerRequestDto;
import com.groupd.bodymanging.dto.response.user.GetTrainnerProfileResponseDto;
import com.groupd.bodymanging.dto.response.user.GetUserResponseDto;

public interface ManagerService {
    public ResponseEntity<? super GetTrainnerProfileResponseDto> getTrainnerProfile();
    public ResponseEntity<? super GetUserResponseDto> addManager(PostManagerRequestDto dto);
}
