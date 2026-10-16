const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const T = parseInt(lines[0]);

for (let i = 1; i <= T; i++) {
    if (!lines[i]) continue;
    const [N, K] = lines[i].trim().split(/\s+/).map(Number);
    const res = Math.floor(N / K) + (N % K);
    console.log(res);
}
