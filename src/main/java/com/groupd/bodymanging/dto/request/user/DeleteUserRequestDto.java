package com.groupd.bodymanging.dto.request.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class DeleteUserRequestDto {
    @NotBlank
    @Email
    private String userEmailCheck;
    @NotBlank
    private String userPassword;
}
