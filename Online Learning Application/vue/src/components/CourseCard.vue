<template>
  <div class="cards">
    <div id="container" v-for="course in courses" :key="course.courseId">
      <h2>{{ course.courseName }}</h2>
      <p> Description: {{ course.courseDescription }}</p>
      <p> Price: {{ course.price }}</p>
      <p> Difficulty Level: {{ course.difficultyLevel }}</p>
      <div class="button-container">
        <router-link :to="{ name: 'login' }">
          <button class="enroll" button type="submit">Login To Enroll</button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
import InstructorService from "../services/InstructorService.js"

export default {
  name: 'course-card',
  data() {
    return {
      courses: []
    }
  },
  created() {
    this.getCourses();
  },
  methods: {
    getCourses() {
      InstructorService.getAllCourses()
        .then(response => {
          console.log(response.data)
          this.courses = response.data;
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
}
</script>

<style>







</style>