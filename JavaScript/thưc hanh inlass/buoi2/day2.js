for(let i = 1; i<=10 ; i++) {
    if(i%2 != 0) {
        console.log(i + 'la so le')
    } else {
        console.log(i + 'la so chan')
    }
}

for(let i = 1; i<=10 ; i++) {
    
    if( i%3 === 0 && i%5 === 0) {
        console.log(i + 'FizzBuzz')
    } else if(i%3 == 0) {
        console.log(i + 'Fizz')
    } else if(i%5 == 0) {
        console.log(i + 'Buzz')
    }
}

function isPrime(n) {
    if (n < 2 ) return false;
    if (n >= 2) {

        for (let i = 2; i <= Math.sqrt(n) ; i++ ) {
            if( n % i === 0 ) return false;
        }

        return true;
    }
    return false;
}

function headAndTail(n) {
    let tail = n % 10;
    while ( n >= 10 ) {
        n = Math.round(n/10);
    }
    console.log(n*10+tail);
}


