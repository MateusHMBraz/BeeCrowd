const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const tokens = input.trim().split(/\s+/);

let idx = 0;
while (idx < tokens.length) {
    if (!tokens[idx]) break;
    const L = parseInt(tokens[idx++]);
    let maxSpeed = 0;
    for (let i = 0; i < L; i++) {
        const speed = parseInt(tokens[idx++]);
        if (speed > maxSpeed) maxSpeed = speed;
    }
    if (maxSpeed < 10) console.log(1);
    else if (maxSpeed < 20) console.log(2);
    else console.log(3);
}
