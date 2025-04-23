package com.br.taskmanager.service;

import com.br.taskmanager.model.User;
import com.br.taskmanager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    private UserRepository userRepository;

    //getAll
    public List<User> FindAllUser(){
        return userRepository.findAll();
    }
    //post
    public User CreateUser(User user){
        return userRepository.save(user);
    }
    //getById
    public Optional<User> FindUserById(Long id){
        return userRepository.findById(id);
    }
    //delete
    public void DeleteUser(Long id){
        userRepository.deleteById(id);
    }
}
