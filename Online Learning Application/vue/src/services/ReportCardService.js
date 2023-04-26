import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {

    
  getReportCardByUserId(id){
    return http.get(`/user/${id}/reports`);
  },

  getReportCardsbyCourseId(id){
    return http.get(`/course/${id}/reports`)
  }
}
