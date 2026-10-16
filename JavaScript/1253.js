const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const N = parseInt(lines[0]);
let lineIndex = 1;

for (let i = 0; i < N; i++) {
    const text = lines[lineIndex++].trim();
    const shift = parseInt(lines[lineIndex++].trim());
    let res = "";
    for (let j = 0; j < text.length; j++) {
        let code = (text.charCodeAt(j) - 65 - shift + 26) % 26 + 65;
        res += String.fromCharCode(code);
    }
    console.log(res);
}
