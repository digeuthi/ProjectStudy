package com.groupd.bodymanging.dto.response.equipment;

import java.util.ArrayList;
import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.EquipmentEntity;
import com.groupd.bodymanging.entity.resultSet.EquipmentListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetEquipmentListResponseDto extends ResponseDto{
    private List<EquipmentSummary> equipmentList;

    public GetEquipmentListResponseDto(List<? extends Object> resultSet){
        super("SU", "Sucess");

        List<EquipmentSummary> equipmentList = new ArrayList<>();

        for(Object result : resultSet){
            EquipmentSummary equipmentSummary = new EquipmentSummary();
            if (result instanceof EquipmentEntity)
            equipmentSummary = new EquipmentSummary((EquipmentEntity) result);
            if (result instanceof EquipmentListResultSet)
            equipmentSummary = new EquipmentSummary((EquipmentListResultSet) result);
            equipmentList.add(equipmentSummary);
        }
        this.equipmentList = equipmentList;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class EquipmentSummary{
    private String equipmentName;
    private String equipmentUsage;
    private String equipmentImageUrl;

    public EquipmentSummary(EquipmentListResultSet resultSet){
        this.equipmentName = resultSet.getEquipmentName();
        this.equipmentUsage = resultSet.getEquipmentUsage();
        this.equipmentImageUrl = resultSet.getEquipmentImageUrl();
    }

    public EquipmentSummary(EquipmentEntity equipmentEntity){
        this.equipmentName = equipmentEntity.getEquipmentName();
        this.equipmentUsage = equipmentEntity.getEquipmentUsage();
        this.equipmentImageUrl =equipmentEntity.getEquipmentImageUrl();
    }
}