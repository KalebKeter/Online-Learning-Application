import axios from 'axios';

const http = axios.create({
//   add in URL for API quiz generator
  
    baseURL: ""
  
});

export default {

  getQuiz(apiName) {
    return http.get('/'+apiName);
  }
}
