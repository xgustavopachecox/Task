package com.br.taskmanager.controller;

import com.br.taskmanager.model.Task;
import com.br.taskmanager.model.User;
import com.br.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> FindAll(){
        return taskService.FindAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> FindById(@PathVariable Long id) {
        return taskService.FindById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Task CreateTask(@RequestBody Task task){
        return taskService.CreateTask(task);
    }
    @DeleteMapping("/{id}")
    public void DeleteTask(@PathVariable Long id) {
        taskService.DeleteTask(id);
    }
}
