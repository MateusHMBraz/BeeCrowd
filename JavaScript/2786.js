const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const L = parseInt(lines[0]);
const C = parseInt(lines[1]);

const tipo1 = (L * C) + ((L - 1) * (C - 1));
const tipo2 = ((L - 1) * 2) + ((C - 1) * 2);

console.log(tipo1);
console.log(tipo2);
