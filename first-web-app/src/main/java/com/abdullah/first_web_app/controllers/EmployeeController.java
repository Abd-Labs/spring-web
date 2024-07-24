package com.abdullah.first_web_app.controllers;

import com.abdullah.first_web_app.dto.EmployeeDTO;
import com.abdullah.first_web_app.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path="")
    public List<EmployeeDTO> getEmployees(@RequestParam(name = "Name") String name){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path="/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") long empId){
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping(path = "")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
         return employeeService.AddEmployee(employeeDTO);
    }
}
