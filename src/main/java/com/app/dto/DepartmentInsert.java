package com.app.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentInsert {

    @NotBlank(message = "You can't keep Dept. name empty")
    private String name;
}
