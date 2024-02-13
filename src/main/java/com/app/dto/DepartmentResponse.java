package com.app.dto;

import com.app.enities.Employee;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
public class DepartmentResponse {

    @NotBlank(message = "Name of the Department Be Blank")
    private String name;
    private List<Employee> employeeName = new ArrayList<>();

}
