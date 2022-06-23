package com.example.jarexperiment.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jarexperiment.Models.Staff;
import com.example.jarexperiment.Repositories.StaffRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StaffService {
    private final StaffRepository staffRepository;

    public List<Staff> getAll(){
        return this.staffRepository.findAll();
    }
}
