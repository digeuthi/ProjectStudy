package com.groupd.bodymanging.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "Manager")
@Table(name = "Manager")
@Data
@NoArgsConstructor
public class ManagerEntity {
    @Id
    @Email
    String managerEmail;

    public ManagerEntity(String email){
        this.managerEmail = email;
    }
}
