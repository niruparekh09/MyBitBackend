package com.app.enities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Announcement {
    @Id
    private String id;
    @NotNull(message = "Announcement Can Not Be Null")
    private String announcement;
    @NotNull(message = "Date Cannot Be Null")
    private String date;
}
