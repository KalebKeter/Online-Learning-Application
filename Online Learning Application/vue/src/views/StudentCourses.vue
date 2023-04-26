<template>
  <div class="student">
    <h1>Student Dashboard</h1>
    <div id=student-lesson>
     <router-link :to="{ name: 'student-lesson' }">
        <button class = "enroll" button type="submit">View Your Lessons</button>
        
      </router-link>
    </div>
  </div>

</template>
<style scoped>
#student-lesson {
    position: fixed;
  left: 50%;
  transform: translateX(-50%);
}
</style>


<script>

    

</script>

