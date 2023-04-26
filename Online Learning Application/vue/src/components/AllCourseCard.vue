<template>
  <div class="instructor-card">
    <button v-if="showButton" type="button" v-on:click="getCourses()">Load Courses</button>
    <div id="container" v-for="course in courses" :key="course.courseId">
      
      <h2>{{ course.courseName }}</h2>
      <p> Description: {{ course.courseDescription }}</p>
      <p> Price: {{ course.price }}</p>
      <p> Difficulty Level: {{ course.difficultyLevel }}</p>
        <div class="button-container">
     <router-link :to="{ name: 'instructor-lesson' }">
        <button class = "view" button type="button">View Course </button>
      </router-link>
    </div>
   
      </div>
  </div>
</template>


<script>
import CourseService from '../services/CourseService.js';

export default {
  name: 'instructor-card',
  data() {
    return {
      courses: [],
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
 