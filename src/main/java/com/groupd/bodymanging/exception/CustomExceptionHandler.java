package com.groupd.bodymanging.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.groupd.bodymanging.common.util.CustomResponse;
import com.groupd.bodymanging.dto.response.ResponseDto;

@RestControllerAdvice
public class CustomExceptionHandler {
    //todo 각각의 예외들 이유 찾기
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResponseDto> handlerHttpMessageNotReadableException(
            HttpMessageNotReadableException exception) {
        // 결과가 ResponseEntity로 반환됨 컨트롤러이기 때문에 ... 그리고 처리하고자 하는 메세지를 매게변수로 받아온다.
        return CustomResponse.validationFaild();
    }
    //todo 각각의 예외들 이유 찾기
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> handlerMethodArgumentNotValidException(
            MethodArgumentNotValidException exception) {

        return CustomResponse.validationFaild();
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    //이거는 매개변수의 타입이 맞지 않을때 예외처리를 VF로 나오게 하는 예외처리.
    public ResponseEntity<ResponseDto> handlerMethodArgumentTypeMismatchException(
            MethodArgumentTypeMismatchException exception){
        
        return CustomResponse.validationFaild();
    }
}
