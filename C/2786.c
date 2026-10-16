#include <stdio.h>

int main() {
    int L, C;
    if (scanf("%d %d", &L, &C) == 2) {
        int tipo1 = (L * C) + ((L - 1) * (C - 1));
        int tipo2 = ((L - 1) * 2) + ((C - 1) * 2);
        printf("%d\n", tipo1);
        printf("%d\n", tipo2);
    }
    return 0;
}
