package com.abdullah.first_web_app.controllers;

import com.abdullah.first_web_app.dto.EmployeeDTO;
import com.abdullah.first_web_app.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getEmployees(@RequestParam(name = "Name", required = false) String name) {
        System.out.println("GET /employees called");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") long empId) {
        System.out.println("GET /employees/" + empId + " called");
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("POST /employees called");
        return employeeService.AddEmployee(employeeDTO);
    }
}
