#include <stdio.h>

int main() {
    double salary, tax;
    if (scanf("%lf", &salary) == 1) {
        if (salary <= 2000.0) {
            printf("Isento\n");
        } else if (salary <= 3000.0) {
            tax = (salary - 2000.0) * 0.08;
            printf("R$ %.2f\n", tax);
        } else if (salary <= 4500.0) {
            tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18);
            printf("R$ %.2f\n", tax);
        } else {
            tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28);
            printf("R$ %.2f\n", tax);
        }
    }
    return 0;
}
