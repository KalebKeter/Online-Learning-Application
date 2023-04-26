
package com.techelevator.model;

public class Homework {

        private int homeworkId;
//        private int lessonId;
        private int courseId;
        private int userId;
        private String userName;
        private String userAnswer;
        private String gradedStatus;
        private String instructorComments;


        public int getHomeworkId(){
            return homeworkId;
        }

        public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
    }

//        public int getLessonId(){
//        return lessonId;
//    }
//
//        public void setLessonId(int lessonId) {
//        this.lessonId = lessonId;
//    }

        public int getCourseId(){
        return courseId;
    }

        public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

        public int getUserId(){
        return userId;
    }

        public void setUserId(int userId) {
        this.userId = userId;
    }

        public String getUserName(){
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserAnswer(){
            return userAnswer;
        }

        public void setUserAnswer(String userAnswer){
            this.userAnswer = userAnswer;
        }

        public String getGradedStatus(){
        return gradedStatus;
    }

        public void setGradedStatus(String gradedStatus){
        this.gradedStatus = gradedStatus;
    }

        public String getInstructorComments(){
            return instructorComments;
        }

        public void setInstructorComments(String instructorComments){this.instructorComments = instructorComments;}

}