package com.techelevator.dao;

import com.techelevator.model.Homework;
import com.techelevator.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcHomeworkDao implements HomeworkDao {
    
        public JdbcTemplate jdbcTemplate;
        public Homework homework = new Homework();
        public User user = new User();
        UserDao userDao;
        
        public JdbcHomeworkDao(JdbcTemplate jdbcTemplate, UserDao userDao) {
            this.jdbcTemplate = jdbcTemplate;
            this.userDao = userDao;
        }
    @Override
    public List<Homework> displayAllNeedsGradedToInstructor() {
        List<Homework> homeworks = new ArrayList<>();
        String sql = "SELECT * FROM homework WHERE instructor_comments = '' AND graded_status = 'in progress';";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
            Homework homeworkList = mapRowToHomework(results);
            homeworks.add(homeworkList);
        }
        return homeworks;
    }

    @Override
    public List<Homework> displayGradebookForAllCoursesCreatedByThisInstructor(Principal principal) {
        int id = userDao.findIdByUsername(principal.getName());
        List<Homework> homeworks = new ArrayList<>();
        String sql = "SELECT * FROM homework JOIN courses ON homework.course_id = courses.course_id WHERE courses.user_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);

        while (results.next()) {
            Homework homeworkList = mapRowToHomework(results);
            homeworks.add(homeworkList);
        }
        return homeworks;
    }
    @Override
    public List<Homework> displayUserGradeBook(Principal principal) {
        int id = userDao.findIdByUsername(principal.getName());
        List<Homework> homeworks = new ArrayList<>();
        String sql = "SELECT * FROM homework WHERE user_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);

        while (results.next()) {
            Homework homeworkList = mapRowToHomework(results);
            homeworks.add(homeworkList);
        }
        return homeworks;
    }
    @Override
    public void updateGradebookAsInstructor(Homework updatedHomework, int id) {
        String sql = "INSERT INTO homework (graded_status, instructor_comments) VALUES (?, ?) WHERE homework_id = ? ";

        jdbcTemplate.update(sql, updatedHomework.getGradedStatus(), updatedHomework.getInstructorComments());
    }

    @Override
    public boolean createGradebookForUser(Homework homework, Principal principal){
        Integer id = userDao.findIdByUsername(principal.getName());
        String name = principal.getName();
        String sql = "INSERT INTO homework (course_id, user_id, user_name, graded_status) " +
                "VALUES(?, ?, ?, ?) RETURNING homework_id;";
        Integer homeworkId;
        String status = "in progress";
        homeworkId = jdbcTemplate.queryForObject(sql, Integer.class, homework.getCourseId(), id, name, status);

        if (homeworkId == null) {
            return false;
        } else {
            return true;
        }
    }

    private Homework mapRowToHomework(SqlRowSet rs) {
        Homework homework = new Homework();
        homework.setHomeworkId(rs.getInt("homework_id"));
        homework.setCourseId(rs.getInt("course_id"));
        homework.setUserId(rs.getInt("user_id"));
        homework.setUserName(rs.getString("user_name"));
        homework.setUserAnswer(rs.getString("user_answer"));
        homework.setGradedStatus(rs.getString("graded_status"));
        homework.setInstructorComments(rs.getString("instructor_comments"));

        return homework;
    }
}

