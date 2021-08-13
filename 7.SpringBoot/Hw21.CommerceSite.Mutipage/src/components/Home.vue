<template>
  <!-- PAGE PRODUCT -->
    <div id="Home" class="row tabcontent">
      <h1>HELLO</h1>
      <div class="col-4 col-md-4 mt-2" v-for="product in products" :key="product.id">
        <div class="card">
          <div class="card-body">
            <div class="card-img-actions">
              <img
                v-bind:src= "product.image"
                class="card-img img-fluid"
                height="350"
                alt=""
              />
            </div>
          </div>
          <div class="card-body bg-light text-center">
            <div class="mb-2">
              <h6 class="font-weight-semibold mb-2">
                <a href="#" class="text-default mb-2" data-abc="true"
                  >{{product.name}}</a
                >
              </h6>
              <a href="#" class="text-muted" data-abc="true"
                >{{product.category}}</a
              >
            </div>
            <h3 class="mb-0 font-weight-semibold">{{product.price}}</h3>
            <div>
              <i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
              <i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
            </div>
            <div class="text-muted mb-3">{{product.reviews}} reviews</div>
            <button type="button" class="btn bg-cart">
              <i class="fa fa-cart-plus mr-2"></i> Add to cart
            </button>
          </div>
        </div>
      </div>
    </div>
  
</template>

<script>
// import axios from "axios";
export default {
    name: "Home",
    data() {
        return {
          products: [
            {
              id: 1,
              name: "ÁO THUN W2ATN2051003",
              image:"https://storage.googleapis.com/cdn.nhanh.vn/store/7136/ps/20210329/2915202131534_1_thumb.jpg",
              category:"female summer",
              price:250.000,
              reviews:55,
            },
            {
              id: 2,
              name: "Set summer",
              image:"https://storage.googleapis.com/cdn.nhanh.vn/store/7136/ps/20210618/18062021030600_1000_x_1500__Dai_dien.jpg",
              category:"female summer",
              price:180.000,
              reviews:30,
            },
            {
              id: 3,
              name: "ÁO THUN W2ATN2051007",
              image:"https://storage.googleapis.com/cdn.nhanh.vn/store/7136/ps/20210618/18062021030638_1000_x_1500__Dai_dien.jpg",
              category:"female summer",
              price:250.000,
              reviews:59,
            }
          ],
        }
    },
}
</script>
