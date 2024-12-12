package com.bms.bookMyShow.dtos;

import com.bms.bookMyShow.models.Seat;
import com.bms.bookMyShow.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookMovieRequestDto {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds;
}