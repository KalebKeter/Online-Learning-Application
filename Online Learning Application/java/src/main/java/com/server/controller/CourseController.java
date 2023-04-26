package com.techelevator.controller;

import com.techelevator.dao.JdbcCourseDao;
import com.techelevator.dao.JdbcUserDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Course;
import com.techelevator.model.Homework;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
@CrossOrigin
@PreAuthorize("isAuthenticated()")
@RestController
public class CourseController {

    public JdbcCourseDao courseDao;
    public UserDao userDao;
    public CourseController(JdbcCourseDao courseDao, JdbcUserDao userDao) {
        this.courseDao = courseDao;
        this.userDao = userDao;
    }


    //Get All Courses Regardless of Instructor ID or Student ID
    @RequestMapping(path = "courses", method = RequestMethod.GET)
    public List<Course> getCourses() {
        return courseDao.displayAllCourses();
    }

    //Get All Courses student is enrolled in
    @RequestMapping(path = "courses/user/{id}", method = RequestMethod.GET)
    public List<Course> getCoursesByUser(@PathVariable int id) {
        return courseDao.findCoursesByUserId(id);
    }

    @RequestMapping(path = "courses", method = RequestMethod.POST)
    public void createCourse(@RequestBody Course course, Principal principal) {
        courseDao.createCourse(course, principal);
    }

    //get courses for current user
    @RequestMapping(path = "course", method = RequestMethod.GET)
    public List<Course> coursesForThisUser(Principal principal) {
        return courseDao.displayUserCourses(principal);
    }
}