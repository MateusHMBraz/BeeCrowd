#include <stdio.h>
#include <string.h>

int main() {
    char S[105];
    if (scanf("%s", S) == 1) {
        int ones = 0;
        int len = strlen(S);
        for (int i = 0; i < len; i++) {
            if (S[i] == '1') ones++;
        }
        if (ones % 2 == 0) {
            strcat(S, "0");
        } else {
            strcat(S, "1");
        }
        printf("%s\n", S);
    }
    return 0;
}
