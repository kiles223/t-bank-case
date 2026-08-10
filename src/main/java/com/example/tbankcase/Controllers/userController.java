package com.example.tbankcase.Controllers;

import com.example.tbankcase.Exception.ResourceNotFoundException;
import com.example.tbankcase.Model.Repositories.UserRepository;
import com.example.tbankcase.Service.Interface.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tbankcase.Model.dto.UsersDTO;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class userController {

    private UserRepository userRepository;
    private UserService userService;

    @PostMapping
    public ResponseEntity<UsersDTO> createUser(@RequestBody UsersDTO user) {
        UsersDTO savedUserDTO = userService.createUser(user);
        return new ResponseEntity<>(savedUserDTO, HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<UsersDTO> getUser(@PathVariable long userId) {
        UsersDTO savedUserDTO = userService.getUserById(userId);
        return ResponseEntity.ok(savedUserDTO);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteUser(@PathVariable long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.ok("Пользователь успешно удален");
    }

}
