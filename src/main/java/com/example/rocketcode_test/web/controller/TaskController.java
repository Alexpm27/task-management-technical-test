package com.example.rocketcode_test.web.controller;

import com.example.rocketcode_test.service.ITaskService;
import com.example.rocketcode_test.web.dto.request.TaskRequest;
import com.example.rocketcode_test.web.dto.response.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class TaskController {
    @Autowired
    private ITaskService taskService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/task-create")
    public String createTaskForm() {
        return "task-create";
    }

    @PostMapping("/task-create")
    public String createTask(@Valid @ModelAttribute TaskRequest request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().get(0).getDefaultMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "task-create";
        }
        taskService.create(request);
        return "redirect:/task-list";
    }

    @GetMapping("/task-list")
    public String listTasks(Model model) {
        List<TaskResponse> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }
}
