package com.app.enities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Department_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
public class Department extends BaseEntity {
    @NotBlank(message = "Name of the Department Can't be null Can Be Null")
    @Column(name = "Department_Name")
    private String name;
    @OneToMany(mappedBy = "dept",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<Employee> employees = new ArrayList<>();
}
