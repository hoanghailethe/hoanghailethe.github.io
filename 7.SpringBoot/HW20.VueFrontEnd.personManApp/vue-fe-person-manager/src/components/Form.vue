<template>
	<main role="main" class="container">
		<h1 class="mt-5">Register new person</h1>
		<p class="lead">Please provide all neccessary information here!</p>

		<div v-if="posted == true" class="lead">
			<span>Response from server: </span>
			<div v-if="isWaitingRes" class="spinner-border">
				<span class="sr-only">Loading...</span>
			</div>
			<div class="v-else">{{messageFromServer}}</div>
		</div>
		<form @submit.prevent="postToServer">
			<div class="form-group row m-3 justify-content-center">
				<label for="fullName" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-4">
					<input
						v-model="customer.name"
						type="text"
						class="form-control"
						id="fullName"
					/>
				</div>
			</div>

			<div class="form-group row m-3 justify-content-center">
				<label for="email" class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-4">
					<input
						v-model="customer.email"
						type="text"
						class="form-control"
						id="email"
					/>
				</div>
			</div>

			<div class="form-group row m-3 justify-content-center">
				<label for="fullName" class="col-sm-2 col-form-label">Phone</label>
				<div class="col-sm-4">
					<input
						v-model="customer.phone"
						type="text"
						class="form-control"
						id="phone"
					/>
				</div>
			</div>

			<button class="btn btn-primary mt-3" type="submit">Submit form</button>
		</form>
	</main>
</template>

<script>
	import axios from "axios";
	export default {
		name: "Form",
		//props: ['code'],
		data() {
			return {
				customer: {
					name: "",
					email: "",
					phone: "",
				},
				cart: null,
				code: null,
				isWaitingRes: false,
				messageFromServer: "",
				posted: false,
			};
		},

		beforeMount() {
			this.posted = false;
			//create cart (check if null or not)
			let cart = window.localStorage.getItem("cartST");
			if (cart == null) {
				this.cart = {};
			} else {
				cart = JSON.parse(cart);
				// Ko send dc array
				this.cart = cart.map(({ id: id, quantity: quantity }) => ({
					id,
					quantity,
				}));

				//chuyen cart sang dang object
				console.log(this.cart)
			}
			let codeGet = sessionStorage.getItem('code')
			if (codeGet != null) {
				this.code = JSON.parse(codeGet);
			};
			// console.log('code discount?')
			// console.log(this.code)
		},

		methods: {
			async postToServer() {
				this.posted =true;
				this.isWaitingRes = true;
				let dataSend = { customer: this.customer, cart: this.cart, code: this.code };
				console.log(dataSend);
				await axios
					.post("http://localhost:3000/submitOrder", dataSend)
					.then((res) => (this.messageFromServer = res.data));
				this.isWaitingRes = false;
			},
		},
	};
</script>

<style></style>
