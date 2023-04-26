<template>
  <div class ="student gradebook">
    <h1>Student Gradebook</h1>
    <table>
      <thead>
        <tr>
          <th>User Id</th>
          <th>Lesson Id </th>
          <th> Homework Id </th>
          <th>Course Id </th>
          <th> Username </th>
          <th> User Answer </th>
          <th>Grade</th>
          <th>Instructor Comments </th>
        </tr>
      </thead>
      
      <tbody>
        <tr v-for="(gradebook, index) in gradebooks" :key="index">
          <td>{{gradebook.userId}}</td>
          <td>{{gradebook.lessonId}}</td>
          <td> {{gradebook.homeworkId}}</td>
          <td> {{gradebook.courseId}} </td>
          <td> {{gradebook.username}} </td>
          <td>  {{gradebook.grade}} </td>
          <td> {{gradebook.gradedStatus}} </td>
          <td> {{gradebook.instructorComments}} </td>
        </tr>
      </tbody>
    </table>
    </div>
</template>

<script>
import courseService from "../services/CourseService";
export default {
  name: 'Gradebook',
  data() {
    return {
      gradebooks: [],
         showButton: true
    }
  },  
  methods: {
    created() {
      courseService.getGradebook()
        .then(response => {
        console.log(response.data)
        this.gradebook = response.data;

        })
        .catch(error => {
          console.log(error);
        });
    },
  }
};   
</script>

<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th,
td {
  text-align: left;
  padding: 8px;
}

tr:hover {
  background-color: #ddd;
}

td.grade {
  font-weight: bold;
}

td.passed {
  color: green;
}

td.failed {
  color: red;
}
.form-input-group {
  margin-bottom: 1.5rem;
}
label {
  margin-right: 0.5rem;
}
</style>