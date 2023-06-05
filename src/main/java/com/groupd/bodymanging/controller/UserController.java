package com.groupd.bodymanging.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.token.TokenService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupd.bodymanging.common.util.CustomResponse;
import com.groupd.bodymanging.dto.request.user.PatchUserRequestDto;
import com.groupd.bodymanging.dto.request.user.SignInRequestDto;
import com.groupd.bodymanging.dto.request.user.SignUpRequestDto;
import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.dto.response.user.GetAuthResponseDto;
import com.groupd.bodymanging.dto.response.user.GetUserResponseDto;

import com.groupd.bodymanging.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    
    private UserService userService;
    private TokenService tokenService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("sign-up")
    public ResponseEntity<ResponseDto> signUp(
        @Valid @RequestBody SignUpRequestDto requestBody
    ){
        ResponseEntity<ResponseDto> response = userService.signUp(requestBody);
        return response;
    }

    @PostMapping("sign-in")
    public ResponseEntity<? super GetAuthResponseDto> signIn(
        @Valid @RequestBody SignInRequestDto requsetBody
    ){
        ResponseEntity<? super GetAuthResponseDto> response = userService.signIn(requsetBody);
        return response;
    }

    @PostMapping("/logout")
    public ResponseEntity<ResponseDto> logout(@RequestHeader("Authorization") String token) {
        try {
            String jwt = extractJwtFromToken(token);
            tokenService.invalidateToken(jwt); // 토큰 삭제

            return CustomResponse.success();
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.serverError();
        }
    }
    //토큰에서 jwt 추출 
    private String extractJwtFromToken(String token) {
        if (token.startsWith("Bearer ")) {
            return token.substring(7);
        }
        return null;
    }

    @GetMapping("/{userCode}")
    public ResponseEntity<? super GetUserResponseDto> getUser(
        @PathVariable("userCode") Integer userCode
    ){
        ResponseEntity<? super GetUserResponseDto> response =
            userService.getUser(userCode);
        return response;
    }

    @PatchMapping("")
    public ResponseEntity<ResponseDto> patchUser(
        @Valid @RequestBody PatchUserRequestDto requestBody
    ){
        ResponseEntity<ResponseDto> response =
            userService.patchUser(requestBody);
        return response;
    }

    @DeleteMapping("/{userEmail}/{userCode}")
    public ResponseEntity<ResponseDto> deleteUser(
        @PathVariable("userEmail") String userEmail,
        @PathVariable("userCode") Integer userCode
    ){
        ResponseEntity<ResponseDto> response =
            userService.deletdUser(userEmail, userCode);
        return response;
    }

}
