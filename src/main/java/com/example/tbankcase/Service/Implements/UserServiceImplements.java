package com.example.tbankcase.Service.Implements;

import com.example.tbankcase.Exception.ResourceNotFoundException;
import com.example.tbankcase.Mapper.UserMapper;
import com.example.tbankcase.Model.Repositories.UserRepository;
import com.example.tbankcase.Model.dto.UsersDTO;
import com.example.tbankcase.Model.entities.Users;
import com.example.tbankcase.Service.Interface.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class UserServiceImplements implements UserService {


    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UsersDTO createUser(UsersDTO userDto){
        Users user = userMapper.toEntity(userDto);
        Users savedUser = userRepository.save(user);
        return  userMapper.toDto(savedUser);

    }

    @Override
    public UsersDTO getUserById(long userId) {
        Users user = userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("Не найдено пользователя с id: " + userId));
        return userMapper.toDto(user);
    }

    @Override
    public void deleteUserById(long userId) {
        Users user = userMapper.toEntity(getUserById(userId));
        userRepository.delete(user);
    }
}
