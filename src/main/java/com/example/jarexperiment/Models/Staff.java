package com.example.jarexperiment.Models;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Staff {
    @Id
    @Column(name = "staff_id", columnDefinition = "bigint")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger staff_id;

    @Column(length = 45, nullable = false)
    private String first_name;

    @Column(length = 45, nullable = false)
    private String last_name;

    @Column(length = 50)
    private String email;
}
