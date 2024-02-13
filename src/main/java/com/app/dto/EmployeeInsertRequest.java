package com.app.dto;

import com.app.enities.Department;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInsertRequest {
    private String firstName;
    private String lastName;
    private String city;
    @DecimalMin(value = "1000", message = "Salary Can't Be Less Than 1000")
    @DecimalMax(value = "1000000", message = "Salary can't be more than 1000000")
    private BigDecimal salary;
    @NotBlank(message = "Email Can't be Blank")
    private String email;
    @NotBlank(message = "Password is Required")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private Department dept;
}