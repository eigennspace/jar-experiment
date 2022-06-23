package com.example.jarexperiment.Repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jarexperiment.Models.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, BigInteger> {
    
}
