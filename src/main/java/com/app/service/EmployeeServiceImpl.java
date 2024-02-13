package com.app.service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.EmployeeInsertRequest;
import com.app.dto.EmployeeLoginRequest;
import com.app.dto.EmployeeResponse;
import com.app.enities.Employee;
import com.app.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<EmployeeResponse> findAllEmployees() {
        List<Employee> empList = empRepo.findAll();
        EmployeeResponse resp = mapper.map(empList, EmployeeResponse.class);
        return null;
    }

    @Override
    public EmployeeResponse findEmployeeById(String id) {
        return null;
    }

    @Override
    public EmployeeResponse login(EmployeeLoginRequest request) {
        Employee employee = empRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
                .orElseThrow(() -> new ResourceNotFoundException("Bad Credentials!"));
        /*EmployeeLoginResponse resp = new EmployeeLoginResponse(employee.getFirstName(), employee.getLastName(),
                employee.getCity(), employee.getSalary(), employee.getEmail(), employee.getDept());*/
        //Mapping from Entity to dto
        EmployeeResponse resp = mapper.map(employee, EmployeeResponse.class);
        return resp;
    }

    @Override
    public EmployeeResponse addEmployee(EmployeeInsertRequest newEmployee) {
        Employee newEmp = mapper.map(newEmployee, Employee.class);
        empRepo.save(newEmp);
        return mapper.map(newEmp, EmployeeResponse.class);
    }
}
