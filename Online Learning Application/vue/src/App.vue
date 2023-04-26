<template>
  <div class="app">
    <div id="nav">
      <a class="navbar-brand" >
        <img src="/images/squirrel.png" alt="Logo" />
      </a>

      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/login">Student Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/instructorlogin">Instructor Login</a>
            </li>

            <li class="nav-item">
              <a class="nav-link" href="/logout">Logout</a>
            </li>
          </ul>
        </div>
      
      </nav>
      <div id = "title">
          <img src="/images/title.png" alt= "title" />
          </div>
           
    </div>
    <router-view />
  </div>
</template>

<style>
a {
  color: greenyellow;
  font-family: "Fira Mono", monospace;
  font-weight: 300;
}

.app h1 {
  display: flex;
  align-items: center;
  justify-content: center;
}
#nav p {
  display: flex;
  align-content: center;
  justify-content: center;
  flex-grow: 1;
  text-align: center;
}
#nav img{
  height: 150px;
  
}

/* Add a black background color to the top navigation */
#nav {
 background-color: black;
  display: flex;
  align-items: center;
  height: 200px;
  
}

/* Change the color of links on hover */
#nav a:hover {
  background-color: black;
  color: white;
}

/* Add a color to the active/current link */
#nav a.active {
  background-color: black;
  color: white;
}
#title img{
display: flex;
margin-left: 325px;
width: 600px;
height: 400px;
}

.navbar-nav {
  display:flex;
  margin-left: -25px;
  flex-direction: column;
} 
</style>