package com.example.tbankcase.Service.Interface;

import com.example.tbankcase.Model.dto.TransactionsDTO;


public interface TransactionsService {
    TransactionsDTO createTransactions(TransactionsDTO transaktions);
    TransactionsDTO getTransaktionsById(long transaktionsId);
    void deleteTransaktionsById(long transaktionsId);
}
