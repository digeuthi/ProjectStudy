package com.groupd.bodymanging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.ManagerEntity;
import java.util.List;


@Repository
public interface ManagerRepository extends JpaRepository<ManagerEntity,String>{
    //Repository는 Entity에서 DB의 값을 받아와서 CRUD를 생성하는 곳이므로
    //JpaRepository를 상속받아서 사용하게 된다. 이때 Entity의 PK에 해당하는
    //데이터값을 지정하게 된다. null을 포함해야하므로 Integer, String의 타입으로
    //적용한다.

    public boolean existsByManagerEmail(String email);
    public ManagerEntity findByManagerEmail(String email);

    
}
