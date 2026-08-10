package com.example.tbankcase.Model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "balance")
    private double balance;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<United> unitedId;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Transactions> transactionsList;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Notifications> notifications;
}
