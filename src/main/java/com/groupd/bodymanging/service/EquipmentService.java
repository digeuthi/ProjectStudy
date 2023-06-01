package com.groupd.bodymanging.service;

import org.springframework.http.ResponseEntity;

import com.groupd.bodymanging.dto.response.equipment.GetEquipmentResponseDto;

public interface EquipmentService {
    public ResponseEntity<? super GetEquipmentResponseDto> getEquipment(Integer equipmentNumber);
    public ResponseEntity<? super GetEquipmentResponseDto> getEquipmentList();
}
