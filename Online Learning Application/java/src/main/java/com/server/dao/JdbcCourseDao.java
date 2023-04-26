package com.techelevator.dao;

import com.sun.security.auth.UserPrincipal;
import com.techelevator.model.Authority;
import com.techelevator.model.Course;
import com.techelevator.model.Homework;
import com.techelevator.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@Component
public class JdbcCourseDao implements CourseDAO {

    public JdbcTemplate jdbcTemplate;
    public Course course = new Course();
    public User user = new User();
    UserDao userDao;
    public JdbcCourseDao(JdbcTemplate jdbcTemplate, UserDao userDao) {
        this.jdbcTemplate = jdbcTemplate;
        this.userDao = userDao;
    }


@Override
    public List<Course> displayAllCourses() {
        List<Course> courses = new ArrayList<>();

        String sql = "SELECT * FROM courses";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            Course course = mapRowToCourse(results);
            courses.add(course);

        }
        return courses;
    }

    @Override
    public List<Course> displayUserCourses(Principal principal) {
        int id = userDao.findIdByUsername(principal.getName());
        List<Course> courses = new ArrayList<>();
        String sql = "select * from courses join homework on courses.course_id = homework.course_id where homework.user_id = ? ;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);

        while (results.next()) {
            Course courseList = mapRowToCourse(results);
            courses.add(courseList);
        }
        return courses;
    }

    @Override
    public List<Course> findCoursesByUserId(int id) {

        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses WHERE user_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);

        while (results.next()) {
            Course course = mapRowToCourse(results);
            courses.add(course);

        }
        return courses;
    }

    @Override
    public boolean createCourse(Course course, Principal principal){
        Integer id = userDao.findIdByUsername(principal.getName());
        String sql = "INSERT INTO courses (user_id, course_name, course_description, difficulty_level, price, start_date, end_date, lesson_name, reading, homework_problem) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING course_id;";

        Integer courseId;

        courseId = jdbcTemplate.queryForObject(sql, Integer.class, id, course.getCourseName(), course.getCourseDescription(), course.getDifficultyLevel(), course.getPrice(), course.getStartDate(), course.getEndDate(), course.getLessonName(), course.getReading(), course.getHomeworkProblem());

        if (courseId == null) {
            return false;
        } else {
            return true;
        }
    }



    private Course mapRowToCourse(SqlRowSet rs) {
        Course course = new Course();
        course.setCourseId(rs.getInt("course_id"));
        course.setUserId(rs.getInt("user_id"));
        course.setCourseName(rs.getString("course_name"));
        course.setCourseDescription(rs.getString("course_description"));
        course.setDifficultyLevel(rs.getString("difficulty_level"));
        course.setPrice(rs.getInt("price"));
        course.setStartDate(rs.getString("start_date"));
        course.setEndDate(rs.getString("end_date"));
        course.setLessonName(rs.getString("lesson_name"));
        course.setReading(rs.getString("reading"));
        course.setEndDate(rs.getString("homework_problem"));

        return course;
    }
}




