package com.klef.jenkins.controller;

import com.klef.jenkins.model.User;
import com.klef.jenkins.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class DataController {
    
    @Autowired
    private DataService dataService;
    
    @PostMapping
    public User createUser(@RequestBody User user) {
        return dataService.saveUser(user);
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        return dataService.getAllUsers();
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return dataService.getUserById(id);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return dataService.updateUser(user);
    }
    
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        dataService.deleteUser(id);
        return "User deleted successfully";
    }
}
