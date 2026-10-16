const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split(/\s+/).map(Number);

let par = [];
let impar = [];

function printArray(arr, name) {
    for (let i = 0; i < arr.length; i++) {
        console.log(`${name}[${i}] = ${arr[i]}`);
    }
}

for (let i = 0; i < 15; i++) {
    const x = lines[i];
    if (x % 2 === 0) {
        par.push(x);
        if (par.length === 5) {
            printArray(par, "par");
            par = [];
        }
    } else {
        impar.push(x);
        if (impar.length === 5) {
            printArray(impar, "impar");
            impar = [];
        }
    }
}

printArray(impar, "impar");
printArray(par, "par");
