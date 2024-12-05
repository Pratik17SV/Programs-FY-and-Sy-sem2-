#include<stdio.h>

void main()
{
    int a=2;
        int b=3;
        int c=1;
        if(b<a)
        {
            if(b<c)
            {
            printf("The number %d is smaller.",b);
            }
            else
            {
                printf("The number %d is smaller.",c);
            }
        }
        else if(a<c)
        {
            printf("The number %d is smaller.",a);
        }

}