// // Bài 1

// // Viết chương trình kiểm tra và in ra số lớn nhất trong 3 số
// // a, b, c là 3 số nhập vào
// function maxOfThree(a, b, c) {
//     // return number
//     let number = (b>=c)?b:c;
//     return (a>=number) ? a : number;

// }

// // Bài 2

// // Viết chương trình nhập một tháng trong năm, trả về mùa tương ứng: Spring, Summer, Autumn, Winter
// // month là tháng nhập vào
// function getSeason(month) {
//     // return string
//     if( month >= 1 && month <= 3) {
//         return "Spring";
//     } 
//     else if( month >= 4 && month <= 6) {
//         return "Summer";
//     } 
//     else if( month >= 7 && month <= 9) {
//         return "Autumn";
//     } 
//     else if( month >= 10 && month <= 12) {
//         return "Winter";
//     } 
//     else return NaN;
// }

// // Bài 3
// // Viết chương trình kiểm tra một năm có phải năm nhuận hay không
// // year là năm nhập vào
// function isLeapYear(year) {
//     // return boolean
//     return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
// }

// // Bài 4

// // Viết chương trình quy đổi điểm thang 10 sang điểm chữ ABCDF
// // 0 - 3.99 -> F
// // 4.0 - 5.49 -> D
// // 5.5 - 6.99 -> C
// // 7.0 - 8.49 -> B
// // 8.5 - 10 -> A
// // point là điểm nhập vào
// function calcGrade(point) {
//     // return string
//     if( point >= 0 && point < 4) {
//         return "F";
//     } 
    
//     else if( point >= 4 && point < 5.5 ) {
//         return "D";
//     } 
//     else if( point >= 5.5 && point < 7) {
//         return "C";
//     } 
//     else if( point >= 7 && point <= 8.5) {
//         return "B";
//     }
//     else if( point >= 8.5 && point <= 10) {
//         return "A";
//     }
//     else return NaN;
// }

// // Bài 5
// // Viết chương trình giải phương trình bậc 1 ax + b = 0
// // Lưu ý các điều kiện phương trình
// // Trường hợp vô nghiệm thì trả về null
// // Trường hợp vô số nghiệm thì trả về NaN
// // a, b là hệ số nhập vào
// function linear(a, b) {
//     // return number
//     if(b !== 0 && a == 0) return null;
//     else if (a == 0 && b == 0) return NaN;
//     else return -b/a;
// }

// // Bài 6
// // Viết chương trình giải phương trình bậc 2 ax2 + bx + c = 0
// // Lưu ý các điều kiện phương trình
// // Căn bậc 2 sử dụng Math.sqrt()
// // a, b, c là hệ số nhập vào
// // Trường hợp vô nghiệm thì trả về null
// // Trường hợp vô số nghiệm thì trả về NaN
// // Nghiệm đặt trong một object VD: {x1: value, x2: value} (cả trường hợp nghiệm kép)
// // Trường hợp a = 0 thì giải phương trình bậc nhất, trả về 1 nghiệm x
// function quadratic(a, b, c) {
//     // return object || number
//     if(a == 0) return linear(b,c);

//     let delta = b*b -4*a*c;
//     if (delta < 0) return null;
    
//     let sprDelta = Math.sqrt(delta);
//     return {x1: (-b+ sprDelta)/2/a, x2 :  (-b- sprDelta)/2/a};
// }

// // Bài 7

// // Viết chương trình tính tổng bội chung của 3 và 5 trong khoảng từ 1 -> n
// // n là số nhập vào
// function sumMultiple(n) {
//     // return number
//     let result = 0;
//     let check = 0;
//     while (check+15 <= n) {
//         check += 15;
//         result += check;
//     }
//     return result;
    
// }

// // Bài 8

// // Viết chương trình kiểm tra một số có phải số nguyên tố hay không
// // n là số nhập vào
// function isPrime(n) {
//     // return boolean
//     if( n<2 ) return false;
//     for( let i = 2; i<=Math.sqrt(n); i++) {
//         if (n % i == 0) return false;
//     }
//     return true;
// }

// // Bài 9
// // Viết chương trình tính tổng các số nguyên tố trong khoảng a -> b
// // a, b là số nhập vào
// function sumPrime(a, b) {
//     // return number
//     let count = 0 ;
//     for( let i = a; i<=b ; i++ ) {
//         if (isPrime(i)) count+=i;
//     }
//     return count;
// }

// // Bài 10
// // Viết chương trình tính số Fibonacci thứ n
// // 2 giá trị đầu tiên trong dãy là 0, 1
// // n là số nhập vào
// // Nếu n nhỏ hơn 0 thì kết quả là null
// function getFibonacci(n) {
//     // return number
//     if(n<=0) return null;
//     if(n==1) return 0;
//     if(n==2) return 1;
//     let a0 = 0, a1 = 1, a2;
//     for (let i = 3; i <= n; i++) {
//         a2 = a0+ a1;
//         a0 = a1;
//         a1 = a2;
//     }
//     return a2;
// }

// // Bài 11
// // Viết chương trình tính giai thừa của một số n
// // n là giá trị nhập vào
// // Nếu n < 0 thì return NaN
// function factorial(n) {
//     // return number
//     if(n < 0) return NaN;
//     let result=1;
//     for (let i = 1; i <= n ; i++ ){
//         result *= i;
//     }
//     return result;
// }

// // Bài 12
// // Viết chương trình kiểm tra một số có phải số Strong hay không
// // Số Strong là số có tổng giai thừa của các chữ số bằng chính nó
// // VD: 145 = 1! + 4! + 5! -> 145 là số Strong
// // n là số nhập vào
// function isStrong(n) {
//     // return boolean
//     let sum = 0;
//     let copy = n;
//     if(n<=0) return false;
//     while (copy >= 1) {
//         sum += factorial(copy%10);
//         copy /= 10;
//     }
//     return sum==n;
//}

// // Một số bài ôn tập thêm với vòng lặp
// // Viết chương trình in ra theo các mẫu sau
// // n là số hàng cần in

// // * i = 1, j = 1
// // * * i = 2, j = 1, 2
// // * * * i = 3, j = 1, 2, 3
// // * * * *
// // * * * * *

// function p1(n) {
//     for (let i = 1; i <= n; i++) {

//         let s = "";

//         for (let j = 1; j <= i; j++) {
//             s += "* ";
//         }

//         console.log(s);
//     }

// }
// p1(5);

//         *
//       * *
//     * * *
//   * * * *
// * * * * *

// function p2(n) {
//     for (let i = 1; i <= n; i++) {

//         let s = "";

//         for (let j = 1; j <= n; j++) {
//             if ( j > n-i) s += " *";
//             else s += "  ";
//         }

//         console.log(s);
//     }
// }
// p2(5);


// //     *
// //    * *
// //   * * *
// //  * * * *
// // * * * * *

// function p3(n) {
//     for (let i = 1; i <= n; i++) {

//         let s = "";

//         for (let j = 1; j <= n; j++) {
//             if ( j > n-i) s += " *";
//             else s += " ";
//         }

//         console.log(s);
//     }
// }

// // * * * * *
// // * * * *
// // * * *
// // * *
// // *

// function p4(n) {
//     for (let i = 1; i <= n; i++) {

//         let s = "";

//         for (let j = 1; j <= n; j++) {
//             if ( j <= n+1-i) s += " *";
//             //else s += "  ";
//         }

//         console.log(s);
//     }
// }
// p4(5); done

// * * * * *
//   * * * *
//     * * *
//       * *
//         *

// function p5(n) {
//     for (let i = n; i >= 1; i--) {

//         let s = "";

//         for (let j = 1; j <= n; j++) {
//             if (  j <= n+ 1 - i ) s += "  ";
//             else s += " *";
//         }

//         console.log(s);
//     }
// }
// p5(5); //done

// * * * * *
//  * * * *
//   * * *
//    * *
//     *

// function p6(n) {
//     for (let i = n; i >= 1; i--) {

//         let s = "";

//         for (let j = 1; j <= n; j++) {
//             if (  j < n +1 - i ) s += " ";
//             else s += " *";
//         }

//         console.log(s);
//     }
// }

// p6(5); //done


// *
// * *
// * * *
// * *
// *

// n luôn lẻ

function p7(n) {
    for (let i = 1; i <= n; i++) {

        let s = "";

        for (let j = 1; j <= n; j++) {
            if ( j > n-i) s += " *";
            else s += "  ";
        }

        console.log(s);
    }
}

//     *
//   * *
// * * *
//   * *
//     *

// n luôn lẻ

function p8(n) {
    for (let i = 1; i <= n; i++) {

        let s = "";

        for (let j = 1; j <= n; j++) {
            if ( j > n-i) s += " *";
            else s += "  ";
        }

        console.log(s);
    }
}

//   *
//  * *
// * * *
//  * *
//   *

// n luôn lẻ

function p9(n) {
    for (let i = 1; i <= n; i++) {

        let s = "";

        for (let j = 1; j <= n; j++) {
            if ( j > n-i) s += " *";
            else s += "  ";
        }

        console.log(s);
    }
}

// * * *
// * *
// *
// * *
// * * *

// n luôn lẻ

function p10(n) {
    for (let i = 1; i <= n; i++) {

        let s = "";

        for (let j = 1; j <= n; j++) {
            if ( j > n-i) s += " *";
            else s += "  ";
        }

        console.log(s);
    }
}
