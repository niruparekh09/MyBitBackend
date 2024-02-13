package com.app.service;

import com.app.dto.EmployeeInsertRequest;
import com.app.dto.EmployeeLoginRequest;
import com.app.dto.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> findAllEmployees();

    EmployeeResponse findEmployeeById(String id);

    EmployeeResponse login(EmployeeLoginRequest request);

    EmployeeResponse addEmployee(EmployeeInsertRequest newEmployee);
}
