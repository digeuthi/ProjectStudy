package com.groupd.bodymanging.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupd.bodymanging.dto.response.exercistRoutine.GetExerciseRoutineResponseDto;
import com.groupd.bodymanging.service.ExerciseRoutineService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExerciseRoutineServiceImplement implements ExerciseRoutineService{

    @Override
    public ResponseEntity<? super GetExerciseRoutineResponseDto> getRoutine(Integer routineNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoutine'");
    }
    
}
