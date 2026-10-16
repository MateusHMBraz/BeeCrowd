#include <stdio.h>

int main() {
    int N;
    if (scanf("%d", &N) == 1) {
        int a = 0, b = 1;
        for (int i = 0; i < N; i++) {
            printf("%d%s", a, (i == N - 1) ? "" : " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        printf("\n");
    }
    return 0;
}
