<template>
  <div class="lessoncard">
    <h1>Your Courses</h1>
    <div id="container" v-for="course in courses" :key="course.courseId">
      <h2>{{ course.courseName }}</h2>
      <p>Course Description: {{ course.courseDescription }}</p>
      <p>Price: {{ course.price }}</p>
      <p>Difficulty Level: {{ course.difficultyLevel }}</p>

      <router-link :to="{ name: 'student-lesson' }">
        <button
          class="go-to-course"
          button
          type="submit"
          v-on:click="handleClick(course.courseId)"
        >
          Go To Course
        </button>
      </router-link>
    </div>
  </div>
</template>
<script>
import StudentService from "../services/StudentService";
export default {
  name: "studentcoursecard",
  data() {
    return {
      courses: [],
      course: {
        courseName: "",
        courseDescription: "",
       difficultyLevel: "",
       price: "",
     },
    };
  },
  created() {
    this.getCourses();
  },
  methods: {
    getCourses() {
      StudentService.getAllCoursesForStudent()
        .then((response) => {
          console.log(response.data);
          this.courses = response.data;
          this.showButton = false;
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
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
button {
  align-items: center;
}
#container h2 {
  display: flex;
  align-content: center;
  justify-content: center;
}
</style>



















