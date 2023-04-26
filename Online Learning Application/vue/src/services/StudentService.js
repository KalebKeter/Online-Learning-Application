import axios from 'axios';
const http = axios.create({
  baseURL: "http://localhost:9000",
  headers: {
    "Authorization": "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MjM5MzYzNn0.WCPdZR7IY4qIN4-F3TOQ-SKSt43jUGsRyDiG6KwXHGOpOBc8IOdHvwkyzNtcNMb-lN2SmqVxOw40Zv1QqLu0Fg",
  },
});
export default {

  getAllCourses() {
    return http.get('/courses');
  },
    getAllCoursesForStudent() {
        return http.get('/course');
      },
    
      createCourse(course) {
        return http.post(`/courses`,course);
      },
      
      getInstructorGradebook(){
        return http.get('instructor/courses/gradebook');
      },
      getStudentGradebook(){
        return http.get('student/gradebook');
      },
      getLessons(lesson) {
        return http.get(`/lesson/`, lesson)
      },
    
      addLesson(lesson) {
        return http.post('/courses/lesson', lesson);
      },
      addHomework(homework) {
        return http.post('/gradebook/create', homework);
      },
    
      updateGrade(homework) {
        return http.post('/gradebook/update', homework)
      },
      getReportCardByUserId(id){
        return http.get(`/user/${id}/reports`);
      },
    
      getReportCardsbyCourseId(id){
        return http.get(`/course/${id}/reports`)
      }
    }
    
  
