<template>
  <div class="instructor">
    <h1>Instructor Dashboard</h1>
    
    <div class="container">
      <div id="new">
        <create-course />
     </div>
      <div id="grades">  
        <instructor-gradebook/>
        </div>
        </div>
  </div>
    
    
</template>

<script>
import CreateCourse from "../components/CreateCourse.vue"
import InstructorGradebook from '../components/InstructorGradebook.vue';

export default {
  components: {
    InstructorGradebook,
    CreateCourse,
    
    

  },
};
</script>


<style >




.container {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}

#grading {
  background-color: black;
  width: 600px;
  height: 300px;
    align-content: center;
  justify-content: center;
  margin-bottom: 20px;
  padding: 10px;
 margin-left: 30px;

}


 
 .gradebook #gradebookbutton {
    width: 250px;
    height: 50px;
     margin-top: 50px;
  padding: 10px;
 padding-right: 10px;
 
 background-color: greenyellow;
 font-size: 30px;
 font-weight: 700;
    
  }

#grading input{
  display: flex;
justify-content: center;
margin-top: 5px;
margin-bottom: 10px;
width: 200px;
}





  
#new {
  display:flex;
  background-color: black;
  width: 325px;
  align-content: center;
  justify-content: center;
  margin-bottom: 20px;
  padding: 10px;
 margin-left: -60px;
 flex-direction: row;

}
#new h1 {
text-align: center;
font-size: 25px;

}
#new input{
  display: flex;
justify-content: center;
margin-top: 5px;
margin-bottom: 10px;
}







#gradebookbutton:hover {
  background-color:black; 
  color: greenyellow;
}

#allcard {
  position: fixed;
  left: 50%;
  transform: translateX(-50%);
}
</style>