package com.abdullah.first_web_app.controllers;

import com.abdullah.first_web_app.dto.EmployeeDTO;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;


@RestController
public class EmployeeController {

    @RequestMapping(value="/employees")
    public String getEmployees(){
        return "here are all the employees ";
    }
    @RequestMapping(value="/employee/{id}")
    public EmployeeDTO getEmployee(@PathVariable long empId){
        return new EmployeeDTO(empId, "Abdullah", LocalDate.of(2024,7,18),true);
    }
}
