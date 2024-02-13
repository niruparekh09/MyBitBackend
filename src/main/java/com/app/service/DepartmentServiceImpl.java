package com.app.service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.DepartmentInsert;
import com.app.dto.DepartmentResponse;
import com.app.dto.EmployeesOfDepartment;
import com.app.enities.Department;
import com.app.enities.Employee;
import com.app.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository deptRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public DepartmentResponse findDepartment(String deptName) {
        Department dept = deptRepo.findByName(deptName)
                .orElseThrow(() -> new ResourceNotFoundException("No such Dept. Exists"));
        DepartmentResponse resp = mapper.map(dept, DepartmentResponse.class);
        return resp;
    }

    @Override
    public List<DepartmentResponse> findAllDepartment() {
        List<Department> deptList = deptRepo.findAll();
        List<DepartmentResponse> deptRespList = new ArrayList<>();/*mapper.map(deptList,DepartmentResponse.class)*/
        for (Department dept : deptList) {
            DepartmentResponse deptResp = new DepartmentResponse();
            deptResp.setName(dept.getName());
            deptResp.setEmployeeName(dept.getEmployees());
        }
        return deptRespList;
    }

    @Override
    public DepartmentInsert insertDepartment(DepartmentInsert newDepartment) {
        try {
            Department newDept = mapper.map(newDepartment, Department.class);
            deptRepo.save(newDept);
            return newDepartment;
        } catch (Exception e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    @Override
    public EmployeesOfDepartment findEmployeesByDepartment(String deptName) {
        Department dept = deptRepo.findByName(deptName) /*.findEmployeesByDepartmentName(deptName) using JPQL*/
                .orElseThrow(() -> new ResourceNotFoundException("Dept Not Found"));
        List<Employee> empList = dept.getEmployees();
        EmployeesOfDepartment employeesOfDepartment = new EmployeesOfDepartment();
        employeesOfDepartment.setEmployeeList(empList);
        return employeesOfDepartment;
    }
}
