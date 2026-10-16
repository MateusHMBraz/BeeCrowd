const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const salary = parseFloat(input.trim());

if (salary <= 2000.0) {
    console.log("Isento");
} else if (salary <= 3000.0) {
    let tax = (salary - 2000.0) * 0.08;
    console.log(`R$ ${tax.toFixed(2)}`);
} else if (salary <= 4500.0) {
    let tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18);
    console.log(`R$ ${tax.toFixed(2)}`);
} else {
    let tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28);
    console.log(`R$ ${tax.toFixed(2)}`);
}
