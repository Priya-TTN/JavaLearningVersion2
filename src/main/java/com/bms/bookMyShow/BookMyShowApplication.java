package com.bms.bookMyShow;
import com.bms.bookMyShow.controllers.*;
import com.bms.bookMyShow.dtos.SignUpRequestDto;
import com.bms.bookMyShow.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
    @Autowired
	private UserController userController;
	public static void main(String[] args) {

		SpringApplication.run(BookMyShowApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	//	SignUpRequestDto requestDto = new SignUpRequestDto();
//		requestDto.setName("Priya");
//		requestDto.setEmail("gpriya7272@gmail.com");
//		requestDto.setPassword("priya@1234");
	//	SignUpResponseDto responseDto = userController.signUp(requestDto);
	}

}
