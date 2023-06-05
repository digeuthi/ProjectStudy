package com.groupd.bodymanging.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupd.bodymanging.dto.request.user.PostManagerRequestDto;
import com.groupd.bodymanging.dto.response.user.GetTrainnerProfileResponseDto;
import com.groupd.bodymanging.dto.response.user.GetUserResponseDto;
import com.groupd.bodymanging.service.ManagerService;

@Service
public class ManagerServiceImplement implements ManagerService{

    @Override
    public ResponseEntity<? super GetTrainnerProfileResponseDto> getTrainnerProfile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrainnerProfile'");
    }

    @Override
    public ResponseEntity<? super GetUserResponseDto> addManager(PostManagerRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addManager'");
    }
    
}
