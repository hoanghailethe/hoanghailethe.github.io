<template>
  <!-- <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div> -->

  <div class="container justify-content-center mt-50 mb-50">
    <h1 class= "text-center">{{shopName}}</h1>
    <!-- search and Sort -->
    <div class ="row d-flex">      
      <div class="col-5">
        <div class="dropdown">
          <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Dropdown button
          </button>
          <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <a class="dropdown-item" href="#">Something else here</a>
          </div>
        </div>
      </div>
      <div class="col-4 mb-3 d-flex">
        <input type="text" placeholder="Search"
              class="form-control" aria-label="Text input with dropdown button">
        <button class= "btn btn-primary">Search</button>
      </div>
    </div>
    
    <div class="container-fluid main-content nav-bar">
      <!-- navbar turn button to route-link-->
      <router-link to="/" class="btn">Product List</router-link>
      <router-link to="/cart" class="btn">Your Cart</router-link>

    </div>

    <!-- render content here -->
    <router-view/>

    <footer>Copyright &copy; 2021</footer>


  </div>
  
</template>

<script>

export default {    
  name: 'App',  
  data: function () {
    return {
      shopName: "Stylist Teen",
      
    }
  },

};

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

body, html {
  height: 100%;
  margin: 0;
  font-family: Arial;
}

/* Style tab links */
.tablink {
  background-color: #555;
  color: white;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  font-size: 17px;
  width: 25%;
  margin-bottom: 16px;
}

.tablink:hover {
  background-color: #777;
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
  color: black;
  display: none;  
}

.card-body {
  max-height: 450px;
}

table {
  max-width: 850px !important;
  margin: auto;
}
table th {
    width: auto !important;
}

</style>
