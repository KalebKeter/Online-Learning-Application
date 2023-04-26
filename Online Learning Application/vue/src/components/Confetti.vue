<template>
  <main>
    <button @click="start">Start</button>
    <button @click="stop">Stop</button>
    <button @click="love">Show some love</button>
  </main>
</template>

<script>
  import Vue from 'vue'
  import VueConfetti from 'vue-confetti'

  Vue.use(VueConfetti)

  export default {
    methods: {
      created() {
        this.$confetti.start();
     
        
      }
    }
  }
</script>