<template>
  <div class="welcome">
    <h1>Welcome to Tech Escalator</h1>
    <p></p>
        <course-list />
  </div>
</template>



<script>
import CourseList from "../components/StudentCourseList.vue";
export default {
  components: {
    CourseList,
  },
};
</script>

<style>


</style>