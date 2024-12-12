package com.bms.bookMyShow.models;

import com.bms.bookMyShow.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends BaseModel {
    private String value;
}