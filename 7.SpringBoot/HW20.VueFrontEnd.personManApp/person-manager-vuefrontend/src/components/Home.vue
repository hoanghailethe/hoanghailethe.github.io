<template>
      <main class="container">
        <div class = "row mt-3">
            <div class="col-sm-5">
                <h2>All people on your list: </h2>
            </div>
            <router-link class="btn btn-primary col-2" to="/register"> Add new person</router-link>
        </div>

        <ul th:each="person : ${people}"
            class="list-unstyled">
            <div v-if="people.length == 0">
                <h3>Sorry! There is no person on the List!</h3>
            </div>
            <div v-else>
              <li v-for = "person in people" v-bind:key="person.id" class="media row mt-3" style="max-height:350px;">
                  <div class=" col-3 mr-3 ">
                      <img th:src= "@{${path} + *{id} +'.jpg'}"  class="img-fluid" alt="person image">
                  </div>
                  <div class="media-body col-6">
                      <h5 th:text = "*{fullName}" class="mt-0 mb-1"></h5>
                      <h5 th:text = "*{job}" class="mt-0 mb-1"></h5>
                      <h5 th:text = "*{gender}" class="mt-0 mb-1"></h5>
                      <h5 th:text = "*{birthDate}" class="mt-0 mb-1"></h5>
                      <a class="btn btn-primary" th:href="@{/delete/person/{id}(id=*{id})}">Delete</a>
                      <a class="btn btn-primary" th:href="@{/edit/person/{id}(id=*{id})}">Edit</a>
                  </div>
              </li>
            </div>
            
        </ul>

    </main>

</template>

<script>
export default {
  name: 'Home',
  data() {
    return {
      people:[],
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
