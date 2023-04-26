<template>
  <div class="home">
    <h1>Course List</h1>
    <div id="cards">
        <course-card />
  </div>
  </div>
</template>
<script>
import CourseCard from "../components/CourseCard.vue"
export default {
  components: {
    CourseCard,
  },
};
</script>
<style>

#cards {
 display:flex;
 justify-content: center;
}


</style>