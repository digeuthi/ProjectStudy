package com.groupd.bodymanging.entity.primaryKey;

import javax.persistence.Column;

import lombok.Data;

@Data
public class BodyPK {
    @Column(name = "user_code") //이거 DB의 PK잡아둔 컬럼과 연결하려고 이렇게 한건가
    private Integer userCode;
    @Column(name="record_date")
    private String recordDate;

}
