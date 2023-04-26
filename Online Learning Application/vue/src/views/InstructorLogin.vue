<template>
  <div id="instructorlogin">
    <form @submit.prevent="login">
      <h1 >Instructor Login</h1>
      <div role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <div role="alert" v-if="this.$route.query.registration">
        Thank you for registering, please sign in.
      </div>
      <div class="form-input-group">
        <label for="username">Email</label>
        <input type="email" id="email" v-model="user.username" required autofocus />
      </div>
      <div class="form-input-group">
        <label for="password">Password</label>
        <input type="password" id="password" v-model="user.password" required />
      </div>
        <router-link :to="{ name: 'instructor' }">
      <button type="submit">Sign in</button>
        </router-link>
      <p>
      <router-link :to="{ name: 'instructor-register' }">Need an account? Sign up.</router-link></p>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>


<style scoped>
#instructorlogin {
  margin-bottom: 1.5rem;
  display:flex;
  justify-content: center;
    padding: 10px;
    align-items: center;


}

 #instructorlogin .form-input-group {
  margin-bottom: 1.5rem;
  flex-direction: column;
  display: flex;

}
label {
  margin-right: 0.5rem;

}
</style>
