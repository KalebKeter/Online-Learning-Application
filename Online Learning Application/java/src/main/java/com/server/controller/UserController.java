package com.techelevator.controller;

import com.techelevator.dao.JdbcUserDao;
import com.techelevator.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController{
private JdbcUserDao userDao;
    public UserController(JdbcUserDao userDao) {
            this.userDao = userDao;
        }
    @RequestMapping(path = "users", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
}
