#include <stdio.h>

int main() {
    int T;
    if (scanf("%d", &T) == 1) {
        while (T--) {
            int N, K;
            scanf("%d %d", &N, &K);
            int res = (N / K) + (N % K);
            printf("%d\n", res);
        }
    }
    return 0;
}
