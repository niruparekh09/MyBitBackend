package com.app.dto;

import com.app.enities.Employee;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeesOfDepartment {
    List<Employee> employeeList = new ArrayList<>();
}
