/*
 * @Date: 2023-09-15 11:55:21
 * @Author: Q9K
 * @Description:
 */
#include "libsysy.h"
int getvalue(int x)
{
    return x;
}
// 逻辑表达式
int main()
{
    int a, b;
    a = getint();
    b = getint();
    printf("20374319\n");
    if (getvalue(a) == getvalue(b))
    {
        printf("test1\n");
    }
    if (a == b && a >= b)
    {
        printf("test2\n");
    }
    if (a == b || a != b)
    {
        printf("test3\n");
    }
    if (a == b || a >= b && a <= b)
    {
        printf("test4\n");
    }
    if (20374319 - 1 < a)
    {
        printf("test5\n");
    }
    if (-20374319 + 1 > -a)
    {
        printf("test6\n");
    }
    if (20374319 * 1 == +a)
    {
        printf("test7\n");
    }
    int zero = 0;
    if (!zero)
    {
        printf("test8\n");
    }
    // if (!(a == b && a != b))
    // {
    //     printf("test9\n");
    // }
    return 0;
}