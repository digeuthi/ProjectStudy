package com.groupd.bodymanging.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.groupd.bodymanging.dto.request.user.SignUpRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
@Table(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userCode;
    private String userEmail;
    private String userPassword;
    private String userNickname;
    private String userPhoneNumber;
    private String userAddress;
    private String userGender;
    private int userAge;

    public UserEntity(SignUpRequestDto dto){
        this.userEmail = dto.getUserEmail();
        this.userPassword = dto.getUserPassword();
        this.userNickname = dto.getUserNickname();
        this.userPhoneNumber = dto.getUserPhoneNumber();
        this.userAddress = dto.getUserAddress();
        this.userGender = dto.getUserGender();
        this.userAge = dto.getUserAge();
    }
    
}
