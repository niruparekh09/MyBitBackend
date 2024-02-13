package com.app.service;

import com.app.dto.DepartmentInsert;
import com.app.dto.DepartmentResponse;
import com.app.dto.EmployeesOfDepartment;
import com.app.enities.Employee;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse findDepartment(String deptName);

    List<DepartmentResponse> findAllDepartment();

    DepartmentInsert insertDepartment(DepartmentInsert newDepartment);

    EmployeesOfDepartment findEmployeesByDepartment(String deptName);
 /* If you want to Change FetchType form Eager to Default i.e. Lazy. Use the below Query inside the DeptRepo
    @Query("SELECT d FROM Department d JOIN FETCH d.employees e WHERE d.name = :name")
    List<Department> findDepartmentWithEmployeesByName(@Param("name") String name);*/
}

/*
In case of getting populated list of Employee:

In your scenario, whether the getEmployeeByDepartment(String deptName) method returns a populated
list of employees depends on the way you configure the FetchType annotation in your entity and the
query you execute in your service layer. Here's a breakdown of the possibilities:

1. FetchType.LAZY:

This is the default setting for @OneToMany relationships.
No, the list won't be automatically populated. When you call getEmployeeByDepartment, your service
layer will execute a query to retrieve the Department object with the given name. However, it won't
automatically fetch the associated Employee objects unless you explicitly join them in your query.
You can use either JPA query methods (e.g., joinFetch) or Criteria API to explicitly perform a join
query and populate the employees list.

2. FetchType.EAGER:

If you set fetch = FetchType.EAGER on the employees relationship in your Department entity, the employees
list will be automatically populated whenever you retrieve the Department object, including in your
getEmployeeByDepartment method. However, be cautious with FetchType.EAGER, as it can negatively impact
performance if your departments have many associated employees. It might unnecessarily load a large
amount of data in one go.
*/
