package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.dto.CategoriesDTO;
import com.example.tbankcase.Model.entities.Categories;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface CategoriesMapper {
    CategoriesDTO toDto(Categories categories);
    Categories toEntity(CategoriesDTO categoriesDTO);

}
