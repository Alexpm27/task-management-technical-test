package com.example.rocketcode_test.service;

import com.example.rocketcode_test.web.dto.request.TaskRequest;
import com.example.rocketcode_test.web.dto.response.TaskResponse;

import java.util.List;

public interface ITaskService {
    int create(TaskRequest task);

    int update(Long id, TaskRequest task);

    List<TaskResponse> findAll();

    TaskResponse findById(Long id);

    int deleteById(Long id);
}
