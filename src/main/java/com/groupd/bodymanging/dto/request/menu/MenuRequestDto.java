package com.groupd.bodymanging.dto.request.menu;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuRequestDto {

    @NotBlank
    private String menuCode;

}
