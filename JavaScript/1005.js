const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const A = parseFloat(lines[0]);
const B = parseFloat(lines[1]);
const media = (A * 3.5 + B * 7.5) / 11.0;

console.log(`MEDIA = ${media.toFixed(5)}`);
