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
    private ITaskRepository mapper;
    @Override
    public int save(Task task) {
        return mapper.save(task);
    }

    @Override
    public int update(int id, Task task) {
        task.setId(id);
        return mapper.update(task);
    }

    @Override
    public List<Task> findAll() {
        return mapper.findAll();
    }

    @Override
    public Task findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }
}
