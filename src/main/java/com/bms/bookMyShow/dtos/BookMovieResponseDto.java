package com.bms.bookMyShow.dtos;

import com.bms.bookMyShow.models.Booking;
import com.bms.bookMyShow.models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private Booking booking;
    private BookingStatus bookingStatus;
}
