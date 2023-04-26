package com.techelevator.model;

public class ReportCard {
        private int reportId;
        private int userId;
        private String courseName;
        private int courseId;
        private String courseStatus;
        private int instructorId;

        public ReportCard(){}

        public ReportCard(int reportId, int userId, String courseName, int courseId, String courseStatus, int completed, int instructorId) {
            this.reportId = reportId;
            this.userId = userId;
            this.courseName = courseName;
            this.courseId = courseId;
            this.courseStatus = courseStatus;
            this.instructorId = instructorId;
        }

        public int getReportId(){
            return reportId;
        }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getinstructorId() {
            return instructorId;
        }

        public void setinstructorId(int instructorId) {
            this.instructorId = instructorId;
        }


}

