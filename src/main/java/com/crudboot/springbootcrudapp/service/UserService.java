package com.crudboot.springbootcrudapp.service;

import com.crudboot.springbootcrudapp.dao.UserDao;
import com.crudboot.springbootcrudapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(long id) {
        return userDao.findById(id).orElse(null);
    }

    public List<User> getUsers() {
        return userDao.findAll();
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public void deleteUser(long id) {
        userDao.deleteById(id);
    }
}
