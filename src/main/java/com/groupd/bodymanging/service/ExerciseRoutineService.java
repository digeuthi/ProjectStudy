package com.groupd.bodymanging.service;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.response.exercistRoutine.GetExerciseRoutineResponseDto;

public interface ExerciseRoutineService {
    public ResponseEntity<? super GetExerciseRoutineResponseDto> getRoutine(Integer routineNumber);
}
