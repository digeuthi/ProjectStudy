package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupd.bodymanging.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
                    //UserEntity의 PK가 int 타입이므로 Integer타입으로 저장함
    public boolean existsByEmail(String userEmail);
    public boolean existsByNickname(String userNickname);
    public boolean existsByPhoneNumber(String userPhoneNumber);

    public UserEntity findByUserEmail(String userEmail);
    public UserEntity findByUserCode(int userCode);
}