package com.example.rocketcode_test.service.Impl;

import com.example.rocketcode_test.persistence.repository.ITaskRepository;
import com.example.rocketcode_test.persistence.model.Task;
import com.example.rocketcode_test.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private ITaskRepository repository;
    @Override
    public int save(Task task) {
        return repository.save(task);
    }

    @Override
    public int update(int id, Task task) {
        task.setId(id);
        return repository.update(task);
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }

    @Override
    public Task findById(int id) {
        return repository.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return repository.deleteById(id);
    }
}
