<template>
  <div class="gradebook">
     <div v-if="showGradebook"> 
        <div id="grading">
            <h1> Gradebook </h1>  
            <h2>Lesson 1: AI vs AI in Education</h2>
            <p> Answer: Sometimes people have similar logic and linguistic patterns AI resulting in a false positive </p>
            <p> Student: sharkdemo</p>
            <form>
            <div class="form-input-group">
              <label for="grade">Grade:</label>
              <input
                type="text"
                id="instructorComments"
                required
                autofocus
              />
            </div>
            <div class="button-container">
              
        
        <button class = "submit" button type="submit">Submit</button>
               </div>
            </form>
        </div>
     </div>
     <button id="gradebookbutton" v-if="showButton" @click="showGradebook = true, showButton=false" button type="Submit">Gradebook</button>
  </div>
</template>
<script>
export default {
  name: 'instructor-grade-card',
  data() {
    return {
      showGradebook: false,
      showButton: true
    };
  },
};
</script>
