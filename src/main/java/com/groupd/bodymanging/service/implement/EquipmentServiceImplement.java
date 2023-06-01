package com.groupd.bodymanging.service.implement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.groupd.bodymanging.common.util.CustomResponse;
import com.groupd.bodymanging.dto.response.equipment.GetEquipmentResponseDto;
import com.groupd.bodymanging.entity.EquipmentEntity;
import com.groupd.bodymanging.entity.resultSet.EquipmentListResultSet;
import com.groupd.bodymanging.repository.EquipmentRepository;
import com.groupd.bodymanging.service.EquipmentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImplement implements EquipmentService{

    private final EquipmentRepository equipmentRepository;

    @Override
    public ResponseEntity<? super GetEquipmentResponseDto> getEquipment(Integer equipmentNumber) {
        GetEquipmentResponseDto body = null;
        try {
            if (equipmentNumber == null) {
                return CustomResponse.validationFaild();
            }
            EquipmentEntity equipmentEntity = equipmentRepository.findByEquipmentNumber(equipmentNumber);
            if (equipmentEntity == null) {
                return CustomResponse.notExistEquipmnetNumber();
            }
            
            equipmentRepository.save(equipmentEntity);
            body = new GetEquipmentResponseDto(equipmentEntity);

        } catch (Exception exception) {
            exception.printStackTrace();
            return CustomResponse.databaseError();
        }
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @Override
    public ResponseEntity<? super GetEquipmentResponseDto> getEquipmentList() {
        GetEquipmentResponseDto body = null;
        try {
        
            List<EquipmentListResultSet> resultSet = equipmentRepository.getEquipmentList();
            body = new GetEquipmentResponseDto(resultSet);

        } catch (Exception exception) {
            exception.printStackTrace();

            return CustomResponse.databaseError();

        }
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
    
}
