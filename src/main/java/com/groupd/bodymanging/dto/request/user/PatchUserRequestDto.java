package com.groupd.bodymanging.dto.request.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchUserRequestDto {
    @NotBlank
    @Email
    private String userEmail;
    @NotBlank
    private String userPassword;
    @NotBlank
    private String userNewPassword;
    @NotBlank
    private String userNewPasswordCheck;
    @NotBlank
    private String userNickname;
    @NotBlank
    @Pattern(regexp = "^\\d{3}-\\d{3,4}-\\d{4}$")
    private String userPhoneNumber;
    private String userAddress;
    private String userGender;
    private int userAge;
}
