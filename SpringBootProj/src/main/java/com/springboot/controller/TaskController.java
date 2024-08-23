package com.springboot.controller;


import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.DAO.TaskRepository;
import com.springboot.Model.Task;

@RestController
public class TaskController {
	
	@Autowired
    private TaskRepository taskRepository;

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
    @GetMapping("/tasks/due/{date}")
    public List<Task> getTasksDueOn(@PathVariable LocalDate date) {
        return taskRepository.findByDueDate(date);
    }
}
