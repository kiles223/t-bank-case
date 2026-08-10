package com.example.tbankcase.Service.Implements;

import com.example.tbankcase.Model.Repositories.UserRepository;
import com.example.tbankcase.Model.dto.UsersDTO;
import com.example.tbankcase.Model.entities.Users;
import com.example.tbankcase.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplements implements UserService {


    @Autowired
    public UserRepository userRepository;

    @Override
    public UsersDTO createUser(Users user){


    }

}
