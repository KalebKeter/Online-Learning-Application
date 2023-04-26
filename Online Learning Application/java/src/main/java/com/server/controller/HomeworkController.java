package com.techelevator.controller;

import com.techelevator.dao.*;
import com.techelevator.model.Course;
import com.techelevator.model.Homework;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;


@CrossOrigin
@PreAuthorize("isAuthenticated()")
@RestController
public class HomeworkController {

    public JdbcHomeworkDao homeworkDao;

    public HomeworkController(JdbcHomeworkDao homeworkDao) {
        this.homeworkDao = homeworkDao;
    }

    @RequestMapping(path = "student/gradebook", method = RequestMethod.GET)
    public List<Homework> gradebookForUser(Principal principal) {
        return homeworkDao.displayUserGradeBook(principal);
    }

    @RequestMapping(path = "instructor/gradebook", method = RequestMethod.GET)
    public List<Homework> studentsNeedGraded() {
        return homeworkDao.displayAllNeedsGradedToInstructor();
    }

    @RequestMapping(path = "instructor/courses/gradebook", method = RequestMethod.GET)
    public List<Homework> allInstructorCoursesGradebook(Principal principal) {
        return homeworkDao.displayGradebookForAllCoursesCreatedByThisInstructor(principal);
    }

    @RequestMapping(path = "gradebook/create", method = RequestMethod.POST)
    public void createGradebookForUser(@RequestBody Homework homework, Principal principal) {
        homeworkDao.createGradebookForUser(homework, principal);
    }

    @RequestMapping(path = "gradebook/update", method = RequestMethod.POST)
    public void updateGradebookAsInstructor(@PathVariable int id, @RequestBody Homework homework) {
        homeworkDao.updateGradebookAsInstructor(homework, id);
    }
}
