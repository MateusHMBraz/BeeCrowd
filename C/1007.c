#include <stdio.h>

int main() {
    int A, B, C, D, diferenca;
    if (scanf("%d %d %d %d", &A, &B, &C, &D) == 4) {
        diferenca = (A * B - C * D);
        printf("DIFERENCA = %d\n", diferenca);
    }
    return 0;
}
