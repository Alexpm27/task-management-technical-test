package com.example.rocketcode_test.persistence.model;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long id;

    private String name;

    private String description;

    private LocalDate startDate;
}
