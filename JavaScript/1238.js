const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.trim().split('\n');

const N = parseInt(lines[0]);

for (let i = 1; i <= N; i++) {
    if (!lines[i]) continue;
    const [s1, s2] = lines[i].trim().split(/\s+/);
    let res = "";
    const maxLen = Math.max(s1.length, s2.length);
    for (let j = 0; j < maxLen; j++) {
        if (j < s1.length) res += s1[j];
        if (j < s2.length) res += s2[j];
    }
    console.log(res);
}
