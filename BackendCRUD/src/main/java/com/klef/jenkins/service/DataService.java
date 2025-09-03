package com.klef.jenkins.service;

import com.klef.jenkins.dao.DataDao;
import com.klef.jenkins.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {
    
    @Autowired
    private DataDao dataDao;
    
    public User saveUser(User user) {
        return dataDao.save(user);
    }
    
    public List<User> getAllUsers() {
        return dataDao.findAll();
    }
    
    public User getUserById(Long id) {
        Optional<User> user = dataDao.findById(id);
        return user.orElse(null);
    }
    
    public User updateUser(User user) {
        return dataDao.save(user);
    }
    
    public void deleteUser(Long id) {
        dataDao.deleteById(id);
    }
}
