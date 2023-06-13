package com.groupd.bodymanging.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.BodyInfoEntity;
@Repository
public interface BodyInfoRepository extends JpaRepository<BodyInfoEntity,Integer>{
    
    public boolean existsByUserCode(Integer userCode);
    public List<BodyInfoEntity> findByUserCode(Integer userCode);

    @Query(
        value = 
        "DELETE " +
        "FROM body_info WHERE user_code = ?; ",
        nativeQuery = true  
    )
    @Transactional
    @Modifying
    public Integer deleteUserBodyInfo(Integer userCode);

    //@Modifying
    //수정(UPDATE, DELETE) 쿼리를 실행하는 메서드에 적용됩니다. 
    //JPA는 일반적으로 조회(SELECT) 쿼리는 자동으로 인식하지만, 
    //수정 쿼리는 @Modifying 어노테이션을 사용하여 명시적으로 알려주어야 합니다. 
    //이 어노테이션을 사용하면 스프링은 해당 쿼리를 실행하고 영향을 받는 
    //행의 수를 반환합니다.
}
