package com.example.tbankcase.Model.Repositories;

import com.example.tbankcase.Model.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository <Transactions, Long> {
}
