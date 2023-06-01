package com.groupd.bodymanging.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.groupd.bodymanging.dto.request.mileage.PostMileageRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Mileage")
@Table(name = "Mileage")
public class MileageEntity {
    
    private Integer userCode; //null 값 데이터 맞추주려고 int말고 Integer원형을 쓰는건가?
    private boolean attendanceToday;
    private int attendanceMileage;
    private String attendanceDate;

    public MileageEntity(PostMileageRequestDto postMileageRequestDto, UserEntity userEntity){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat =
            new SimpleDateFormat("yyyy-MM-dd");
        String attendanceDate = simpleDateFormat.format(now);

        this.userCode = userEntity.getUserCode();
        this.attendanceToday = false;
        this.attendanceMileage = 0;
        this.attendanceDate = attendanceDate;
    }
}
