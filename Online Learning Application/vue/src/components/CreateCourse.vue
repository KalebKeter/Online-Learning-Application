<template>
      <div id="form">
   <form v-on:submit="handleSubmit">
        <h1>Create New Course</h1>
        <div class="form-input-group">
          <label for="name">Course Name</label>
          <input
            type="text"
            id="courseName"
            v-model="course.courseName"
            required
            autofocus
          />
        </div>
        <div class="form-input-group">
          <label for="description">Description</label>
          <input
            type="text"
            id="description"
            v-model="course.courseDescription"
            required
          />
        </div>
        <div class="form-input-group">
          <label for="difficulty"> Difficulty (1-5) </label>
          <input
            type="text"
            id="difficulty"
            v-model="course.difficultyLevel"
            required
          />
        </div>
        <div class="form-input-group">
          <label for="price">Price</label>
          <input type="text" id="price" v-model="course.price" required />
        </div>
        <div class="form-input-group">
          <label for="startdate">Start Date</label>
          <input type="text" id="startdate" v-model="course.startDate" />
        </div>
         <div class="form-input-group">
          <label for="enddate">End Date</label>
          <input type="text" id="enddate" v-model="course.endDate" />
        </div>
        <h3>Lesson Contents</h3>
        <div class="form-input-group">
    <label for="lessonname">Lesson Name</label>
    <input type="text" id="lessonname" v-model="course.lessonName" required />
    </div>
         <div class="form-input-group">
          <label for="reading">Reading</label>
          <input type="text" id="reading" v-model="course.reading" required />
        </div>
         <div class="form-input-group">
          <label for="homework">Homework Problem</label>
          <input type="text" id="homework" v-model="course.homeworkProblem" required />
        </div>
        <button type="submit">Save</button>
        
 
      </form>
      </div>
    <!-- </div>
  </div> -->
</template>
<script>
import InstructorService from "../services/InstructorService.js"
export default {
    name: 'create-course',
  data() {
    return {
      course: {
          courseId: 0,
        userId: "",
        courseName: "",
        courseDescription: "",
        difficultyLevel: "",
        price: "",
        startDate: "",
        endDate: "",
        lessonName: "",
        reading: "",
        homeworkProblem: ""
      },
      
      // userId: 1, // Replace with the actual logged-in user ID
    };
  },
  methods: {
    handleSubmit() {
      // Set the logged-in user's ID
       this.course.userId = this.userId;
      // Send form data to backend using CourseService
      console.log(this.courseId);
      InstructorService
        .createCourse(this.course)
        .then((response) => {
           if (response.status === 201) {
               alert("SUCCESS: Course Created");
            this.$router.push("/");
          }
        })
        .catch((error) => {
          console.error(error);
        });
    },
  },
  created() {
    this.courseId = parseInt(this.$route.params.id);
  }
};
</script>









