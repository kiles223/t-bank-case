package com.example.tbankcase.Model.dto;

import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
public class TransactionsDTO {
    private long id;
    private long userId;
    private String categoryNum;
    private float sum;
    private Timestamp dateTime;
}
