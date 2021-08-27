<template>
	<!-- Page Order List -->
	<div id="Order" class="row tabcontent">
		<table
			class="table table-striped table-bordered table-sm"
			cellspacing="0"
			width="100%"
		>
			<thead>
				<tr>
					<th class="th-sm">Product Name</th>
					<th class="th-sm">Quantity</th>
					<th class="th-sm" style="width:auto"></th>
					<th class="th-sm">Price</th>
					<th class="th-sm">Total</th>
				</tr>
			</thead>
			<tbody>
				<tr v-if="cart.length == 0" style="textAlign: center;">
					<h3 class="lead">There is nothing in your Cart!</h3>
				</tr>
				<tr v-for="item in cart" :key="item.id" v-else>
					<td>{{ item.name }}</td>
					<td>{{ item.quantity }}</td>
					<td>
						<button class="btn btn-primary" @click="addToCart(item)">+</button>
						<button class="btn btn-danger" v-on:click="removeFromCart(item)">
							-
						</button>
					</td>
					<td>{{ item.price }}</td>
					<td>{{ item.quantity * item.price }}</td>
				</tr>
				<tr v-if="isDiscounted">
					<td colspan="3"></td>
					<th v-text="'Discount '+`${discountRate}`+'%'" ></th>
					<td>{{ totalDiscount }}</td>
				</tr>
				<tr v-if="cart.length > 0">
					<td colspan="3"></td>
					<th>Total payment</th>
					<td>{{ totalPayment }}</td>
				</tr>
			</tbody>
		</table>
		<form action="" @submit.prevent = "checkDiscount">
			<div class="d-flex flex-row justify-content-center">
				<input type="text" placeholder="Discount Code" v-model="codeSubmited"/>
				<button
					type="submit"
					class="btn btn-primary"
				> Nhập mã </button> 
			</div>
		</form>
		<h4 style="text-align:center mt-2">Nhập 'moon' or 'star' để được ưu đãi</h4>
		<div class="d-flex flex-row justify-content-center">
			 <router-link to="/formCofirmOrder" class="btn btn-block btn-primary m-4">Xác nhận đơn hàng</router-link>
		</div>
	</div>
</template>

<script>
	// import axios from "axios";
	export default {
		name: "Cart",
		props: ['code'],
		methods: {
			//change props Code
			setCode() {
				this.$emit("onUpdateCode", this.codeSubmited);
			},
			//add to cart method
			addToCart(product) {
				console.log("add To cart");
				let isAdded = false;
				for (let item of this.cart) {
					if (item.id === product.id) {
						item.quantity++;
						isAdded = true;
						break;
					}
				}
				if (!isAdded) this.cart.push({ ...product, quantity: 1 });
			},

			//remove from cart
			removeFromCart(p) {
				for (let ele of this.cart) {
					if (ele.id === p.id) {
						ele.quantity--;
						if (ele.quantity == 0) {
							let index = this.cart.indexOf(ele);
							this.cart.splice(index, 1);
							break;
						}
					}
				}
				console.log(this.cart);
			},

			//showPM
			checkDiscount() {
				switch(this.codeSubmited) {
					case 'moon' : this.discountRate = 25; this.isDiscounted=true; break;
					case 'star' : this.discountRate = 50; this.isDiscounted=true;break;
					default : this.discount = 0
				}
			}
		},

		data() {
			return {
				shopName: "Stylist Teen",
				cart: [{price:0, quantity:0}],
				//code: "",
				isDiscounted : false,
				discountRate : 0,
				codeSubmited : null,
			};
		},

		computed: {
			totalCost() {
				let total = 0;
				this.cart.map((product) => {
					total += product.quantity * product.price;
				});
				return total;
			},

			totalDiscount() {
				return this.discountRate/100*this.totalCost;
			},

			totalPayment() {
				return this.totalCost - this.totalDiscount;
			},
		},



		created() {
			//create cart (check if null or not)
			let cart = window.localStorage.getItem("cartST");
			if (cart == null) {
				this.cart = [];
			} else {
				this.cart = JSON.parse(cart);
			}
		},

		beforeUnmount() {
			//use local Storage
			window.localStorage.setItem("cartST", JSON.stringify(this.cart));
			if (this.codeSubmited != null) window.sessionStorage.setItem("code", JSON.stringify(this.codeSubmited));
			this.setCode();
		},
	};
</script>
