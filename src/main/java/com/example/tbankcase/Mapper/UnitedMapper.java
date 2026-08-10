package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.entities.United;
import com.example.tbankcase.Model.entities.Users;
import org.mapstruct.Mapper;
import com.example.tbankcase.Model.dto.UnitedDTO;
@Mapper(componentModel = "string")
public interface UnitedMapper {

    UnitedDTO toDto(Users united);

    United toEntity(UnitedDTO unitedDTO);
}
