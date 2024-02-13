package com.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString(exclude = "password")
public class EmployeeLoginRequest {
    @NotBlank(message = "Email can't be Empty")
    private String email;
    @NotBlank(message = "Password is Required")
    private String password;
}
