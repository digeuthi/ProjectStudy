package com.groupd.bodymanging.dto.request.board;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetBoardListWithWord {
    
    @NotNull
    private String words;
}
