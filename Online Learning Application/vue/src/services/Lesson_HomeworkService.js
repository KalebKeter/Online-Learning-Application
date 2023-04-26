import axios from 'axios';
const http = axios.create({
  baseURL: "http://localhost:9000",
  headers: {
    "Authorization": "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MjM5MzYzNn0.WCPdZR7IY4qIN4-F3TOQ-SKSt43jUGsRyDiG6KwXHGOpOBc8IOdHvwkyzNtcNMb-lN2SmqVxOw40Zv1QqLu0Fg",
  },
});
export default {
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
  }
}