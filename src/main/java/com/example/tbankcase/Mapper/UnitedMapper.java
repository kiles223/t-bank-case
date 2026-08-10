package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.entities.United;
import org.mapstruct.Mapper;
import com.example.tbankcase.Model.dto.UnitedDTO;
@Mapper(componentModel = "string")
public interface UnitedMapper {

    UnitedDTO toDto(United united);

    United toEntity(UnitedDTO unitedDTO);
}
