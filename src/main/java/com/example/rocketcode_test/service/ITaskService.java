package com.example.rocketcode_test.service;

import com.example.rocketcode_test.persistence.model.Task;

import java.util.List;

public interface ITaskService {
    int save(Task task);

    int update(Long id, Task task);

    List<Task> findAll();

    Task findById(Long id);

    int deleteById(Long id);
}
