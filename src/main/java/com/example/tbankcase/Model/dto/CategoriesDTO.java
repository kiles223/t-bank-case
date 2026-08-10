package com.example.tbankcase.Model.dto;

import com.example.tbankcase.Model.entities.United;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriesDTO {
    private long id;
    private String categoryName;
    private int category;
    private List<United> unitedCategories;
}
