package com.example.tbankcase.Mapper;

import com.example.tbankcase.Model.entities.Transactions;
import org.mapstruct.Mapper;
import com.example.tbankcase.Model.dto.TransactionsDTO;
@Mapper(componentModel = "string")
public interface TransactionsMapper {
    TransactionsDTO toDto(Transactions transaction);
    Transactions toEntity(TransactionsDTO transactionsDTO);
}
