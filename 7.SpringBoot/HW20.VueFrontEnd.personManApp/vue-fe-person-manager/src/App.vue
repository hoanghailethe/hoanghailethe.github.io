<template>
	<div class="container justify-content-center mt-50 mb-50">
		<h1 class="text-center">{{ shopName }}</h1>
		<!-- search and Sort -->
		<div class="row d-flex">
			<div class="col-5">
				<select class="btn btn-secondary" @change="sorting($event)">
					<option disabled selected>Sort By</option>
					<option class="dropdown-item" value="asc">A-Z</option>
					<option class="dropdown-item" value="desc">Z-A</option>
					<option class="dropdown-item" value="price">Price</option>
				</select>
			</div>
			<form class="col-5 mb-3 d-flex" @submit.prevent="search">
				<input
					v-model="content"
					type="text"
					placeholder="Search"
					class="form-control"
					aria-label="Text input with dropdown button"
				/>
				<button type="submit" class="btn btn-primary">Search</button>
			</form>
		</div>

		<div class="container-fluid main-content nav-bar">
			<!-- navbar turn button to route-link-->
			<router-link to="/" class="btn m-2">Product List</router-link>
			<router-link to="/cart" class="btn">Your Cart</router-link>
			<!-- <router-link to="/cart" class="btn btn-primary m-2">
				<i class="fa fa-shopping-cart" v-text="' ' + countCart"> </i>
			</router-link> -->
		</div>
		<div v-if='isLoading' class="spinner-border" role="status" style='display:block; margin:auto'>
			<span class="sr-only">Loading...</span>
		</div>
		<!-- render content here -->
		<router-view :products="products" @onUpdateCode="setCode" :code="code"/>

		<footer class="m-5">Copyright &copy; 2021</footer>
	</div>
</template>

<script>
	import axios from "axios";
	export default {
		name: "App",
		//props:['products'],
		data: function() {
			return {
				shopName: "Stylist Teen",
				content: "",
				products: [{}, {}, {}],
				isLoading: false,
				//discount code
				code: null,
			};
		},

		//if NOT USE ROUTER VIEW
		// components: {
		// 	Home
		// },

		methods: {
			setCode(event, value) {
				this.code = value;
				console.log(value);
			},

			async search() {
				this.isLoading = true
				this.products = [{}, {}, {}];
				console.log(this.products);

				await axios.get("http://localhost:3000/products").then((res) => {
					this.products = res.data;
				});

				if (this.content.length > 0) {
					this.products = this.products.filter((item) => {
						return item.name.toLowerCase().includes(this.content.toLowerCase());
					});
				}

				this.isLoading = false;
			},

			async sorting(event) {
				this.isLoading = true
				this.products = [{}, {}, {}];
				if (event.target.value === "price") {
					await axios
						.get(
							`http://localhost:3000/products?_sort=${event.target.value}&_order=DESC`
						)
						.then((res) => {
							this.products = res.data;
						});
				} else {
					await axios
						.get(
							`http://localhost:3000/products?_sort=name&_order=${event.target.value}`
						)
						.then((res) => (this.products = res.data));
				}
				this.isLoading = false
			},
		},

		async created() {
			this.isLoading = true;
			//pull new data product
			await axios
				.get("http://localhost:3000/products")
				.then((res) => {
					this.products = res.data;
				})
				.catch((err) => console.log(err));
			this.isLoading = false;
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
	}

	#nav {
		padding: 30px;
	}

	.nav-bar a {
		font-weight: bold;
		background-color: #42b983;
		border-radius: 6px;
		color: aliceblue;
	}

	#nav a.router-link-exact-active {
		color: #42b983;
	}
</style>
