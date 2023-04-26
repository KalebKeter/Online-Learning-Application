import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {

  getAllCourses() {
    return http.get('/courses');
  },

  addCourse(id,course) {
    return http.post('/courses/instructor/{id}',course);
  }
  
  // getCourseByInstructorId(id){
  //   return http.get('/instructor/${id}/course');
  // } 

}
