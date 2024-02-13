package com.app.controller;

import com.app.dto.DepartmentResponse;
import com.app.dto.EmployeeInsertRequest;
import com.app.dto.EmployeeResponse;
import com.app.service.DepartmentService;
import com.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
// For Tightly coupled link. you can use @RequestMapping("/employee/{employeeId}")
// Here The Frontend will have to give a employeeId for the below mappings to work
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    //Implicit Contr. based D.I.
    /*public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }*/

    @Autowired
    DepartmentService deptService;

    @GetMapping("/list")
    public ResponseEntity<?> getEmployeeList() {
        List<EmployeeResponse> empList = empService.findAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(empList);
    }

    @GetMapping("/add")
    public ResponseEntity<?> addEmployeeForm() {
        List<DepartmentResponse> deptList = deptService.findAllDepartment();
        return ResponseEntity.ok(deptList);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody @Valid EmployeeInsertRequest newEmployee) {
        EmployeeResponse resp = empService.addEmployee(newEmployee);
        return ResponseEntity.status(HttpStatus.OK).body(resp);
    }
}
