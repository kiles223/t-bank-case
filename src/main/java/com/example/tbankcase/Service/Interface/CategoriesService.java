package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.dto.CategoriesDTO;

public interface CategoriesService {
    CategoriesDTO createCategories(CategoriesDTO categories);
    CategoriesDTO getCategoriesById(long categoriesId);
    void deleteCategoriesById(long categoriesId);
}
