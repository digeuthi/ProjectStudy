package com.groupd.bodymanging.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.groupd.bodymanging.common.util.CustomResponse;
import com.groupd.bodymanging.dto.request.user.PatchUserRequestDto;
import com.groupd.bodymanging.dto.request.user.SignInRequestDto;
import com.groupd.bodymanging.dto.request.user.SignUpRequestDto;
import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.dto.response.user.GetAuthResponseDto;
import com.groupd.bodymanging.dto.response.user.GetUserResponseDto;

import com.groupd.bodymanging.entity.UserEntity;
import com.groupd.bodymanging.provider.JwtProvider;
import com.groupd.bodymanging.repository.UserRepository;
import com.groupd.bodymanging.service.UserService;

@Service
public class UserServiceImplement implements UserService{

    private UserRepository userRepository;

    private JwtProvider jwtProvider;

    private PasswordEncoder passwordEncoder;

    public UserServiceImplement(UserRepository userRepository, JwtProvider jwtProvider){
        this.userRepository = userRepository;
        this.jwtProvider = jwtProvider;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {
        String userEmail = dto.getUserEmail();
        String userNickname = dto.getUserNickname();
        String userPhoneNumber = dto.getUserPhoneNumber();
        String userPassword = dto.getUserPassword();

        try {

            // 존재하는 유저 이메일 반환
            boolean existedUserEmail = userRepository.existsByEmail(userEmail);
            if(existedUserEmail) return CustomResponse.existUserEmail();
            
            // 존재하는 유저 닉네임 반환
            boolean existedUserNickname = userRepository.existsByNickname(userNickname);
            if(existedUserNickname) return CustomResponse.existUserNickname();

            // 존재하는 유저 휴대폰 번호 반환
            boolean existedUserPhoneNumber = userRepository.existsByPhoneNumber(userPhoneNumber);
            if(existedUserPhoneNumber) return CustomResponse.existUserPhoneNumber();
            
            //암호화 작업
            String encodedPassword = passwordEncoder.encode(userPassword);
            dto.setUserPassword(encodedPassword);

            //유저 레코드 삽입
            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return CustomResponse.success();
    }

    @Override
    public ResponseEntity<? super GetAuthResponseDto> signIn(SignInRequestDto dto) {
        
        GetAuthResponseDto body = null;

        String userEmail = dto.getUserEmail();
        String userPassword = dto.getUserPassword();

        try {

            //로그인 실패(이메일 틀림)
            UserEntity userEntity = userRepository.findByUserEmail(userEmail);
            if(userEntity == null) return CustomResponse.signInFailed();

            //로그인 실패(비번 틀림)
            String encodedPassword = userEntity.getUserPassword();
            Boolean equalPassword = passwordEncoder.matches(userPassword, encodedPassword);
            if(!equalPassword) return CustomResponse.signInFailed();

            //데이터 반환(토큰 생성)
            String jwt = jwtProvider.create(userEmail);
            Integer lastUserCode = userEntity.getUserCode();
            body = new GetAuthResponseDto(jwt, lastUserCode);
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @Override
    public ResponseEntity<? super GetUserResponseDto> getUser(Integer userCode) {
        GetUserResponseDto body = null;

        try {

            if(userCode == null){
                return CustomResponse.validationFaild();
            }

            //존재하는 회원코드 조회
            UserEntity userEntity = userRepository.findByUserCode(userCode);
            if(userEntity == null){
                return CustomResponse.notExistUserCode();
            }
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @Override
    public ResponseEntity<ResponseDto> patchUser(PatchUserRequestDto dto) {
        
             //todo 존재하지 않는 이메일

            //todo 기존 비밀번호 불일치

            //todo 닉네임 중복

            //todo 새 비밀번호 형식 불일치

            //todo 새 비밀번호 확인 불일치

            return CustomResponse.success();
    }

    @Override
    public ResponseEntity<ResponseDto> deletdUser(String userEmail, Integer userCode) {
        
        try {

            //존재하지 않는 유저 이메일반환

            //존재하지 않는 회원코드 반환

            //?일치하지 않는 비밀번호

            //권한 없음
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }

        return CustomResponse.success();
    }
    
}
