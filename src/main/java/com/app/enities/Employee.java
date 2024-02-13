package com.app.enities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Employee_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Employee extends BaseEntity {

    @NotBlank(message = "First Name Can't be Empty")
    @Column(name = "FirstName", nullable = false, length = 20)
    private String firstName;
    @NotBlank(message = "Last Name Can't be Empty")
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;
    @NotBlank(message = "City Can't be Empty")
    @Column(name = "City", nullable = false, length = 20)
    private String city;
    @NotBlank(message = "Salary Can't Be Empty")
    @Column(name = "Salary", nullable = false, length = 20)
    private BigDecimal salary;
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email can't be Empty")
    @Column(name = "Email", unique = true, nullable = false)
    private String email;
    @NotBlank(message = "Password is Required")
    private String password;
    @ManyToOne
    @JoinColumn(name = "Dept_ID")
    private Department dept;
}
