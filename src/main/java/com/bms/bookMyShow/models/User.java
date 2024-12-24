package com.bms.bookMyShow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel {
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @ManyToMany
    private List<Role> roles;
}