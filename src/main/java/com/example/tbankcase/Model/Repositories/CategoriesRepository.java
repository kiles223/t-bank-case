package com.example.tbankcase.Model.Repositories;

import com.example.tbankcase.Model.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository <Categories, Long> {
}
