<template>
  <table>
    <thead>
      <tr>
        <th>Course Title</th>
        <th>Instructor</th>
        <th>smth smth</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="course in $store.state.courses" v-bind:key="course.id">
        <td>{{ course.isbn }}</td>
        <td>
          <router-link v-bind:to="{ name: 'course-detail', params: { id: course.Title }   }">{{ course.Author }}</router-link>
        </td>
        <td>{{ course.id }}</td>
      </tr>
    </tbody>
  </table>
</template>
