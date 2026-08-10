package com.example.tbankcase.Model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Entity
@Getter
@Setter
@Table(name = "users")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "category")
    private String categoryNum;
    @Column(name = "sum")
    private float sum;
    @Column(name = "datetime")
    private Timestamp dateTime;
}
