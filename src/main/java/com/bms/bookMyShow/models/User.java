package com.bms.bookMyShow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
}