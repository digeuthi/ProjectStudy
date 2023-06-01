package com.groupd.bodymanging.dto.request.bodyInfo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostBodyInfoRequestDto {
    @NotNull
    private Double height;
    @NotNull
    private Double weight;
    @NotNull
    private Double muscleMass;
    @NotNull
    private Double fatRate;

}
