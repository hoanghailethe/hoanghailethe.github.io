//1
let user = {
    name: "java",
    birthday: "23.02",
    email: "zoro123@",
    phone: '01234'
}
function hello(anyUser) {
    console.log(anyUser.name);
    console.log(anyUser.birthday);
    console.log(anyUser.email);
    console.log(anyUser.phone);
}
hello(user);

//2
function multiple(a,b) {
    return a*b;
}
console.log(multiple(2,5));

//3
function sum(anyArr, i, j) {
    return arr[i]+arr[j];
}
let arr = [0,3,4,502,9];
console.log(sum(arr, 1,3));

