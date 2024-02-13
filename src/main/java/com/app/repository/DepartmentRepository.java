package com.app.repository;

import com.app.enities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByName(String name);

   /* @Query("SELECT d FROM Department d JOIN FETCH d.employees WHERE d.name = :deptName")
    Optional<Department> findEmployeesByDepartmentName(@Param("deptName") String deptName);*/

    /*If you don't want to change the FetchType to EAGER, you can still fetch the employees of a department without
    encountering a LazyInitializationException. One common approach is to use the JOIN FETCH keyword in a JPQL query
    or Criteria API query to eagerly fetch the associated entities along with the main entity. This way, you can control
    when and how the associated entities are fetched.*/
}
