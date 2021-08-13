<template>
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
</template>

<script>
// import axios from "axios";
export default {
    name: "Cart",
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
          
          orderP1: 2,
          orderP2:3,
          priceP1:320800,
          priceP2:170775,

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
