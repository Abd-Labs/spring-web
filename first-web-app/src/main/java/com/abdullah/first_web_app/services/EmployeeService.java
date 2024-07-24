package com.abdullah.first_web_app.services;


import com.abdullah.first_web_app.dto.EmployeeDTO;
import com.abdullah.first_web_app.entities.EmployeeEntity;
import com.abdullah.first_web_app.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(long id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return new EmployeeDTO(111,"Abdullah", LocalDate.of(2024,7,19),true);
    }

    public EmployeeDTO AddEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);

        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
       return employeeRepository
               .findAll()
               .stream()
               .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
               .collect(Collectors.toList());
    }
}
