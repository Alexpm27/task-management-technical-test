package com.example.rocketcode_test.controller;

import com.example.rocketcode_test.persistence.model.Task;
import com.example.rocketcode_test.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String createTask(@ModelAttribute Task task) {
        taskService.save(task);
        return "redirect:/task-list";
    }

    @GetMapping("/task-list")
    public String listTasks(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }
}
