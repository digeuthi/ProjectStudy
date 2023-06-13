package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.ExerciseRoutineEntity;



@Repository
public interface ExerciseRoutineRepository extends JpaRepository<ExerciseRoutineEntity,Integer>{
    
    public ExerciseRoutineEntity findByRoutineNumber(int routineNumber);
}
