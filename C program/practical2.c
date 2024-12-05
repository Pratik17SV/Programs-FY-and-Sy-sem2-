#include<stdio.h>
#include<conio.h>
void main()
{
    int n,avg,sum=0,count=0;
    printf("Enter the number:");
    while(1)
    {
        scanf("%d",&n);
        if(n==99)
        {
            break;
        }
        else
        {
            sum=sum+n;
            avg=sum/n;
            count++;
        }
    }
    if(count>0)
        {
            printf("The sum is %d.",sum);
            printf("The avrage is %d",avg);
        }
        getch();
}