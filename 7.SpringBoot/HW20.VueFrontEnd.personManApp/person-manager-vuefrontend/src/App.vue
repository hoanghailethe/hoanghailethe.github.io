<template>
  <div class="main">
    
    <div class="menu">
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top container-fluid">
        <router-link class="navbar-brand" to="/">YourPeople</router-link>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse container" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <router-link class="nav-link" to="/">Home </router-link>
            </li>
            <li class="nav-item active">
              <router-link class="nav-link" to="/job-list">List Jobs </router-link>
            </li>

            <li class="nav-item active">
              <a class="nav-link" href="#">English</a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="#">Vietnamese </a>
            </li>
          </ul>
          <form class="form-inline mt-2 mt-md-0 d-sm-flex align-items-end">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>

    </nav>

    <router-view></router-view>

    <!-- fix footer -->
    <footer class="footer">
      <div class="container">
        <span class="text-muted">People are the greatest asset of great company!</span>
      </div>
    </footer>
  </div>
</div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

// export default {
//   name: 'App',
//   components: {
//     HelloWorld
//   }
// }
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
