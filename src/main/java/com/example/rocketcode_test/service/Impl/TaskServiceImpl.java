package com.example.rocketcode_test.service.Impl;

import com.example.rocketcode_test.mapper.TaskMapper;
import com.example.rocketcode_test.persistence.repository.ITaskRepository;
import com.example.rocketcode_test.persistence.model.Task;
import com.example.rocketcode_test.service.ITaskService;
import com.example.rocketcode_test.web.dto.request.TaskRequest;
import com.example.rocketcode_test.web.dto.response.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private ITaskRepository repository;

    @Autowired
    private TaskMapper taskMapper;

    @Override
    @Transactional
    public int create(TaskRequest request) {
        return repository.save(taskMapper.toEntity(request));
    }

    @Override
    @Transactional
    public int update(Long id, TaskRequest request) {
        Task taskRequest = taskMapper.toEntity(request);
        taskRequest.setId(id);
        return repository.update(taskRequest);
    }

    @Override
    public List<TaskResponse> findAll() {
        return taskMapper.toDtoList(repository.findAll());
    }

    @Override
    public TaskResponse findById(Long id) {
        return taskMapper.toDto(repository.findById(id));
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        return repository.deleteById(id);
    }
}
