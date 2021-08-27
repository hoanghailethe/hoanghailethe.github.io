import { createRouter, createWebHistory } from 'vue-router'
import Home from "../components/Home.vue";
import Cart from "../components/ShoppingCart.vue";
import ConfirmForm from "../components/Form.vue";


const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    props: true,
  },
  {
    path: '/formCofirmOrder',
    name: 'Form',
    component: ConfirmForm,
    props: true,
  },
  {
    path: '/cart',
    name: 'Cart',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: Cart,
    props: true,
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
