const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const A = parseFloat(lines[0]);
const B = parseFloat(lines[1]);
const C = parseFloat(lines[2]);
const media = (A * 2 + B * 3 + C * 5) / 10.0;

console.log(`MEDIA = ${media.toFixed(1)}`);
