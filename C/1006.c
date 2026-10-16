#include <stdio.h>

int main() {
    double A, B, C, media;
    if (scanf("%lf %lf %lf", &A, &B, &C) == 3) {
        media = (A * 2 + B * 3 + C * 5) / 10.0;
        printf("MEDIA = %.1f\n", media);
    }
    return 0;
}
