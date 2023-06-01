package com.groupd.bodymanging.dto.response.equipment;

import java.util.List;

import com.groupd.bodymanging.dto.response.ResponseDto;
import com.groupd.bodymanging.entity.EquipmentEntity;
import com.groupd.bodymanging.entity.resultSet.EquipmentListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEquipmentResponseDto extends ResponseDto{
    private int equipmentNumber;
    private String equipmentName;
    private String equipmentUsage;
    private String equipmentImageUrl;

    public GetEquipmentResponseDto(EquipmentEntity equipmentEntity){
        super("SU", "Sucess");
        this.equipmentNumber = equipmentEntity.getEquipmentNumber();
        this.equipmentName = equipmentEntity.getEquipmentName();
        this.equipmentImageUrl = equipmentEntity.getEquipmentImageUrl();
    }

    public GetEquipmentResponseDto(List<EquipmentListResultSet> resultSet) {
    }
}
