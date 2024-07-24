package com.abdullah.first_web_app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private long id;
    private String name;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;
}
