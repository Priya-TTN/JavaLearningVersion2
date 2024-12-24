package com.bms.bookMyShow.services;

import com.bms.bookMyShow.exceptions.UnAuthorizedException;
import com.bms.bookMyShow.exceptions.UserNotFoundException;
import com.bms.bookMyShow.models.Token;
import com.bms.bookMyShow.models.User;

public interface UserService {
    User signUp(String name, String email, String password);

    Token login(String email, String password) throws UserNotFoundException, UnAuthorizedException;

    User validateToken(String tokenValue);

    void logout(String tokenValue);
}
