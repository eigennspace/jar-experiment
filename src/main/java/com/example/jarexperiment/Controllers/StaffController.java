package com.example.jarexperiment.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jarexperiment.Models.Staff;
import com.example.jarexperiment.Services.StaffService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StaffController {
    private StaffService staffService;

    /***
     * Get all data in at staff table
     * @return all data of all column in staff table
     */
    @GetMapping("/staffs")
    public ResponseEntity<List<Staff>> getStaffs(){
        List<Staff> staffList = this.staffService.getAll();
            
        return ResponseEntity.ok(staffList);
    }

    @PostMapping("/staff")
    public Staff createStaff(@RequestBody Staff staff){
        return this.staffService.createStaff(staff);
    }
}