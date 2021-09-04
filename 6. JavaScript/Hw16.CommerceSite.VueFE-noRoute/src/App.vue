<template>
  <!-- <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div> -->

  <div class="container justify-content-center mt-50 mb-50">
    <h1 class= "text-center">{{shopName}}</h1>
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
    
    <div class="container-fluid main-content">
      <button class="tablink" onclick="openPage('Home', this, 'orange')" id="defaultOpen">Product List</button>
      <button class="tablink" onclick="openPage('Order', this, 'green')" >News</button>

      <!-- PAGE PRODUCT -->
      <div id="Home" class="row tabcontent">
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

      <!-- Page Order List -->
      <div id="Order" class="row tabcontent">
        <table class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
          <thead>
            <tr>
              <th class="th-sm">Product Name
              </th>
              <th class="th-sm">Quantity
              </th>
              <th class="th-sm" style="width:auto">
              </th>
              <th class="th-sm">Price
              </th>
              <th class="th-sm">Total
              </th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>ÁO THUN W2ATN2051003</td>
              <td>{{orderP1}}</td>
              <td> <button class="btn btn-primary" @click="orderP1++">+</button> <button class="btn btn-danger" v-on:click="(orderP1 > 0) ? orderP1--: orderP1">-</button> </td>
              <td>$320,800</td>
              <td>{{ orderP1* priceP1 }}</td>
            </tr>
            <tr>
              <td>ÁO THUN W2ATN2051007</td>
              <td>{{orderP2}}</td>
              <td><button class="btn btn-primary" @click="orderP2++">+</button> <button class="btn btn-danger" @click="(orderP2) > 0 ? orderP2--: orderP2">-</button> </td>
              <td>$170,750</td>
              <td>{{ orderP2* priceP2 }}</td>
            </tr>
            <tr>
              <td colspan="3"></td>
              <th>Total payment</th>
              <td>{{orderP1* priceP1 + orderP2* priceP2}}</td>
            </tr>
          </tbody>
        </table>  
        <form action="">
          <div class="d-flex flex-row justify-content-center">
            <input type="text" placeholder="Discount Code">
            <input type="submit" class="btn btn-primary">
          </div>
        </form>
      </div>
    </div>

  </div>
  
</template>

<script>
    export default {
      name: "Chothos for Beauty",

      methods: {
        minus: function() {
          if (this.orderP1 > 0) {
            this.orderP1 --;
          }
        }
      },
      
      data: function () {
        return {
          shopName: "Stylist Teen",

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

          orderP1: 2,
          orderP2:3,
          priceP1:320800,
          priceP2:170775,
          
        }
      }
    }

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
