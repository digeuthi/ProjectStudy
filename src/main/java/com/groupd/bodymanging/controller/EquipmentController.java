package com.groupd.bodymanging.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupd.bodymanging.dto.response.equipment.GetEquipmentResponseDto;
import com.groupd.bodymanging.service.EquipmentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/equipment")
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentService equipmentService;

    @GetMapping("/{equipmentNumber}")
    public ResponseEntity<? super GetEquipmentResponseDto> getEquipment(
            @PathVariable("equipmentNumber") Integer equipmentNumber) {
        ResponseEntity<? super GetEquipmentResponseDto> response = equipmentService.getEquipment(equipmentNumber);
        return response;
    }

    @GetMapping("/list")
    public ResponseEntity<? super GetEquipmentResponseDto> getBoard() {
        ResponseEntity<? super GetEquipmentResponseDto> response = equipmentService.getEquipmentList();
        return response;
    }
}
