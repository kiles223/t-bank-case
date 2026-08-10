package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.dto.UsersDTO;

public interface UserService{
    UsersDTO createUser(UsersDTO user);
    UsersDTO getUserById(long userId);
    void deleteUserById(long  userId);
}
