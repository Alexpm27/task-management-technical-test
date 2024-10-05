package com.example.rocketcode_test.web.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Setter @Getter
public class TaskResponse {
    private Long id;

    private String name;

    private String description;

    private LocalDate startDate;
}
