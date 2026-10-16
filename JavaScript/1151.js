const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const N = parseInt(input.trim());

let fib = [];
let a = 0, b = 1;

for (let i = 0; i < N; i++) {
    fib.push(a);
    let temp = a + b;
    a = b;
    b = temp;
}

console.log(fib.join(' '));
