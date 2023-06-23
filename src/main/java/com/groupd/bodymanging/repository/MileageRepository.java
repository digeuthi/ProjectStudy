package com.groupd.bodymanging.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupd.bodymanging.entity.MileageEntity;

public interface MileageRepository extends JpaRepository<MileageEntity, Integer>{
    //등록된 출석일자 가져오기
    public MileageEntity findByAttendanceDate(Date attendanceDate);
    //오늘 출석을 했는지 여부 판단
    public boolean AttendanceToday(boolean attendanceToday);
    //유저 코드랑 출석여부 판단 해당 회원이 출석을 했는지 판단하는건가?
    public MileageEntity findByUserCodeAndAttendanceToday(int userCode, boolean attendanceToday);
    // 유저코드로 정보 조회하는것 해당 회원의 마일리지 조회
    public MileageEntity findByUserCode(int userCode);
}
