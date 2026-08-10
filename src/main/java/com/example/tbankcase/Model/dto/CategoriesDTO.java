package com.example.tbankcase.Model.dto;

import com.example.tbankcase.Model.entities.United;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoriesDTO {
    private long id;
    private String categoryName;
    private int category;
    private List<United> unitedCategories;
}
