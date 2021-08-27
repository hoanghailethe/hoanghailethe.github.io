<template>
	<!-- PAGE PRODUCT -->
	<router-link to="/cart" class="btn btn-primary m-2">
		<i class="fa fa-shopping-cart" v-text="' ' + countCart"> </i>
	</router-link>

	<h3 v-if='products.length == 0'>Sorry, there is no product found</h3>
	<div
		id="Home"
		class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3 tabcontent"
	>	
		<div class="col" v-for="product in products" :key="product.id">
			<div class="skeleton" v-if="isEmpty(product)"></div>
			<div class="card" v-else>
				<div class="card-body">
					<div class="card-img-actions ">
						<img v-bind:src="product.image" class="card-img img-fluid" alt="" />
					</div>
				</div>
				<div class="card-body bg-light text-center">
					<div class="mb-2">
						<h6 class="font-weight-semibold mb-2">
							<a href="#" class="text-default mb-2" data-abc="true">{{
								product.name
							}}</a>
						</h6>
						<a href="#" class="text-muted" data-abc="true">{{
							product.category
						}}</a>
					</div>
					<h3 class="mb-0 font-weight-semibold">{{ product.price }}</h3>
					<div>
						<i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
						<i class="fa fa-star star"></i> <i class="fa fa-star star"></i>
					</div>
					<div class="text-muted mb-3">{{ product.reviews }} reviews</div>
					<button type="button" class="btn bg-cart" @click="addToCart(product)">
						<i class="fa fa-cart-plus mr-2"></i> Add to cart
					</button>
				</div>
			</div>
		</div>
	</div>
</template>

<script>
	export default {
		name: "Home",
		props: ["products"],
		data() {
			return {
				cart: [],			
			};
		},

		methods: {
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

			isEmpty(obj) {
    			return Object.keys(obj).length === 0;
			}
		},

		computed: {
			countCart() {
				let count = 0;
				this.cart.forEach((i) => (count += i.quantity));
				return count;
			},
		},
		//pull data Products list when created
		created() {
			//create cart or get SESSION cart
			let cart = window.localStorage.getItem("cartST");
			if (cart == null) {
				this.cart = [];
			} else {
				this.cart = JSON.parse(cart);
			}
		},

		beforeMount() {},

		beforeUnmount() {
			console.log("Data before Unmounted ");
			console.log(this.cart);
			//axios.post(`http://localhost:3000/cart`);
			//use local Storage
			// let cart = window.localStorage.getItem("cartST");
			// cart = JSON.parse(cart);
			// this.cart = cart;
			window.localStorage.setItem("cartST", JSON.stringify(this.cart));
		},
	};
</script>

<style>
	.card-body {
		max-height: 60%;
	}

	.skeleton {
		/* width: 315px; */
		/* height: 350px; */
		cursor: progress;
		background: linear-gradient(0.25turn, transparent, #fff, transparent),
			linear-gradient(#eee, #eee),
			radial-gradient(38px circle at 19px 19px, #eee 50%, transparent 51%),
			linear-gradient(#eee, #eee);
		background-repeat: no-repeat;
		background-size: 315px 250px, 315px 180px, 100px 100px, 225px 30px;
		background-position: -315px 0, 0 0, 0px 190px, 50px 195px;
		animation: loading 1.5s infinite;
	}

	@keyframes loading {
		to {
			background-position:  315px 0, 0 0, 0 190px, 50px 195px;
		}
	}

</style>
