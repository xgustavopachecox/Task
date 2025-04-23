package com.br.taskmanager.service;

import com.br.taskmanager.model.Task;
import com.br.taskmanager.model.User;
import com.br.taskmanager.repository.TaskRepository;
import com.br.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    //regra de negocio, aqui vamos puxar os dados do banco, sobre as task
    @Autowired
    private TaskRepository taskRepository;
    public List<Task>FindAll(){
        return taskRepository.findAll();
    }
    public Optional<Task>FindById(Long id){
        return taskRepository.findById(id);
    }
    public Task CreateTask(Task task){
        return taskRepository.save(task);
    }
    public void DeleteTask(Long id){
        taskRepository.deleteById(id);
    }


}
