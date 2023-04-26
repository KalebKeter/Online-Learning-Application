package com.techelevator.dao;

import com.techelevator.model.Course;
import com.techelevator.model.Homework;
import com.techelevator.model.ReportCard;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

public interface CourseDAO {

    public List<Course> displayAllCourses();

    public List<Course> findCoursesByUserId(int id);

    public boolean createCourse(Course course, Principal principal);
    public List<Course> displayUserCourses(Principal principal);
}
