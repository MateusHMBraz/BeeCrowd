#include <stdio.h>

int main() {
    int number, hours;
    double amount, salary;
    if (scanf("%d %d %lf", &number, &hours, &amount) == 3) {
        salary = hours * amount;
        printf("NUMBER = %d\n", number);
        printf("SALARY = U$ %.2f\n", salary);
    }
    return 0;
}
