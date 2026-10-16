const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const tokens = input.trim().split(/\s+/);

const N = parseInt(tokens[0]);
const X = tokens.slice(1, N + 1).map(Number);

let minVal = X[0];
let minPos = 0;

for (let i = 1; i < N; i++) {
    if (X[i] < minVal) {
        minVal = X[i];
        minPos = i;
    }
}

console.log(`Menor valor: ${minVal}`);
console.log(`Posicao: ${minPos}`);
