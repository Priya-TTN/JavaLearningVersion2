package com.bms.bookMyShow.services;
import com.bms.bookMyShow.dtos.SignUpRequestDto;
import com.bms.bookMyShow.models.User;
import com.bms.bookMyShow.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User signUp(String name, String email, String password) {
        Optional<User> existingUser = userRepository.findByEmail(email);

        // Check if the user already exists
        if (existingUser.isPresent()) {
            // If multiple users with the same email exist, throw an exception or handle it appropriately
            throw new RuntimeException("User already exists with the email: " + email);
        }

        // Create a new user
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password); // Ensure this is hashed before storing
        user.setCreatedAt(new Date());
        user.setLastModifiedAt(new Date());
        // Save user to the database
        return userRepository.save(user);
    }


    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long userId, SignUpRequestDto userDTO) {
        User existingUser = getUserById(userId);

        existingUser.setName(userDTO.getName());
        existingUser.setEmail(userDTO.getEmail());
        existingUser.setPassword(userDTO.getPassword());
        return userRepository.save(existingUser);
    }
    public void deleteUser(Long userId) {
        User user = getUserById(userId);
        userRepository.delete(user);
    }



    public void signIn(String email, String password) {
        System.out.println("Started Login --- >");
        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
//return;
        }

        User user = optionalUser.get();
        System.out.println("Login Successful");
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//
//        if (bCryptPasswordEncoder.matches(password, user.getPassword())) {
//            System.out.println("Login Successful");
//        } else {
//            System.out.println("Wrong password");
//        }
    }
}