package com.groupd.bodymanging.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.response.ResponseDto;

public class CustomResponse {
    
    public static ResponseEntity<ResponseDto> success(){
        ResponseDto body = new ResponseDto("SU", "Sucess");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    public static ResponseEntity<ResponseDto> databaseError(){
        ResponseDto errorBody = new ResponseDto("DE", "Database Error");
            return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(errorBody);
    } 

    public static ResponseEntity<ResponseDto> serverError() {
        ResponseDto errorBody = new ResponseDto("SE", "Server Error");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> validationFaild(){
        ResponseDto errorBody = 
        new ResponseDto("VF", "Request Parameter Validation Failed");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserEmail(){
        ResponseDto errorBody  = new ResponseDto("EU", "Existent User Email");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserNickname(){
        ResponseDto errorBody  = new ResponseDto("EN", "Existent User Nickname");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> existUserPhoneNumber(){
        ResponseDto errorBody  = new ResponseDto("EP", "Existent User Phone Number");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> signInFailed(){ 
        ResponseDto errorBody  = new ResponseDto("SF", "Sign In failed");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistUserCode(){
        ResponseDto errorBody = new ResponseDto("NU", "Non-Existent User Code");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> notExistEquipmnetNumber() {
        ResponseDto errorBody = new ResponseDto("NE", "Non-Existent Equipmnet Number");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }
}
