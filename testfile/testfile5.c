/*
 * @Date: 2023-09-17 16:08:36
 * @Author: Q9K
 * @Description:
 */
#include "libsysy.h"
// 逻辑运算
int max(int a, int b)
{
    if (a > b)
        return a;
    else
        return b;
    return a;
}
int main()
{
    for (;;)
    {
        for (;;)
        {
            break;
        }
        if (1)
            break;
        else
        {
            return 0;
        }
    }
    printf("20374319\n");
    if (!(1 > 2))
    {
        printf("! op\n");
    }
    if (1 < 2 && 2 > 1)
    {
        printf("> <op\n");
    }
    if (1 >= 2 || 1 <= 2)
    {
        printf(">= <=op\n");
    }
    if (1 == 1)
    {
        printf("== op\n");
    }
    if (1 != 2)
    {
        printf("!= op\n");
    }
    int value = +-+1;
    printf("%d\n", value);
    value = max(1, 2);
    printf("%d\n", value);
    return 0;
}