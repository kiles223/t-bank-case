package com.example.tbankcase.Model.dto;
import com.example.tbankcase.Model.entities.Transactions;
import com.example.tbankcase.Model.entities.United;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class UsersDTO {

    private long id;

    private String name;
    private double balance;
    private List<United> unitedId;
    private List<Transactions> transactionsList;
}
