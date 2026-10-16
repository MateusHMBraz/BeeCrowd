#include <stdio.h>
#include <string.h>

int main() {
    int N;
    if (scanf("%d", &N) == 1) {
        char s1[55], s2[55];
        while (N--) {
            scanf("%s %s", s1, s2);
            int len1 = strlen(s1);
            int len2 = strlen(s2);
            int max_len = len1 > len2 ? len1 : len2;
            for (int j = 0; j < max_len; j++) {
                if (j < len1) putchar(s1[j]);
                if (j < len2) putchar(s2[j]);
            }
            putchar('\n');
        }
    }
    return 0;
}
