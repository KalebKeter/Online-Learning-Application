<template>
  <div class="student">
    <h1>Student Dashboard</h1>
    
    <div id="student-container">
        <student-enroll-course-card/>
        <student-courses/>
       

         <router-link :to="{ name: 'reportcard' }">
        <button class ="classes" button type="submit">View Your Report Card</button> 

      </router-link>
    </div> 
  </div>
</template>



<script>
import StudentEnrollCourseCard from "../components/StudentEnrollCourseCard.vue";
import StudentCourses from "../components/StudentCourses.vue";

export default {
  components: {
  
    StudentEnrollCourseCard,
    StudentCourses
    
  },
};

</script>

<style>
#student-container {
  display:flex;
  justify-content: space-evenly;

}

.classes  {
   background-color: black;
 font-size: 30px;
 font-weight: 700;
 color: greenyellow;
 width: 350px;
 height: auto;
}
.classes:hover {
background-color:greenyellow;
color: black;
}

</style>