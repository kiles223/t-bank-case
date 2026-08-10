package com.example.tbankcase.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UnitedDTO {
    private long id;
    private long userId;
    private double maxLimit;
    private int category;
}
