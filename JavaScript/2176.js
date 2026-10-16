const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const S = input.trim();

let ones = 0;
for (let i = 0; i < S.length; i++) {
    if (S[i] === '1') ones++;
}

if (ones % 2 === 0) {
    console.log(S + "0");
} else {
    console.log(S + "1");
}
