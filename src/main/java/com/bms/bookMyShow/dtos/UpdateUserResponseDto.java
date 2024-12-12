package com.bms.bookMyShow.dtos;

import com.bms.bookMyShow.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResponseDto {
    private ResponseStatus responseStatus;
    private User updatedUser;

}
