#include <stdio.h>
#include <string.h>

int main() {
    int N;
    if (scanf("%d", &N) == 1) {
        char text[55];
        int shift;
        while (N--) {
            scanf("%s %d", text, &shift);
            int len = strlen(text);
            for (int i = 0; i < len; i++) {
                text[i] = (text[i] - 'A' - shift + 26) % 26 + 'A';
            }
            printf("%s\n", text);
        }
    }
    return 0;
}
