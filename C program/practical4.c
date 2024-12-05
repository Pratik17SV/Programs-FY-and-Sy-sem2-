#include<stdio.h>
#include<conio.h>
void main()
{
    int n,temp,sum=0,rem=0;
    printf("Enter the number:");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
    }
    if(temp==sum)
    {
        printf("%d is Amstrong number.",temp);
    }
    else
    {
        printf("%d is Astmorng not number.",temp);
    }
    getch();
}