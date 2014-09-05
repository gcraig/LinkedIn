#include <stdio.h>

int main()
{
    // le classic, but simple fizzbuzz
    for (int i = 0; i < 100; i++) {
        printf("%d: ", i);
        if (i == 0)
            goto skip;
        if (i % 3 == 0)
            printf("fizz ");
        if (i % 5 == 0)
            printf("buzz");
skip:   printf("\n");
    }
}
