package com.techelevator.model;

import java.sql.Date;
import java.time.LocalDate;

public class Course {
    private int courseId;
    private int userId;
    private String courseName;
    private String courseDescription;
    private String difficultyLevel;
    public int price;
    private String startDate;
    private String endDate;
    private String lessonName;
    private String reading;
    private String homeworkProblem;

    public Course() {
//        courseId = 0;
//        userId = 0;
//        courseName = "";
//        courseDescription = "";
//        difficultyLevel = "";
//        price = 0;
//        startDate =String.now();
//        endDate = startDate.plusDays(30);
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReading() {return reading;}
    public void setReading(String reading) {this.reading = reading;}

    public String getHomeworkProblem(){
        return homeworkProblem;
    }

    public void setHomeworkProblem(String homeworkProblem) {
        this.homeworkProblem = homeworkProblem;
    }

    public String getLessonName() {return lessonName;}

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }


}
