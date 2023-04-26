<template>
  <div class="reportcard">
    <button v-if="showButton" type="button" v-on:click="getReportcard()">Show Grades</button>
    <div id="container" v-for="lesson in lessons" :key="lesson.lessonId">
      
      <h2>{{ lesson.LessonName }}</h2>
      <p> Grade: {{ lesson.instructorComments }}</p>
      
    </div>
   
      </div>
</template>


<script>
import CourseService from '../services/CourseService.js';
//new service for reportcards
export default {
  name: 'reportcard',
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
  }//create new method to pull from homework 
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