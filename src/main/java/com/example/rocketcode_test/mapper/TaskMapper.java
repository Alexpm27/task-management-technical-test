package com.example.rocketcode_test.mapper;

import com.example.rocketcode_test.persistence.model.Task;
import com.example.rocketcode_test.web.dto.request.TaskRequest;
import com.example.rocketcode_test.web.dto.response.TaskResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task toEntity(TaskRequest request){
        Task task = new Task();
        task.setName(request.getName());
        task.setDescription(request.getDescription());
        task.setStartDate(request.getStartDate());

        return task;
    }

    public TaskResponse toDto(Task task){
        return TaskResponse.builder()
                .id(task.getId())
                .name(task.getName())
                .description(task.getDescription())
                .startDate(task.getStartDate())
                .build();
    }

    public List<TaskResponse> toDtoList(List<Task> tasks){
        return tasks.stream()
                .map(this::toDto)
                .collect(Collectors.toList());

    }
}
