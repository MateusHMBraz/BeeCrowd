const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

let totalDist = 0;
let count = 0;

for (let i = 0; i < lines.length; i += 2) {
    if (lines[i] && lines[i + 1]) {
        totalDist += parseFloat(lines[i + 1]);
        count++;
    }
}

if (count > 0) {
    console.log((totalDist / count).toFixed(1));
}
