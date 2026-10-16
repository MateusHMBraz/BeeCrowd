const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const number = parseInt(lines[0]);
const hours = parseInt(lines[1]);
const amount = parseFloat(lines[2]);

const salary = hours * amount;

console.log(`NUMBER = ${number}`);
console.log(`SALARY = U$ ${salary.toFixed(2)}`);
