package com.example.rocketcode_test.service;

import com.example.rocketcode_test.persistence.model.Task;

import java.util.List;

public interface ITaskService {
    int save(Task task);

    int update(int id, Task task);

    List<Task> findAll();

    Task findById(int id);

    int deleteById(int id);
}
