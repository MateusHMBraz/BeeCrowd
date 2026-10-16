#include <stdio.h>

int main() {
    int N;
    if (scanf("%d", &N) == 1) {
        int val, min_val, min_pos = 0;
        scanf("%d", &min_val);
        for (int i = 1; i < N; i++) {
            scanf("%d", &val);
            if (val < min_val) {
                min_val = val;
                min_pos = i;
            }
        }
        printf("Menor valor: %d\n", min_val);
        printf("Posicao: %d\n", min_pos);
    }
    return 0;
}
