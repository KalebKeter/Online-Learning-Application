<template>
  <div class="course-container">
    <course-card v-bind:course="course" v-for="course in $store.state.courses" v-bind:key="course.id" />


  </div>
</template>

<script>
import CourseCard from './CourseCard.vue';


export default {
    name: 'cards',
    components: {
        CourseCard
        
    }
}
</script>

<style>
.course-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>