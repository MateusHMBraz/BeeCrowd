#include <stdio.h>

void print_array(int arr[], int size, const char *name) {
    for (int i = 0; i < size; i++) {
        printf("%s[%d] = %d\n", name, i, arr[i]);
    }
}

int main() {
    int par[5], impar[5];
    int p_count = 0, i_count = 0, x;

    for (int i = 0; i < 15; i++) {
        if (scanf("%d", &x) == 1) {
            if (x % 2 == 0) {
                par[p_count++] = x;
                if (p_count == 5) {
                    print_array(par, 5, "par");
                    p_count = 0;
                }
            } else {
                impar[i_count++] = x;
                if (i_count == 5) {
                    print_array(impar, 5, "impar");
                    i_count = 0;
                }
            }
        }
    }

    print_array(impar, i_count, "impar");
    print_array(par, p_count, "par");

    return 0;
}
