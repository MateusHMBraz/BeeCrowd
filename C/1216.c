#include <stdio.h>

int main() {
    char name[100];
    double dist, total_dist = 0;
    int count = 0;

    while (scanf(" %[^
]s", name) != EOF) {
        if (scanf("%lf", &dist) != EOF) {
            total_dist += dist;
            count++;
        }
    }

    if (count > 0) {
        printf("%.1f\n", total_dist / count);
    }
    return 0;
}
