package com.example.tbankcase.Model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_number")
    private int category;
    @OneToMany
    @JoinColumn(name = "category")
    private List<United> unitedCategories;
}