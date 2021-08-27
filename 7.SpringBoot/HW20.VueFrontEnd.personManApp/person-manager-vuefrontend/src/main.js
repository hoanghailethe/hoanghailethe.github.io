import Vue from "vue"
import App from './App.vue'
import VueRouter from "vue-router"
import Home from "./components/Home.vue"
import Register from "./components/Register.vue"


Vue.config.productionTip = false

Vue.use(VueRouter);

const routes = [
  {path:'/', component: Home},
  {path:'/register', component: Register},  
]

const router = new VueRouter({
  mode: 'history',
  routes
})

// const router = VueRouter.createRouter({
//   history: VueRouter.createWebHistory(),
//   routes,
// });

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
