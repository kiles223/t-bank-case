package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.entities.Users;

public interface UserService {
    public UserService createUser(Users user);
    public UserService findById(long id);
}
