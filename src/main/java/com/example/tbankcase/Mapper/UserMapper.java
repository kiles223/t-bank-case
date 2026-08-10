package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.entities.Users;
import org.mapstruct.Mapper;
import com.example.tbankcase.Model.dto.UsersDTO;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UsersDTO toDto(Users user);

    Users toEntity(UsersDTO userDto);
}
//public class UserMapper{
//    public static UsersDTO toDto(Users user){
//        return new UsersDTO(user.getId(), user.getName(), user.getBalance(), user.getUnitedId(), user.getTransactionsList());
//    }
//    public static Users toEntity(UsersDTO userDTO){
//        return new Users(userDTO.getId(), userDTO.getName(), userDTO.getBalance(), userDTO.getUnitedId(), userDTO.getTransactionsList());
//    }
//}
