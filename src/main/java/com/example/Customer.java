package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public final class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}
