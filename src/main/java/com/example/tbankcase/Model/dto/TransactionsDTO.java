package com.example.tbankcase.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionsDTO {
    private long id;
    private long userId;
    private String categoryNum;
    private float sum;
    private Timestamp dateTime;
}
