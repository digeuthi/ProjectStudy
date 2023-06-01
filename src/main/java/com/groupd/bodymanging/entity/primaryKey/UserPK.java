package com.groupd.bodymanging.entity.primaryKey;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class UserPK {
    @Column(name = "user_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userCode;
    @Column(name = "user_email")
    private String userEmail;
}
