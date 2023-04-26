import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if(currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    courses: [
      {
        id: "1",
        title: "How to Google like a Pro",
        instructor: "name here",
        image: "/images/googling.png",
        read: false,
        // isbn: "9781784877989",
        description: "gere",
        price: "free",
        difficulty: 0,
      },
      {
        id: "2",
        title: "Hacking 101",
        instructor: "M.R. Carey",
        image: "/images/hacker.png",
        read: true,
        // isbn: "9780356500157",
        description: "gergr",
        price: "free",
        difficulty: 0,

      },
      {
        id: "3",
        title: "How to Survive the AI Apocalypse",
        instructor: "Ernest Hemingway",
        image: "/images/apocalypse.png",
        read: true,
        // isbn: "9780684830490",
        description: "gerger",
        // students: [
        //   {
        //     fullName: "Hannah Scott",
        //     username: "hannahbanana"
        //   }
        // ]
        price: "free",
        difficulty: 0,
      },
      {
        id: "4",
        title: "Are you Dating a Robot?",
        instructor: "M.R. Carey",
        image: "/images/dating.png",
        read: true,
        // isbn: "9780356500157",
        description: "ewgerg",
        price: "free",
        difficulty: 0,

      }
    ],

    token: currentToken || '',
    user: currentUser || {}
  },
  mutations: {
    LOAD_SITES(state, sites) {
      state.sites = sites
    },
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user',JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    },

      ADD_COURSE(state, course) {
        state.courses.unshift(course);
      },
  }
})
