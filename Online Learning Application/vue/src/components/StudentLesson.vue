<template>
  <div class="lessoncard">
    <button v-if="showButton" type="button" v-on:click="getLessons()">Show Assignments</button>
    <div id="container" v-for="lesson in lessons" :key="lesson.lessonId">
      
      <h2>{{ lesson.lessonName }}</h2>
      <p> Reading: {{ lesson.readingAssignment }}</p>
      <p> Assignment: {{ lesson.homeworkProblem }}</p>
        <form>
          <div class="form-input-group">
          <label for="answer">Answer: </label>
          <input type="text" id="answer" v-model="homework.homeworkAnswer" required />
        </div>
        <router-link> 
        <button class="create" type="submit">Submit Answer</button>
        </router-link>

      </form>
    </div>
   
    </div>
</template>


<script>
import CourseService from '../services/CourseService.js';

export default {
  name: 'lessoncard',
  data() {
    return {
      lessons: [],
         showButton: true
    }
  
  },
  methods: {
    getCourses() {
      CourseService.getAllCourses()
        .then(response => {
        console.log(response.data)
        this.courses = response.data;
              this.showButton = false;

        })
        .catch(error => {
          console.log(error);
        });
    }
  }
}
</script>



<style>

.card {
  display: flex;
  align-items: center;
  justify-content: center;
}

#container {
  background-color: black;
 
  width: 300px;
 
  margin-bottom: 20px;
  padding: 10px;
 margin-left: 30px;
 flex-direction: row;
}

#container h2 {
display:flex;
 align-content: center;
  justify-content: center;
}







</style>