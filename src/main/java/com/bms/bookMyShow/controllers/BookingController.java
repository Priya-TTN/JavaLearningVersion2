package com.bms.bookMyShow.controllers;
import com.bms.bookMyShow.dtos.BookMovieRequestDto;
import com.bms.bookMyShow.dtos.BookMovieResponseDto;
import com.bms.bookMyShow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto requestDto) {
        return null;
    }
}