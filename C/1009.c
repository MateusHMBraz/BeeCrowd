#include <stdio.h>

int main() {
    char name[100];
    double salary, sales, total;
    if (scanf("%s %lf %lf", name, &salary, &sales) == 3) {
        total = salary + (sales * 0.15);
        printf("TOTAL = R$ %.2f\n", total);
    }
    return 0;
}
