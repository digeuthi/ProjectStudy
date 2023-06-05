package com.groupd.bodymanging.service;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.request.user.PatchUserRequestDto;
import com.groupd.bodymanging.dto.request.user.SignInRequestDto;
import com.groupd.bodymanging.dto.request.user.SignUpRequestDto;
import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.dto.response.user.GetAuthResponseDto;
import com.groupd.bodymanging.dto.response.user.GetUserResponseDto;


public interface UserService {
    
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
    public ResponseEntity<? super GetAuthResponseDto> signIn(SignInRequestDto dto);
    public ResponseEntity<? super GetAuthResponseDto> logout(String jwt);
    public ResponseEntity<? super GetUserResponseDto> getUser(Integer userCode);
    public ResponseEntity<ResponseDto> patchUser(PatchUserRequestDto dto);
    public ResponseEntity<ResponseDto> deletdUser(String userEmail, Integer userCode);
}
