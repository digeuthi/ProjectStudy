package com.groupd.bodymanging.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.groupd.bodymanging.entity.EquipmentEntity;
import com.groupd.bodymanging.entity.resultSet.EquipmentListResultSet;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentEntity, Integer>{
    public EquipmentEntity findByEquipmentNumber(int equipmentNumber);

    @Query(
        value = 
        "SELECT " +
        "* FROM equipment_view; ",
        nativeQuery = true  
    )
    public List<EquipmentListResultSet> getEquipmentList();
}
