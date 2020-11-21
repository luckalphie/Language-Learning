// test1.c
#include <stdio.h>

int main()
{
    int a = 1;
    int b = 2;
    a = a + b;
    for (int i = a; i < 100; i++)
    {
        printf("C: Hello World! No.%d\n", i);
    }
}

// gcc -gc test1.c
// objdump -d  -S test1.o

// gcc hello.c && ./a.out