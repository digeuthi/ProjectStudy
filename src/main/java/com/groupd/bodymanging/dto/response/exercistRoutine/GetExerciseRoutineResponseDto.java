package com.groupd.bodymanging.dto.response.exercistRoutine;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.ExerciseRoutineEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetExerciseRoutineResponseDto extends ResponseDto{
    
    private String routineImageUrl1;
    private String routineImageUrl2;
    private String routineImageUrl3;

    public GetExerciseRoutineResponseDto(ExerciseRoutineEntity exercistRoutineEntity){
        super("SU", "Sucess");
        this.routineImageUrl1 = exercistRoutineEntity.getRoutineImageUrl1();
        this.routineImageUrl2 = exercistRoutineEntity.getRoutineImageUrl2();
        this.routineImageUrl3 = exercistRoutineEntity.getRoutineImageUrl3();
    }
}
