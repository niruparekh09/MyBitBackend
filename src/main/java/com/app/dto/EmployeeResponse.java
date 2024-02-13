package com.app.dto;

import com.app.enities.Department;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private String firstName;
    private String lastName;
    private String city;
    private BigDecimal salary;
    private String email;
    private Department dept;
}
