package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupd.bodymanging.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    
    public boolean existsByEmail(String userEmail);
    public boolean existsByNickname(String userNickname);
    public boolean existsByPhoneNumber(String userPhoneNumber);

    public UserEntity findByUserEmail(String userEmail);
    public UserEntity findByUserCode(int userCode);
}