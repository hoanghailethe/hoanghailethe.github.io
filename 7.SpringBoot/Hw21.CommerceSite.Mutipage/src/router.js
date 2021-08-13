import Home from "./components/Home.vue";
import Cart from "./components/ShoppingCart.vue";
import {createRouter,createWebHistory} from 'vue-router'
const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/cart",
    component: Cart,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});
export default router;
