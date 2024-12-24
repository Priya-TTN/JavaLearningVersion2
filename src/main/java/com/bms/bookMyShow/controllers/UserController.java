package com.bms.bookMyShow.controllers;

import com.bms.bookMyShow.dtos.*;
import com.bms.bookMyShow.dtos.ResponseStatus;
import com.bms.bookMyShow.models.User;
import com.bms.bookMyShow.services.UserService1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService1 userService;

    public UserController(UserService1 userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public SignUpResponseDto signUp(@RequestBody SignUpRequestDto requestDto) {
        User user = userService.signUp(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUser(user);

        return responseDto;
    }
    @GetMapping("/{userId}")
    public SignUpResponseDto getUser(@PathVariable Long userId) {
        User user = userService.getUserById(userId);

        // Create response DTO
        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUser(user);

        return responseDto;
    }

    @PutMapping("/{userId}")
    public UpdateUserResponseDto updateUser(@PathVariable Long userId, @RequestBody SignUpRequestDto userDTO) {
        User updatedUser = userService.updateUser(userId, userDTO);

        // Create response DTO
        UpdateUserResponseDto responseDto = new UpdateUserResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUpdatedUser(updatedUser);

        return responseDto;
    }

    @DeleteMapping("/{userId}")
    public DeleteUserResponseDto deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);

        // Create response DTO
        DeleteUserResponseDto responseDto = new DeleteUserResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setMessage("User deleted successfully");

        return responseDto;
    }
    @GetMapping("/signin")
    public void signIn(SignInRequestDto requestDto) {
        userService.signIn(
                requestDto.getEmail(),
                requestDto.getPassword()
        );
    }
}