package com.techelevator.model;

public class Lesson {

    private int lessonId;
    private int courseId;
    private String lessonName;
    private String lessonText;
    private String homeworkProblem;


    public int getLessonId(){
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getLessonName(){
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonText(){
        return lessonText;
    }

    public void setLessonText(String lessonText){
        this.lessonText = lessonText;
    }

    public String getHomeworkProblem(){
        return homeworkProblem;
    }

    public void setHomeworkProblem(String homeworkProblem){
        this.homeworkProblem = homeworkProblem;
    }

}
